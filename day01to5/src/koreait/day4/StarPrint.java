package koreait.day4;

import java.util.Scanner;

public class StarPrint {
	//예제 : 영화 감상 후기 1~5평점 입력방법 방법1)❓❔❓❗❗❗❓❔❓❗❗❗
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int point;
		
		System.out.println("[영화감상 후기]");
		System.out.print("평점을 몇 점 주시겠습니까?(1~5) ->");
		point=sc.nextInt();
		
		System.out.println("방법 1)");
		
		for(int i=0;i<point;i++) {
			System.out.print("❓");
		}

		System.out.println("\n방법 2-1)");
		for(int i=0;i<point;i++) {
			System.out.print("❓");
		}
		for(int i=0; i<(5-point);i++) {
			System.out.print("❗");
		}
		
		System.out.println("\n방법 2-2)");
		for (int i = 0; i < 5; i++) {
			if(i<point)System.out.print("❓");
			else System.out.print("❗");
		}
		
		System.out.println("\n방법 2-3)");
		int k;
		for(k=0;k<point;k++) {
			System.out.print("❓");
		}
		for(;k<5;k++) {
			System.out.print("❗");
		}
		
//		for(int i=0;;i++) {    //조건식이 없음 무한루프
//			System.out.println("test");
//		}
		
	}

}
