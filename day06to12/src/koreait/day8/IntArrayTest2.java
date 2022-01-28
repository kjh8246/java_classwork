package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest2 {
	//int 값 저장하는 배열을 활용하는 연습입니다.-(1)
	public static void main(String[] args) {
		//배열의 값은 난수 1~100 범위값 저장
		Random r1 = new Random();
		//배열의 크기는 20 ->메모리 할당
		int[] score = new int[20];	//값은 안들어 가있지만 방만 만들기
		
		for (int i = 0; i < score.length; i++) {
				score[i]=r1.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(score));	
		int cnt=0;//카운트변수
		//20개 배열의 값 중에서 70이상의 값을 검색 - 인덱스와 값 출력
		for (int i = 0; i < score.length; i++) {
			//scores[0],scores[1],scores[2],scores[3]...scores[19]
			if (score[i]>=70) {
				System.out.println("i="+i+",점수= "+score[i]);
				cnt++;
			}
			
			
		}
		//70이상인가 값의 개수를 출력하려면??
		System.out.println("70이상 값의 개수 : "+cnt);
	}

}
