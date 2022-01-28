package koreait.day11;

public class AnimalTest {

	public static void main(String[] args) {

		Puppy puppy = new Puppy();
		puppy.sound();
		puppy.setType("pooble");
		System.out.println("puppy type : "+puppy.getType());
		
		Animal dog = new Puppy();	//자식겍체를 부모타입으로 참조할 수 있습니다.		
		dog.sound();
//		dog.test();				//오류: puppy로 만들어진 겍체이지만 참조타입이 Animal입니다.
		
		Puppy test = (Puppy) dog;	//부모타입이고 puppy로 만들어진 객체를 자식타입으로 강제 캐스팅합니다.
		dog.sound();
		test.test();				//dog변수와 test변수가 저장하는 주소는 동일하다
		
//		puppy test = new Animal();	//오류 : 부모객체는 자식 타입으로 참조할 수 없습니다./
		
//		puppy test = (puppy) new Animal();	//Animal객체를 자식타입으로 강제 캐스팅합니다.->오류
//		test.sound();
		
		//Cat cat = new Cat();
		
		
	}

}
