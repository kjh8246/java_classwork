package koreait.day12;

import java.util.ArrayList;
import java.util.Random;

public class LottoArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<>();	//선택된 숫자 저장
		ArrayList<Integer> balls = new ArrayList<>();	//공 45개 저장하는 리스트 -> 44개 ->43 ...
		Random r = new Random();
		//1. balls리스트에 1~45 숫자를 추가한다.
		for (int i = 0; i < 45; i++) {
			balls.add(i+1);
		}
		
		//확인 : 출력해보기
		System.out.println(balls);
		//2. balls 리스트에서 뽑을 인덱스를 난수 0~44 -> 0~43 -> ... -> 0~39 범위에서 반복합니다.
		//2-1 . 난수인덱스에 해당하는 요소를 lotto 리스트에 추가합니다.
		//2-2 . 뽑힌 난수 인덱스의 요소는 삭제(제거) 합니다.
		int k;
		for (int i = 0; i < 6; i++) {
			
			k = r.nextInt(45-i);
			
			int temp = balls.get(k);
			lotto.add(temp);
			
			balls.remove(k);
			System.out.println("뽑힌 숫자"+lotto);
			System.out.println("현재 공 값들"+balls);
			
			//lotto.add(i,k);
			
		}
			
		//3. 최종 lotto 변수가 참조하는 값을 출력합니다.
		lotto.sort(null);
		System.out.println("오늘의 번호들 : "+lotto);
			
		
	}
	//ArrayList의 중요 메소드 : size() , add() , get() , remove()
	
}
