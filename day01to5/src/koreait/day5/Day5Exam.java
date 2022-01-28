package koreait.day5;

import java.awt.print.Book;
import java.util.Scanner;

public class Day5Exam {   //오늘의 복습문제 구현

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String passwold;
		int upper_cnt=0, lower_cnt=0, numeric_cnt=0, symbol_cnt=0;
		boolean isOk=false;   //passworld 규칙에 맞는지 논리값 저장.
		String message="";       //passworld 규칙 불만족 조건 메지지
		
		
		
		//연산에 사용되는 변수는 반드시 초기값을 저장합니다.
		System.out.println("[[사용자 패스워드 검사]]");
		System.out.print("사용할 패스워드 입력하세요.->");
		
		passwold = sc.nextLine();
		
		if(passwold.length()<8) {
			message=" *) 8글자 이상으로 합니다.";
		}
		
		//추가요구사항 처리
		boolean isUseless=false;
		
		for (int i = 0; i < passwold.length(); i++) {
			//System.out.println(passwold.charAt(i));
			char temp = passwold.charAt(i);
			if(temp >='A' && temp <='Z')
				upper_cnt++;//대문자 개수증가
			else if(temp >= 'a' && temp <= 'z')		
				lower_cnt++;//소문자 개수증가
			else if(temp >= '0' && temp <= '9')
				numeric_cnt++;//숫자 개수증가
			else if((temp>=32&&temp<=47)||(temp>=58&&temp<=64)||(temp>=91&&temp<=96)||(temp>=123&&temp<=126)) {
				 if(temp =='>'||temp =='<'||temp ==')'||temp =='('||temp ==';'||temp =='%'||temp =='\\'||temp ==' ') 
					isUseless=true;
				 else
					 symbol_cnt++;//특수문자 개수증가
				}
		}
		
		
		//추가 요구사항) 사용할수 없는 기호 > < ( ) ; % \ 공백 을 추가해보세요. nextLine() 메소드로 변경합니다.
		
		System.out.println("대문자 개수 : "+upper_cnt);
		System.out.println("소문자 개수 : "+lower_cnt);
		System.out.println("숫자 개수 : "+numeric_cnt);
		System.out.println("기호 개수 : "+symbol_cnt);
		
		if(upper_cnt<1) 
			message +="\n *) 영문대문자 1개 이상으로 합니다.";    //+ 문자열 연결
		if(lower_cnt<1)
			message +="\n *) 영문소문자 1개 이상으로 합니다.";    //+ 문자열 연결
		if(numeric_cnt<1)
			message +="\n *) 숫자 1개 이상으로 합니다.";    //+ 문자열 연결
		//if (!isUseless && symbol_cnt<1)
		if (symbol_cnt<1) 
			message +="\n *) 기호 1개 이상으로 합니다.";    //+ 문자열 연결
		
		if(isUseless)
			message+="사용할수 없는 기호 > < ( ) ; % \\ 공백 이 있습니다.";
			
		if(passwold.length()>=8 &&upper_cnt>=1 &&lower_cnt>=1 &&numeric_cnt>=1 &&symbol_cnt>=1 &&!isUseless)
			isOk=true;
		
			System.out.println(message);
			System.out.println("결과 : "+(isOk? "사용할수 있는 패스워드 입니다." : "패스워드 작성 규칙에 맞지 않습니다."));
										// isOk 참일때         :앞에 문자열 출력, 거짓이면 : 뒤에 문자열 출력
		
		sc.close();
	}
	//불필요한 변수사용 줄이기, 반복되는 코드 제거, 다른사람이 이해하기 쉬운코드 작성
}
