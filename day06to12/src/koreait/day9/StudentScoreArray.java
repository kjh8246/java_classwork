package koreait.day9;

import java.text.DecimalFormat;

public class StudentScoreArray {

	public static void main(String[] args) {
		StudentScore[] iclass = new StudentScore[5];
		//iclass 배열이 저장하는 값은 무었일까?
		
		//출력확인
		for (int i = 0; i < iclass.length; i++) 
			System.out.println(iclass[i]);
		//아직 참조한는 겍체가 없습니다. -> null
		
		iclass[0] = new StudentScore();		//객체를 먼저 생성하지 않으면		//객체를 생성해서 배열요소가 참조합니다.
		iclass[0].inputData();				//->null pointer 오류발상한다.
		
		//반복문으로 객체를 3개 만들어 인덱스 1~3배열요소가 참조하도록 한다.
		for (int i = 1; i <= 3; i++) {
			iclass[i] = new StudentScore();
			iclass[i].inputData();
		}
		
		iclass[4] = new StudentScore();
		System.out.println("객체 생성하고 필드값은 없는 경우 : ");
		iclass[4].printScore();
		
		//입력&배열저장된 객체에서 name 필드만 모두 출력해본다.
		System.out.println("학생 명단:");
		for (int i = 0; i < iclass.length; i++) {
				System.out.print("\t"+iclass[i].name);
		}
		System.out.println();
		//학생이름 - 총점, 평균 형식으로 출력
		for (int i = 0; i < iclass.length; i++) {
			DecimalFormat df = new DecimalFormat("###.00");		//출력형싱을 지정합니다.#하나가 1자리수
			String avg = df.format(iclass[i].avg());			//출력형식을 적용하여 문자열로 변환합니다.
			System.out.println(iclass[i].name+"-총점:"+iclass[i].sum()+",평균:"+avg);
		}
		
		//printScore()메소드 출력
		for (int i = 0; i < iclass.length; i++) {
			iclass[i].printScore();
		}
	}

}
//지역변수는 초기값이 자동으로 설정되지 않는다
//전역변수(클래스필드)는 초기값이 참조타입은 null , 기본형타입은0 또는 0.0 자동으로 저장된다.,