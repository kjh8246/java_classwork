package koreait.day9;

import java.util.Arrays;
import java.util.Scanner;

public class StringArrayTest {
	//문자열(클래스) 배열 연습
	public static void main(String[] args) {

		String[] strArray = {"continue","break","switch","array","print"};	//초기값 지정하며 배열 선언한다.
		
		for (int i = 0; i < strArray.length; i++) 
			System.out.println("i="+i+",문자열="+strArray[i]);
		
//		String 클래스의 메소드 실행 : charAt(0), subString(2,5) 를 각 배열 요소에 문자열 실행합니다.
		for (int i = 0; i < strArray.length; i++) 
			System.out.println("charAt(0) : "+strArray[i].charAt(0)+ " ,subString(2,5)"+strArray[i].substring(2,5));
		
		String[] names = new String[5];		//지정된 문자열이 없으므로 값은 null(없다.) 상태
		for (int i = 0; i < names.length; i++) 
			System.out.println("i="+i+" ,문자열="+names[i]);
		//String 는 클래스, 문자열은 객체->names배열의 주소, names[i]는 문자열 주소 - 둘다 참조(주소)값을 저장한다.
		
//		System.out.println("charAt(0) : "+names[0].charAt(0)+ " ,subString(2,5)"+names[0].substring(2,5));	//문자열이 null일때 charAt등 메소드 실행은 오류 발생
																				//->오류의 명칭(원인)은 NullPointerException
		
		Scanner sc = new Scanner(System.in);	//키보드 입력 준비
		for (int i = 0; i < names.length; i++) {
			System.out.print("이름 입력 하세요. -> ");
			names[i]=sc.nextLine();
		}
		
		//names 배열값 출력.
		for (int i = 0; i < names.length; i++) 
			System.out.println("i="+i+",이름="+names[i]);
		
		System.out.println("charAt(0) : "+names[0].charAt(0)+ " ,subString(2,5)"+names[0].substring(2,5));
		
		for (int i = 0; i < names.length; i++) 
			System.out.println("charAt(0) : "+names[i].charAt(0)+ " ,subString(2,5)"+names[i].substring(2,5));
			
		//names 배열의 영문자를 모두 대문자로 변환하여 names 배열 요소로 참조(지정)하도록 하자
		for (int i = 0; i < names.length; i++) 
			names[i]=names[i].toUpperCase();	//names 배열 요소들이 참조하던 주소가 변경된다.
		
		System.out.println(Arrays.toString(names));
	}

}






















