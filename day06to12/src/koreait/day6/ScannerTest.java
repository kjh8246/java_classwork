package koreait.day6;

import java.util.Scanner;

public class ScannerTest {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int a = sc.nextInt();
		System.out.println(a);
		//sc.close();
		testA();
		
	}
	static void testA() {		
		//Scanner sc = new Scanner(System.in);
		//1) 에서  close() 메소드로 해제된 표준입력 Systim.in 을 다시 사용할 수 없습니다. 전역변수로 선언해서 사용합니다.(한번이상 사용x)
		int b = sc.nextInt();
		System.out.println(b);
		//sc.close();
	}
	 @Override
	protected void finalize() throws Throwable {      //객체가 소명(제거)될 때 실행하는 메소드
		// TODO Auto-generated method stub
		 sc.close();
		super.finalize();
	}

}
