package koreait.day12;

import java.util.ArrayList;

public class MemberArrayList {

	public static void main(String[] args) {
		Member[] members = new Member[10];	//배열 10개 요소에 Member 캑체를 참조시키도록 합니다.
		
		
		
		
		//ArrayList에 클래스 타입객체 추가하기
		ArrayList<Member> mlist= new ArrayList<>();
		
		Member momo = new Member();	//momo변수는 객체의 주소를 저장
		mlist.add(momo);			//그 주소를 mlist 에 추가합니다.
		
		momo.id=20221234;	momo.name="이모모";
		
		System.out.println("momo = "+momo);				// momo변수와
		System.out.println("mlist(0)="+mlist.get(0));	// mlist.get(0) 요소에 저장된 주소값은 같다	//객채의 이름만 써서 출력되는건 toString 생략된것
		
		mlist.add(new Member(20221111,"사나"));
		mlist.add(new Member(20201111,"미나"));
		mlist.add(new Member(20020200,"쯔위"));
		System.out.println("-------------------------------------------");
		for (int i = 0; i < mlist.size(); i++) {
			Member temp = mlist.get(i);
			System.out.println("index="+i+" element="+temp);
		}
		
		mlist.add(1, new Member(19999999,"나연"));	//이모모 나연 사나 미나 쯔위
		mlist.remove(3);							//이모모 나연 사나  쯔위 (인덱스 위치로 삭제
		System.out.println("----------------------------------------------");
		for (int i = 0; i < mlist.size(); i++) {
			System.out.println("index="+i+" element="+mlist.get(i));
		}
		
		mlist.remove(momo);		//객체의 참조값을 전달하여 삭제한다.인자타입이 Object일때 입니다.
		System.out.println("----------------------------------------------");
		for ( Member temp : mlist) {	
			// 변수 i를 사용안할때, 빠른(향상된) for문 - for( 요소타입과 변수명 : 리스트 또는 변수명)
			System.out.println("element="+temp);
		}
	}

}










