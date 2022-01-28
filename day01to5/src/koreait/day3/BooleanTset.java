package koreait.day3;

import java.util.Scanner;

public class BooleanTset { //boolean 자료현 연산
	//boolean 자료와 관련된 주요 연산은 관계연산(비교)입니다.
	//-> 관계연산자 : <, >, <=, >=, ==, !=
	//관계연산의 결과 true false

	public static void main(String[] args) {
		
		boolean result; //true of false 저장
		
		result = 10>5;
		System.out.println("결과 : "+ result);
		
		result = 10!=10;
		System.out.println("결과 : "+ result);
		
		int data;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("비교할 값 입력>>");
		data = sc.nextInt();
		
		System.out.printf("비교 결과 data >= 50 : %s\n",data>=50);
		
	}

}
