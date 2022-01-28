package koreait.day7;

import java.util.Scanner;

public class UpperLowerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message="";
		String upper;
		String lower;
		int k=0,j=0;
		
		char[] uppers = new char[20];	//문자 조작한값을 문자열에 연결시키지 않고 , 배열에 하나씩 저장하려고 하는거에요

		char[] lowers = new char[20];
		
		System.out.println("영어입력 : ");
		message = sc.nextLine();
		
		for (int i = 0; i < message.length(); i++) {
				char temp=message.charAt(i);
			if(temp >='A' && temp <='Z') {  //A~Z범위 검사
					uppers[k]=temp;
					k++;
			}
			else if(temp >= 'a' && temp <= 'z') {  //a~z범위 검사
					lowers[j]=temp;
					j++;	// 다음 소문자가 저장될 인덱스 증기
			}
		}
		upper = String.valueOf(uppers);
		lower = String.valueOf(lowers);
		
		System.out.println("\n[[결과]]");
		System.out.println("짝수 문자열 : "+upper);
		System.out.println("홀수 문자열 : "+lower);
			

	}

}
