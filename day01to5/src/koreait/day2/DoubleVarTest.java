package koreait.day2;

public class DoubleVarTest {
		// 실수형 타입변수 선언
	public static void main(String[] args) {
		
		//1. 선언
		float p1;
		double p2;
		
		//2. 데이터 저장
		p1 = 3.1415f;  //float 형식으로 데이터를 표시할 때는 f를 표시한다.
		p2 = 3.1415;
		
		//3. 변수 사용
		p2 = p2*1.1;
		//p1 = p1*1.1;   //사칙연산 결과는 double 이다.오류 : double결과를 float 에 저장 못해서
		
		//p2 값 출력 
		System.out.println("변수 p2 = "+ p2); //+연결기호이다.
		System.out.println("변수 p1 = "+ p1); 
		
		//실제 기계어로 실수를 표현하는 연산 방식은 복잡한 형식이 있다. 실제 결과와 다를수 있다.
		System.out.println(0.1+1.6);
		System.out.printf("%5.2f\n",0.1+1.6);    //%f는 실수형식이다. 전체 5자리, 소수점 이하 2자리
		
		//실수의 특별한 연산결과 
		System.out.println("Infinity (무한대) : 0.0으로 나눌때 이다.");
		System.out.println(3.0/0.0);
		System.out.println("NaN(Not a Number) : 0.0과 0.0을 나눌때 입니다");
		System.out.println(0.0/0.0);
		System.out.println("0.0 : 0.0을 다른수로 나눌 때 이다.");
		System.out.println(0.0/3.0);
		
		//정수는? -> 0으로 나눌때 오류가 발생한다
		//System.out.pintln(0/3);
		
		//정수와 비교할 내요 
		short s1 = 11 ;
		//s1 = s1 + s1;  //11+11결과를 s1 에 저장하려고 한다 오류
		
		float f1 = 1.2f;
		f1 = f1 + f1;   //정상
		
		//데이터 형식의 변환 : 캐스팅일고 한다. -> 내일 설명
		
		
		
		
		
	}

}
