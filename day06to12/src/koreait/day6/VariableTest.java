package koreait.day6;

public class VariableTest {
	//변수가 선언되는 위치로 특성을 이해하는 연습
	//static final키워드 이해하기
	
	final int fval=23;
	static final int fval2 = 456;     //값을 변경할 수 없는 변수 : 상수
//	final int test;               //final 변수는 꼭 초기앖을 저장해야한다.
	
	static int gval =100;  //클래스 소속으로 선언된 변수(필드), 위치로 보면 전역(global)변수
	int dval=123;
	
	public static void main(String[] args) {
		
		//1. while,for,if.. {  } 블럭 안에서 선언된 변수 : 지역변수 
		//2. method {  } 블록 안에서 선언된 변수 : 지역변수
		
		int sum=100;
		
		while(true) {
			int k=12;
			System.out.println("k="+k);
			if(k==12) break;
			System.out.println("sum="+sum);  	//main 메소드{  } 안에서 어디에서나 사용가능
		}
		
//		System.out.println("k="+k);	//오류: 선언된{ } 지역을 벗어났습니다.
		System.out.println("전역변수 gval="+gval);
		
		System.out.println("final 변수 fval2= "+fval2);
		// fval2=123;         //final변수는 값을 변경 못한다.
		//static final 예시
				System.out.println("Byte 정수의 크기 : "+Byte.BYTES);
				System.out.println("Byte 정수의 최소값 : "+Byte.MIN_VALUE);
				System.out.println("Byte 정수의 최대값 : "+Byte.MAX_VALUE);
				
				//상수 : 의미있는 값(변하지 않는 값) 들을 이름으로 포기
				//클래스의 일반적으로 개본형 상수필드를 대문자로 표기합니다.
				methodA(3);
				//nonstatic(3);	static 없음
		
	}//main end
	
	//3. 메소드 인자로 선언된 변수 : 해당 메소드 { } 안에서 사용하는 지역변수
	static void methodA(int a) {
		int b=3;			//methodA() 의 지역변수
		System.out.println("b="+b);
	}
	
	void nonstatic(int a) {
		System.out.println("전역변수 dval="+dval);
		System.out.println("전역변수 gval="+gval);
		
		System.out.println(fval);
	//	fval=100;  	//favl변수는 값을 변경할 수 없다. -> 오류
		
		
	}
	//static 에서는 -> static 만 사용가능
	//nonstatic 에서는 static, nonstatic 둘다 사용, *nonstatic 은 static 키워드가 없는것
}















