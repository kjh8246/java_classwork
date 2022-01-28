package koreait.day2;

public class ShapeTset {

	public static void main(String[] args) {
		int h = 23, w = 19, area = h*w;
		
		System.out.println("사각형 도형의 넓이 구하기");
		System.out.println("기로 : "+h+"cm");
		System.out.println("세로 : "+w+"cm");
		System.out.println("넓이 : "+(h*w)+"cm^2");
		
		double r = 23, round=2*3.14*r, c_area=3.14*r*r;
		
		
		
		System.out.println("원 도형의 넓이 구하기");
		System.out.println("반지름 : "+r+"cm");		
		System.out.println("둘레 : "+round+"cm^2");
		System.out.println("넓이 : "+c_area+"cm^2");
		
		System.out.println("----------------------");
		System.out.printf("둘레 : %.3f cm^2", round );
		
		
	}

}
