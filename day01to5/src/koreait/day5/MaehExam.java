package koreait.day5;

import java.util.Scanner;

public class MaehExam {
	// 작성자 : 김재현 (2022/01/04)
	public static void main(String[] args) {
		System.out.println("1.덧셈  2.뺄셈 3.곱셈 4.종료");
		
		int calculator, num1, num2;
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산을 선택하세요 ->");
		calculator=sc.nextInt();
		
		if(calculator==4) {
			System.out.println("연산을 종료합니다.");
			break;
		}else if(calculator>4||calculator<0) {
			System.out.println("잘못된 선택입니다.");
			continue;
		}
		
		System.out.print("값1 을 입력하세요 ->");
		num1=sc.nextInt();
		System.out.print("값2 을 입력하세요 ->");
		num2=sc.nextInt();
		if(calculator==1)
			System.out.println("정답"+num1+"+"+num2+"="+(num1+num2));
		else if(calculator==2)
			System.out.println("정답"+num1+"-"+num2+"="+(num1-num2));
		else if(calculator==3)
			System.out.println("정답"+num1+"*"+num2+"="+(num1*num2));
		
		}
		
	}

}
