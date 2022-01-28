package koreait.day10;

public class MyClass2 {	
		//접근 권한 연습
		private int age;	//private : 다른 클래스에서 사용 못한다. 나(현재 클래스)만사용한다.
		String name;		//default(package) : 다른 패키지에서 사용 못한다. 이웃이면 같이쓰자.
		public int score;	//public : 어디서난 사용가능.공공의,공용의... 다같이 쓰지.
	
	// 생성자 메소드 : public,default 에 따라 접근권한 설정할수 있다. 기본생성자메소드 접근권한 public
/*		
	MyClass2() {
		// 이렇게 수정하면 다른 패키지에서 객체 생성을 못한다.
	}
*/
	

}
