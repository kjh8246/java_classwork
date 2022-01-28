package koreait.day2;

public class IntegerVarTest { //정수를 저장하는 변수 연습
	//이 자리에서 선언된 변수는 클래스의 필드가 된다.
	
	//변수 : 메보리에 지정된 값 주에서 변경할 수 있는 데이터를 말한다.
	//     	변수는 프로그램이 실행되는 동안 임시로 사용하는 메모리 공간이다.
	//      데이터가 저장된 메모리에 접근하기 위해서 변수명(식별자)을 부여한다.
	//    	변수 선언한다 -> 변수명과 데이터 형식을 지정하는것.->메모리 공간 할당
	public static void main(String[] args) {
		//지역변수 선언
		byte n1 ; //데이터 형식은 byte, 변수명은 n1
		short n2;
		int n3 ;
		long n4 ;
		
// 변수 선언 할 때에는 기본형 타입 (primitive, 원형) 타입 사용한다.
// byte,short,int,long 소문자로 시작하는 것은 정수 데이터 타입을 표시하는 키워드
		
		// 선언된 변수에 데이터 저장 : 대입문 ( = 기호 사용)
//		n1 = 1884;         오류 overflow 
		n1 = 100;
		n2 = 30000;
//		n2 = 40000;
		n3 = 40000;
//		n3 = 40000000000;
		n4 = 40000000000L;    //Long 형식의 ㅣ데이터는 뒤에 L을 표시한다.
		
		//변수의 사용 : 출력/입력 , 연산 등등
		n3 = n3+100;    //대입연산자 덧셈결과의 값으로 변경됨
		
		System.out.println(" n1 = " + n1);
		System.out.println(" n2 = " + n2);
		System.out.println(" n3 = " + n3);
		System.out.println(" n4 = " + n4);
		
		//short 션산시 주의
		short result;
		//result = n2 + 100;     //100은 기본적으로 int 형식 4바이트 이고 /2n은 short 인데 정수의 사칙연산을 4바이트로 한다.
		
		int result2;
		result2 = n2 + n2;       //32767 + 32787 = ? 정상적으로 int 에 저장가능
		
		
	}

}
