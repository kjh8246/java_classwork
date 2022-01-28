package koreait.day9;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
//김재현
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int random = r.nextInt(200) + 100;
		int i = 0;
		System.out.println(random);
		System.out.println("숫자 맞추기 게임 시작합니다.  나 컴퓨터는 숫자를 결정했습니다. ");
		while (true) {
			if(num.length==i) {
				System.out.println("실패");
				break;
			}
			
			System.out.print("생각한 숫자 입력->");
			num[i] = sc.nextInt();

			if (num[i] == random) {
				System.out.print("딩동댕 맞추셨습니다. 지금까지 시도한 값 ");
				for (int j = 0; j < num.length; j++) {
					System.out.print(num[j]+", ");
				}
				System.out.println((i+1) + "번만에 정답입니다.");
				break;
			} 
			else if (num[i] < random)
				System.out.println("아닙니다. 더 큰값입니다.");
			else
				System.out.println("아닙니다. 더 작은값입니다.");	
			i++;

		}
		

	}

}
