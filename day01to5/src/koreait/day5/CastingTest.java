package koreait.day5;

public class CastingTest {

	public static void main(String[] args) {
		short b_val ;
		int i_val = 87;
		long l_val;
		char ch1='s';
		double d_val=7.345;
		
		l_val=234;  //-> 8바이트 = 4비이트
		b_val=23;   //-> 2바이트 = 4바이트 정수는 int4바이트 보다 작은 리터럴 없어서 자도 캐스팅
		i_val=ch1;  //-> 4바이트 = 2바이트
		//b_val=ch1;//-> 2바이트(음우와 양수) = 2바이트(양수값만) -> 오류(강제캐스팅(short)필요)
		d_val=i_val;//-> 8바이트 = 4바이트
		//i_val=d_val;//->4바이트=8바이트->오류 강제캐스팅(int)필요하다
		//작은 바이트에서 큰바이트로 대입하는건 다 가능(char제외)
		
		//*클래스 타입의 변수가 참조하는 데이터는 무었일까? 객체?
		
	}

}
