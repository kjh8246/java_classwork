package koreait.day11;

public class Puppy extends Animal{
	private String type;
	
	//생성자 생략 가능합니다. - default 생성자 super()호출합니다.
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void test() {
		System.out.println("puppy : test 메소드");
	}
	
	@Override	//@어노테이션은 명령실행에 도움을 주는 주석이다.
	public void sound() {
		System.out.println("멍멍 합니다.");
	}
	
}
