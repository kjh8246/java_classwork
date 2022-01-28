package koreait.day5;

public class WhileTest {

	public static void main(String[] args) {
		System.out.println("for 출력");
		for(int i=0;i<5;i++) {
			System.out.println("헬로우! ("+i+")");     //i=0 , 0<5 -> 출력 실행 -> i++
		}
		
		
		//while 반복문
		System.out.println("\n while 출력1");
		int j=0;
		while(j<5) {
			System.out.println("헬로우! ("+j+")");
			j++;
		}
		//while 종료 후 j=5
		System.out.println("\n while 출력2");
		while(true) {
			System.out.println("하이자바"+j);
			j++;
			if(j==100) break;	//탈출
		}
		
		System.out.println("\n while 출력3");
		boolean isOK=true;
		while(isOK) {
			System.out.println("j="+j);
			for(int i=0;i<5;i++) 
				System.out.print("\t"+i);
			
			System.out.println();
			
			j++;
			if(j==105) isOK=false;//while 종료
		}
		
		

	}

}
