package koreait.day11;

public class Animal {

		private String color;
		private String name;
		
		//default 생성자 - 출력내용 작성합니다.
		public Animal() {
			System.out.println("Animal새로운 반려동물 가족이 생겼습니다.");
		}
		
		//인스턴스 메소드 - 인스턴스 필드값으로 동작을 한다.
		public void sound() {
			System.out.println("Animal소리를 내는 동물입니다.이름은"+ name);
		}
		
		
		//getter
		public String getColor() {
			return color;
		}
		public void setName(String name) {
			this.name = name;
		}
		//setter
		public void setColor(String color) {
			this.color = color;
		}
		public String getName() {
			return name;
		}
		
		
		
		
}
