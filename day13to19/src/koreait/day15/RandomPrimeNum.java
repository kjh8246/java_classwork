package koreait.day15;

import java.util.Arrays;
import java.util.Random;

public class RandomPrimeNum {
	static final int NUM=7;
	public static void main(String[] args) {
		// 주어진 난수 범위에서 소수를 7개 만든다. 소수 7개는 배열에 저장하여 출력합니다.
		// -> 주어진 정수값이 소수인지 판별하는 메소드를 만들어 봅시다. (메소드 이름 isPrime, 리턴형식은 boolean, 인자는 정수1개)
		int[] isPrimenum = new int[NUM];
		Random r = new Random();
		
		long start = System.currentTimeMillis();	//현재시간을 ms(0.001초) 단위로 가져옵니다.형식은 long
		
		int cnt=0,max=99999999,min=33333333;
		//주어진 난수 범위에서 소수를 7개 만든다(난수가 소수인지 판별해서 그 값이 7개가 되면 반복종료) 소수 7개는 배열 저장하여 출력
		//범위 100~999 
		
		while(cnt<NUM) {
			int temp = r.nextInt(max-min+1)+min;
			
			if(isPrime(temp)) 
				isPrimenum[cnt++]=temp;
			
		}
		long end = System.currentTimeMillis();
		System.out.println("실행시간="+(end-start)+"ms 소요되었습니다.");	//0ms는 매우 짧은 시간이 걸렸다는 뜻
		System.out.println(Arrays.toString(isPrimenum));
		
	}
		
		
		
	

	// 메소드부터 만들기
	static boolean isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i < Math.sqrt(num); i++) {		//조건은 *i<num , **i<num/2 , ***Math.sqrt(num)
									//num이 소수일때 반복홧수가 가장 작은 조건식은 ? ***Math.sqrt(num) 이다.
			if(num % i == 0) {	//나누어 떨어진다.(나머지가 0)
				isPrime=false;
				break;
			}
		}
		return isPrime;
		
	}

}

