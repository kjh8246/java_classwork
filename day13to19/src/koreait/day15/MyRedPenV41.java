package koreait.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//47~59 라인 추가 : 틀린문제를 배열에 저장하고 파일쓰기 합니다.(MyFileRW.java.클래스 사용)


public class MyRedPenV41 {
	
	static ArrayList<MathProblom> addList; //전역변수
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		 
		 
		System.out.println("----------------------------------------------");
		System.out.println("빨간펜 수학 2자리 + - x ÷ 연산문제 풀기");
		System.out.println("----------------------------------------------");
		char op;
		while(true) {
			int cnt=0;
			int ans;
			addList = new ArrayList<>(); //2 반복 시작할때마다 새로운 ArrayList 객체를 만들어 참조
			System.out.print("어떤 문제를 내줄까요? 연산입력 (✔끝내려면 0 입력) -> ");
			op=sc.nextLine().charAt(0);		//charAt(0) 메소드로 입력받은 문자열의 첫번쨰 문자를 저장합니다.
			
			if(op=='0') {		//종료조건을 먼저 검사합니다.
				System.out.println("프로그램을 종료합니다.!!!");
				break;//3
			}else if(!(op=='+' || op=='-' || op =='*' || op =='/' )) {
				System.out.println("잘못된 선택입니다.");
				continue;
			}else { //op는 '+' , '-' , '*' , '/' 중 하나일때만 해당됩니다.
				System.out.println("시작합니다." + op + " 연산 문제 입니다.");
				System.out.print("원하는 문제 갯수 입력하세요. (5 or 10 or 20) -> ");
				int num=sc.nextInt();
				
				//메소드 호출
				cnt = start(num,op);
				
				System.out.println("----------------------------------------------");
				System.out.println("채점 합니다. 맞은 갯수  "+ cnt + " ( " + (100/num)*cnt +" 점)");//4
				System.out.println("::::: 틀린문제 다시보기 :::::");
				//ArrayList를 배열로 변환하는 방법을 찾기
				MathProblom[] maths = new MathProblom[num-cnt];
				//maths = addList.toArray(maths);
				int i=0;
				for (MathProblom prob : addList) {
					if(prob.isCorrect()==false)
						maths[i++]=prob;	//배열에 틀린문제만 담깁니다.
				}
				System.out.println(Arrays.toString(maths));	//변환결과 확인
				
				//틀린문제를 파일에 출력하기 : 파일명 yourmath.txt
				MyFileRW.fileWrite("c:\\dev\\test\\yourmath.txt", maths);
				
				for( MathProblom prob : addList ) {
					if(!prob.isCorrect())	//!prob.isCorrect()
						System.out.println(prob + "  정답 : " + prob.showAnswer());
				}	//for end
			}	//else end	
		}	//while end
		
		System.out.println("::::: The End :::::");
		sc.close();
	}	//main end

	//메소드를 만들어서 수정 , 메소드는 코드재사용과 가독성을 위해서 필요하다.
	static int start(int num,char op) {	//리턴 int ? 맞은갯수(cnt), 인자 int num? 문제갯수, char op? 연산자
		int cnt=0;
		int ans;
		for(int i=0;i<num;i++) {		//힌트 : 100/문제개수 값이 문제1개당 점수 이다.
			MathProblom p1 = new MathProblom(op);
			addList.add(p1);		//새로운 문제를 리스트에 담기
			p1.makeProb(); //문제 만드는 메소드 : 연산종류에 따라 숫자가 다른범위 난수로 만들어집니다.
			System.out.print("문제 "+(i+1)+".  " + p1 +" 답 입력 -> ");
			ans = sc.nextInt();
			sc.nextLine();//ans = sc.nextInt(); 의 마지막 엔터를 입력버퍼에서 가져오기
						//sc.nextInt(); 메소드 실행의 엔터는 다음 sc.nextLine() 메소드에서 가져간다.->오류발생 원인
			if(ans == p1.showAnswer()) {
				cnt++; p1.setCorrect(true);
			}
		} //for end
		
		return cnt;
	}
	
	
}
