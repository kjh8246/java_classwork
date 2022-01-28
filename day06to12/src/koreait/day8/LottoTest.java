package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		//난수 1~46 범위의 값을 중복된 값이 없도록 6개 생성하고 배열에 저장합니다.
		int[] lotto = new int[6];
		Random r1 = new Random();
		boolean isOk=true;
		
		for (int i = 0; i < 6; i++) {		//지역변수는 {     }안에서만 선언가능
			int temp=0;
			isOk=true;		//새로운 i 인덱스로 검사할 때 초기화
			
			while(isOk) {		//다른방법 : isok변수없이 while(true)
			temp = r1.nextInt(46)+1;	//1~46
			System.out.println("만든값 : "+temp);
			int j;
			
			for (j= 0;j<i; j++) {	//j==i 이면 for종료한다
				
				//현재 배열 인덱스 i의 앞에 있는 배열값들과 temp 값을 비교
				if (temp==lotto[j]) {
					System.out.println("*");
					break; //for-j 에서 탈출
							//i는 4로 예를 들면, 1)j가 2의 배열값이 temp와 같다면
							//for-j 탈출 했을때 아래**부분의 조건은  거짓?
							//j=0~3까지 배열값을 배교했을때 모두 temp와 다른 값이면
							//그 때 아래**부분의 조건은 참? 
				}
			}//for - i end
			if(j==i) isOk=false;	//**비교하는 동안 같은 값이 없을때 이다.		j<i 조건으로 for를 반복할때 , j가 i값이 되면 거짓이라 for가 종료되죠.   
									//isok안쓸때 break					//결국 for가 끝나면 그래서 i== j 인것이고요.
																		//같은 값이 있을 때는 break 로 끝나니까요. 그때의 j값은 i보다 작은 값들 중 하나에요.
																		//조건이 j<i 이지만 중간에 break 로 나올수도 있기 때문에 반복횟수는 매번 다른거에요.
																		//j가 i 까지 값이 증가되게 되는거에요. 그 때는 j<i 가 거짓이고요.
																		//이렇게 종료 했을 때가 앞에 값들 중에 같은 것이 없어서 끝까지 비교한 경우입니다.~~
		}//while end
			lotto[i]=temp;
	}//for - i end
		System.out.println(Arrays.toString(lotto));
		
	}

}
