package koreait.day7;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest {	//정수값 배열 연습
	//배열 : 일반변수는 변수1개에 데이터 1개 저장합니다. 많은 데이터를 저장할때 변수를 많이 선언하지 않고 배열을 사용.
	public static void main(String[] args) {
		//배열 변수 선언
		//1) 초기화
		int[] arr1 = {78,65,89,94};         //[]배열기호,{}배열값을 나열
				//배열의 크기 : 4 (4개*4바이트 = 16바이트)
		//2) 초기화 없이(기본값은 0) 배열의 크기만 정하기
		int[] arr2 = new int[10];
		
		//배열은 객체와 유사한 성격이다. arr1,arr2는 참조변수(배열값들이 저장된 주소를 변수가 저장한다.)
		
		System.out.println("arr1 배열 길이(크기) : "+arr1.length);
		System.out.println("arr2 배열 길이(크기) : "+arr2.length);
		
		//배열데이터의 위치 (숫자0부터 시작): 인덱스, 기호[] 사용합니다.
		System.out.println("arr1 배열 3번째 데이터의 값 : " + arr1[2]);  //89
		System.out.println("arr1 배열 2번째 데이터의 값 : " + arr2[2]);  //0
		
		//arr1 배열의 모든 값을 출력하고 싶다. 배열의 친구 : for문
		for (int i = 0; i < arr1.length; i++) {			// arr1.length는  배열이 크기가 변경되어도 잘 실행될수 있습니다.
			System.out.println("arr1["+i+"] 의 데이터 값 : " + arr1[i]);    //arr[i]는 i번째 위치 배열의 값
		}
		
		//배열 특정위치에 데이터를 저장합니다.	arr2배열 5번째 위치에 78저장
		arr2[4]=78;
		System.out.println("arr2 배열 4번째 데이터의 값 : " + arr2[4]);  //78
		
		Random r1 = new Random();
		
		//1)Random클래스로 1~46범위의 값을 난수로 만들어 arr2배열에 10개 저장하기
		for (int i = 0; i < arr2.length; i++) {
			int num = r1.nextInt(46)+1;
			arr2[i]=num;
		}
		//2)arr2배열의 모든값 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		//***2)array값을 한번에 출력하는 방법 : Arrays 클래스를 사용합니다.
		System.out.println(Arrays.toString(arr2));	//arr2배열의 값으로 문자열 생성하여 반환합니다.
		System.out.println(arr2);			// 출력값 : 해시코드라는 식별값
		//발전방향 : arr2 배열의 난수값 만들때 중복된 값은 제외합니다. 그리고 6개를 한쌍으로 5번 만듭니다. -> Lotto
		
		
	}
	

}



























