package koreait.day4;

import java.util.Scanner;

public class StringTest {  //문자열을 다루는 클래스 String 연습

	public static void main(String[] args) {

		System.out.println("Hi Java");     //첫날수업  
		
		//문자열을 변수로 지정하고 싶다. 그러나 문자열은 int,double 처럼 기본형식이 없고    클래스가 있다.
		
		//name변수는 int,double 기본형 타입이 아니고 *클래스타입 (참조타입) 변수입니다.
		String name = "kim";  //name 변수의 타입은 String(클래스)
		System.out.println("name = " + name);   //    (+)연결 연산자
		
		name = "choi";
		//String 타입의 객체로 실행하는 메소드
		System.out.println("name = " + name);
		System.out.println(name.length());   //4  int타입 반환 , 문자열 크기
		System.out.println(name.charAt(0));  //c  char타입 반환 , 지정된 위치의 문자
		System.out.println(name.charAt(1));  //h
		System.out.println(name.charAt(2));  //o
		char result = name.charAt(3);        //charAt 메소드의 char 반환값 저장을 위한 변수 선언	
		System.out.println(result);          //i
		System.out.println(name.equals("kim"));  //boolean타입반환 , name 가 kim과 같은지 비교
		System.out.println(name.equals("choi")); 
		
		//문자열 입력
		Scanner sc = new Scanner(System.in);
		String nickname;      //String 타입의 객체 즉 문자열을 참조하는 변수 -> nickname
		//nickname = sc.next(); //키보드로 입력 받은 문자열을 메모리에 저장하고 그 주소를 nickname 이 참조합니다.
		nickname = sc.nextLine();
		
		//next 메소드는 공백 또는 엔터 이전 까지만 저장
		//nextLine 메소드는 엔터 이전까지 저장
		System.out.println("nickname = "+nickname);
		System.out.println("nickname = "+nickname.length());
		System.out.println("nickname = "+nickname.equals("Jamesss"));
		System.out.println("일부추출="+nickname.substring(4));  //위치 4부터 끝까지
		System.out.println("일부추출="+nickname.substring(4,6));//위치 4부터 6이전까지(6포함x)
		sc.close();
	}

}
