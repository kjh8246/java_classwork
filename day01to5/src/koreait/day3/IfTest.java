package koreait.day3;

import java.util.Scanner;

public class IfTest { //boolean 자료형과 관계연산을 이용한 조건 제어 연습

	public static void main(String[] args) {
		//if 문의 형식1 : if(조건관계식) {   A   } else{  B   }
		//       A 는 조건관계식이 참일때 실행하는 명령문들
		//       B 는           "        거짓일때       "
		// 		A,B 가 명령문이 1개일 때는 { } 생략한다.
		
		//응용 : point 가 100점 이상이면 회원등급 VIP , 100점 미만일때 일반회원
		
		int point;
		Scanner sc = new Scanner(System.in);
		System.out.print("포이트 입력하세요->");
		point = sc.nextInt();
		
		//if이용
		System.out.print("회원등급 : ");
		if(point>=100) 
			System.out.println("VIP");
		else
			System.out.println("일반회원");
		
		//실행할 명력이 2문장 이상일때{ } 사용.
		if(point>=70) {
		//	point = point+100;
			point +=100;
			System.out.println("감사합니다.");
		}else {
		//	point = point+110;
			point+=110;
			System.out.println("😉😉또 오세요.");
		}
		System.out.println("😁😁현재 포인트 : "+point);
		
		//if 문의 형식2 : if(조건관계식1) {   A   } else if(조건관계식2){  B   } else{     c     }
		
		//응용 : point 가 150 이상이면 사과세트를 , 100~149 이면 귤세트 , 
		//				50~99 이면 과자세트를 , 0~40이면 5000원 상품권
		
		System.out.print("설날 증정선물 : ");
		
		if(point>=150) {
			System.out.print("사과세트");
		}else if(point >=100) {
			System.out.print("귤세트");
		}else if(point >=50) {
			System.out.print("과자세트");
		}else {
			System.out.print("5000상품권");
		}
		
		
		
		
		
		
	}

}
