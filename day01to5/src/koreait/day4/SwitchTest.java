package koreait.day4;

import java.util.Scanner;

public class SwitchTest { //if문을 switch문으로 바꾸는 연습

	public static void main(String[] args) {
		System.out.println("[[사용자 메뉴]]");
		System.out.println("1:장바구니  2:상품목록  3:결제  4:배송조회   5:종료");
		System.out.print("선택하세요. -> ");
		
		//import 한번에 하는 단축키 : Ctrl + Shift + o
		Scanner sc = new Scanner(System.in);
		int menu;
		menu = sc.nextInt();
		
		if(menu==1) {
			System.out.println("장바구니로 이동");
		}else if(menu==2) {
			System.out.println("상품목록으로 이동");
		}else if(menu==3) {
			System.out.println("결제화면으로 이동");
		}else if(menu==4) {
			System.out.println("배송조회로 이동");
		}else if(menu==5) {
			System.out.println("프로그램 종료");
		}else {
			System.out.println("잘못된 선택입니다");
		}
		
		System.out.println("[[if문 프로그램 종료]]");
		
		//위의 조건식은 == 비교로 여러개의 else if를 사용한다.
		// -> 이런 경우 switch 문을 사용할수 있다.
		
		switch (menu) {
		case 1: // 비교값으로 사용할수 있는 테이터 형식 : 정수형식, char , String
			System.out.println("장바구니로 이동");
			break;
		case 2:
			System.out.println("상품목록으로 이동");
			break;
		case 3:
			System.out.println("결제화면으로 이동");
			break;
		case 4:
			System.out.println("배송조회로 이동");
			break;
		case 5:
			System.out.println("프로그램 종료");
			break;
		default: // else
			System.out.println("잘못된 선택입니다");
			break;
		}
		System.out.println("[[switch문 프로그램 종료]]");

		sc.close();
		
		
	}
	//들여쓰기 자동 : ctrl + shift + f
}
