package koreait.day3;

public class LogicalOPTest { //논리연산 연습
	//논리연산 : and(&&) , or(||) , not (!) -> 연산결과는 boolean 타입이다.
	// -> 관계연산을 복합적으로 검사할때 사용
	public static void main(String[] args) {
		// 응용 : 국어점수 90이상이고 총점이 250이상이면 국어 특기 우수 학생
		int korean, sum;
		
		korean = 92;
		sum = 250;
		
		if(korean >=90 && sum >= 250) 
			System.out.println("국어 특기 우수 학생");
		
		//else 없는 if 형식
		// : 국어점수가 80점 이상이거나 총점이 200점 이상이면 pass
		korean=87;
		sum=190;
		
		if(korean >=80 || sum >= 200)
			System.out.println("Pass!!!");
		
		System.out.println("끝");
		System.out.println("논리연산 결과 확인하기 : and");
		System.out.println(" true and true = " + (true && true));
		System.out.println(" false and true = " + (false && true));
		System.out.println(" true and false = " + (true && false));
		System.out.println(" false and false = " + (false && false));
		

		System.out.println("논리연산 결과 확인하기 : or");
		System.out.println(" true and true = " + (true || true));
		System.out.println(" false and true = " + (false || true));
		System.out.println(" true and false = " + (true || false));
		System.out.println(" false and false = " + (false || false));

		System.out.println("논리연산 결과 확인하기 : not");
		System.out.println(" not true = " + !true);     //true 값을 반대(not)값으로 바꿈
		System.out.println(" not false = " + !false);
		
		//Quix : korean 국어점수가 40~69 인 학생들은 "선생님 면담" 출력합니다.
		korean = 40;
		if(korean>=40 && korean<70)
			System.out.println("선생님 면담");
		
		korean = -1;
		
		// korean 국어점수가 0~100 이 아닌값
		if(!(korean>=0&&korean<=100))
			System.out.println("잘못된 값1");
		
		if(korean>100||korean<0)
			System.out.println("잘못된 값2");
		
		
		
		
		
		
		
	}

}
