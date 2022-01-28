package koreait.day3;

import java.util.Scanner;

public class JumsuTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int korean, english, science;
		
		System.out.print("국어-->");
		korean = sc.nextInt();
		System.out.print("영어-->");
		english = sc.nextInt();
		System.out.print("과학-->");
		science = sc.nextInt();
		
		int sum = korean+english+science;
		System.out.println(">>처리되었습니다.");
		System.out.printf("총점 : %d\n",sum );
		System.out.printf("평균 : %d (%.2f) , 과목수 : %d\n",sum/3,(double)sum/3,3);
		//두변째 서식을 강제 casting 이 필요하다.
		//->나눗셈 결과 실수가 되려면 적어도 1개가 실수형식이어야 한다.
		sc.close();
		
		
		
	}

}
