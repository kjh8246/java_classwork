package koreait.day3;

import java.util.Scanner;

public class ElseIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int point;
		Scanner sc = new Scanner(System.in);
		System.out.print("포이트 입력하세요->");
		point = sc.nextInt();
		
		
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
		sc.close(); //Scanner 타입 변수 사용 종료
		//리소스(자원) : 입출력 클래스는 메모리 등 추가적인 자원을 사용하므로 헤제가 필요하다.
	}

}
