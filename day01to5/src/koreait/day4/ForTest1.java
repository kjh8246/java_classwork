package koreait.day4;

public class ForTest1 { //반복되는 명령들을 실행하는 for문 연습

	public static void main(String[] args) {
		
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");
		System.out.println("hello!");

		System.out.println("hello!(1)");
		System.out.println("hello!(2)");
		System.out.println("hello!(3)");
		System.out.println("hello!(4)");
		System.out.println("hello!(5)");

		for (int i = 0; i < 5; i++) {                 //반복횟수 제어를 위한 변수 i : i=0시작값, 조건 i<5, 증감 i=i+1
			System.out.println("hello!!!!!");         //반복되는 부분
			
		}
		for (int i = 0; i < 0; i++) {                 //조건 i<0 -> 0<0
			System.out.println("헬로우");
			
		}
		for(int i=0;i<5;i++) {
			System.out.println("헬로우! ("+i+")");     //i=0 , 0<5 -> 출력 실행 -> i++
		}
	
		for(int i=0;i<5;i++) {
			System.out.println("*hello!("+i+")");
		}
		int end = 100;
		for (int i = 0; i < end; i+=2) {
			System.out.println("i : "+i);
			
		}
	}

}
