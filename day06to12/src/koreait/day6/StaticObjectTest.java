package koreait.day6;

public class StaticObjectTest {

	public static void main(String[] args) {
		System.out.println(VariableTest.fval2);		//1번
		
		VariableTest obj = new VariableTest();		//obj는 객체를 참조하는 변수
		System.out.println(obj.dval);		//2번		
		obj.nonstatic(0);		//2번
		
		//1.클래스이름.메소드 또는 클래스이름.필드 일때, 메소드와 필드는static
		//2.객체(object).메소드 또는 객체.필드 일때 , 메소드와 필드가 static이 아닌것을 사용한다.
		//                                     (static 도 사용할 수 있지만 이 때는 1번과 같이 사용하는것이 좋습니다.)
	}

}
