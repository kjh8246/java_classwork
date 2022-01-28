package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class RealLotto {
	//확률을 반영하여 LottoTest.java 를 새로운 알고리즘으로 구현한다.
	public static void main(String[] args) {
		int[] numbers = new int[45];
		Random r = new Random();
		
		for(int i=0; i<45; i++) {	//인덱스 범위 : 0~44
			numbers[i]=i+1;			//값 범위 : 1~45
		}
		System.out.println("배열초기값----------------------------------");
		System.out.println(Arrays.toString(numbers));
		System.out.println("-------------------------------------------");

		// 1.배열에서 데이터 삭제
		
		int[] lotto = new int[6];
		int k; 	//삭제할 위치의 인덱스-> 랜덤한 값으로 한다.
		
		for(int cnt=0; cnt<6; cnt++) {
			//인덱스 범위를 -1씩 줄이기 위해 난수 발생 범위도 변경한다.
			k=r.nextInt(46-cnt); //경계값을 45(0~44),44(0~43),43(0~42),42(0~41),41(0~40),40(0~39)
			System.out.println("k="+k+",numbers ="+numbers[k]); 	//몇번째 인덱스일까?
			//2. k번째 위치의 데이터를 lotto배열에 저장한다.
			lotto[cnt]=numbers[k];
	
			//1.배열에서 데이터 삭제
			for (int i = k; i < numbers.length-1; i++) {
				numbers[i] = numbers[i+1];			//인덱스 i+1의 배열값을 인덱스 i값으로 변경
			}
			System.out.println(Arrays.toString(numbers));
		}
		
		System.out.print("최종 선택 숫자 : ");
		System.out.println(Arrays.toString(lotto));		//선댁된 순서로 출력
		
		//오름차순 정렬 : 작은값에서 큰값 순서대로 위치를 바꾼다.
		Arrays.sort(lotto);  		//lotto 배열값들을 순서대로 위치 변경합니다.	sort : 오름차순
		System.out.println(Arrays.toString(lotto));		//오름차순으로 출력
		
		/*		값을 지우고 앞에있는 값을 채워넣어서 삭제함 
		k=23; 	//삭제할 위치의 인덱스
		for (int i = k; i < numbers.length-1; i++) {
			numbers[i] = numbers[i+1];			//인덱스 i+1의 배열값을 인덱스 i값으로 변경
		}
		System.out.println(Arrays.toString(numbers));
		
		k=7; 	//삭제할 위치의 인덱스
		for (int i = k; i < numbers.length-1; i++) {
			numbers[i] = numbers[i+1];			//인덱스 i+1의 배열값을 인덱스 i값으로 변경
		}
		System.out.println(Arrays.toString(numbers));
*/	
	}

}
