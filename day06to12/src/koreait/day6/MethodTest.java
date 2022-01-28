package koreait.day6;

import java.time.DayOfWeek;

public class MethodTest {
	//클래스(또는 객체) 의 구성 : 필드 메소드
	//-> 메소드를 이해하는 연습이다. 단, 같은 클래스에서 사용된느 경우이다.
	
	//static : 정적인 (고정된) .static 성질끼리 서로 사용가능
	public static void main(String[] args) {
		System.out.println();    //System은 클래스, out은 (객체형)필드, println은 out의 메소드
		
		//메소드 실행 - 메소드 이름 호출합니다.
		testMethod();     //main 메소드의 특징 : static , 실행할수 있는 메소드는 static만 가능합니다.
		testMethod();     //->static는 static 성질을 갖는 요소들만 사용합니다.
//		testMethod2(124, 123);  //오류-> 두번째 인자의 형식이 틀림.
		testMethod2(123, "twice");
		testMethod2(1253, "momo");
		testMethod2(1241, "쯔위");
		testMethod22(1.34, 23, 4.56);
		testMethod22(23, 45, 1.23 );      //인자값 전달할때 자동형변환 된다.
		int result = testMethod3();
		System.out.println(result);
		System.out.println("testMethod3 return = " + testMethod3());
		System.out.println("testMethod3 return 더하기 = " + (testMethod3()+11));  //리턴값 연산
		//반환값(리턴값)이 있는 메소드는 변수를 이용하여 저장 또는 출력은 한다.
		System.out.println(testMethod33());
		
		System.out.println("testMethod4 return = " + testMethod4(34, 64));
		//testMethod44 를 실행해서 리턴값을 변수 d_result 에 저장하고 출력하세요.
		double d_result = testMethod44(1.2, 12);
		System.out.println(d_result);
		dayofweek(3);
		System.out.println("\n요일 출력"+dayofweek1(3));  //반한받은 문자열의 참조값으로 내용(문자열)을 출력
		
		
	}//main end
	

	//1.인자(args), 반환값이 없는(void) 메소드 입니다.
	static void testMethod() {  //메소드 정의 연습1  //메소드와 함수는 성격이 유사하다
		System.out.println("첫번째 메소드 정의 연습입니다.");
	}
	
	//2.인자 있고, 반환값이 없는 메소드 입니다.
	//인자 개수는 제한이 없습니다. 변수 선언과 같은 방식으로 ',' 로 구분합니다. 인자는 메소드 실행에 필요한 데이터이다.
	static void testMethod2(int a, String name) {   //인자2개
		//메소드를 실행할 때는 정수, 문자열 순서에 맞게 값을 지정하고
		//그 값을 a는 정수값, name는 문자열의 참조값을 저장합니다.
		
		System.out.println("정수값="+a);
		System.out.println("name="+name);
	}
	
	//연습예제
	static void testMethod22(double a,int b, double c) {
		System.out.println("인자값 합계 = "+(a+b+c));         //실수값+정수값=실수값
	}
	
	//3. 인자 없고, 반환값이 있는(***반환되는 데이터의 형식***) 메소드 입니다.
	static int testMethod3() {
		return 145;        //반환값이 있는 형식에서는 꼭 있어야 하는 명령문 -> return
	}
	
	//연습- "수요일"을 리턴하는 메소드
	static String testMethod33() {
		return "수요일";
	}
	
	//4.인자 있고, 반환값이 있는 메소드
	static int testMethod4(int a,int b) {
		return (a+b);
	}
	
	static double testMethod44(double a,int b) {
		double result=a+b;
		return result;
	}
	
	//정수값을 전달받습니다.1이면 월요일 2이면 화요일 3이면 수요일 .....7이면 일요일을 리턴하느 메소드
	//리턴하는 메소드->1~7 이외의 값은 "unknown" 리턴하는 메소드
	
	static void dayofweek(int a) {
		
		if(a==1)
			System.out.println("월요일");
		else if(a==2)
			System.out.println("화요일");
		else if(a==3)
			System.out.println("수요일");
		else if(a==4)
			System.out.println("목요일");
		else if(a==5)
			System.out.println("금요일");
		else if(a==6)
			System.out.println("토요일");
		else if(a==7)
			System.out.println("일요일");
		else 
			System.out.println("unknown");
	}
	
	static String dayofweek1(int a) {
		String result="unknown";
		
		switch (a) {
		case 1:
			result="월요일";
			break;
		case 2:
			result="월요일";
			break;
		case 3:
			result="월요일";
			break;
		case 4:
			result="월요일";
			break;
		case 5:
			result="월요일";
			break;
		case 6:
			result="월요일";
			break;
		case 7:
			result="월요일";
			break;
		
	}
		return result;        //result 문자열의 참조값(메모리의 주소)룰 반환한다.
	
}
}

































