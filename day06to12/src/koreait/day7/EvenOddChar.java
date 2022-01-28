package koreait.day7;

import java.util.Scanner;

public class EvenOddChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String scr_String1; 
		String even_string1="";
		String obb_string1="";
		char temp1[];
		String temp2;
		String even_string2="";
		String obb_string2="";
		String scr_string2;
		
		System.out.print("입력->");
		scr_String1 = sc.nextLine();
		temp1 = scr_String1.toCharArray(); //string->char
		
		
		for (int i = 0; i < temp1.length; i++) {
			if(i%2==0)
				even_string1+=temp1[i];		//연산식에 사용될 변수는 초기화 해야함
				
			else
				obb_string1+=temp1[i];
		}
		
		System.out.println("짝수 문자열"+even_string1);
		System.out.println("홀수 문자열"+obb_string1);
		
		System.out.print("입력->");
		scr_string2 = sc.nextLine();
		temp2 = scr_string2;
		
		for (int i = 0; i < temp2.length(); i++) {
			if(i%2==0)
				even_string2+=temp2.charAt(i);
			else
				obb_string2+=temp2.charAt(i);
		}
		System.out.println("짝수 문자열"+even_string2);
		System.out.println("홀수 문자열"+obb_string2);

	}

}





















