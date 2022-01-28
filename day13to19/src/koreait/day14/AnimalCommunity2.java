package koreait.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCommunity2 {
	//작성자 : 김재현
	public static void main(String[] args) {
		// AnimalCommunity 클래스 실행내용을 ArrayList 활용하여 구현
		//반려동물 커뮤니티에는 무엇이 필요할까? 용품 공동구매, 반려<동물>분양, .... , <회원>
		
			 
			//동물클래스는 배열에 고양이 객체, 강아지객체, 토끼 객체.. 등을 참조하도록 한다.
			//분양가능한 동물객체를 생성해서 참조하기
			ArrayList<Animal> animals = new ArrayList<>();
			animals.add(new Puppy("브라우니","Brown"));
			animals.add(new Cat("냥이","Black"));
			animals.add(new Rabbit("바니바니","White"));
			animals.add(new Puppy());
			
			
			//회원은 반려동물 분양
			System.out.println("[[환영합니다. 반려동물을 보여드리겠습니다.]]\n");
			for(int i=0;i<animals.size();i++) {
					System.out.println((i+1) + ":" + animals.get(i));	//자식클래스의 toString 재정의 내용으로 실행된다.	//
			}
			
			System.out.println("[[우리동물들의 소리도 들려드리겠습니다.]]");
			for (int i = 0; i < animals.size(); i++) {
				if(animals.get(i)!=null) animals.get(i).sound();	//자식클래스가 구현한 내용으로 실행된다.
			}
			
			//분양을 원하면 회원생성을 합니다.
			Member sana = new Member("사나", 15);
//			System.out.println("분양가능한지 확인 : "+sana.isAdopt(animals[0]));
//			System.out.println("분양가능한지 확인 : "+sana.isAdopt(animals[1]));	//flase
//			System.out.println("분양가능한지 확인 : "+sana.isAdopt(animals[2]));
//			System.out.println("분양가능한지 확인 : "+sana.isAdopt(animals[3]));
			
			
			Scanner sc = new Scanner(System.in);
			System.out.print("분양을 원하는 아이의 숫자를 선택해 주세요. ->");
			int sel = sc.nextInt();
			
			System.out.print("선택하신 " + animals.get(sel)+"는 ");
			if(sana.isAdopt(animals.get(sel-1))) {	//
				System.out.println("분양 가능힙니다.");
			}else {
				System.out.println("아쉽지만 분양 하실수 없는 나이 입니다.");
			}
			
			System.out.println("TYPE 상수 필드 확인합니다.");
			System.out.println(Animal.TYPE);	//static 필드는 속해 있는 클래스로 구별한다.
			System.out.println(Cat.TYPE);
			System.out.println(Puppy.TYPE);
			System.out.println(Rabbit.TYPE);
			
		}
	}


