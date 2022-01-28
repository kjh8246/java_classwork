package koreait.day7;

import java.util.Scanner;

public class DecipherTest {

	public static void main(String[] args) {
		//내용 : 쯔위가 모모에게 보낸 암호 메시지를 받고 해독해서 확인합니다. 암호메세지 7을 안고있다
		Scanner sc = new Scanner(System.in);
		int key = 7;
		String message="";
		String cypherString;
		char[] temp;		//char[]배열 사용안하고 하는방법 
		
		System.out.print("암호 메시지 입력->");
		cypherString=sc.nextLine();
		
		temp = cypherString.toCharArray();
		
		for (int i = 0; i < temp.length; i++) {
			temp[i]-=key;		//cyperString.charAt(i)
		}						//message += (cyperString.charAt(i))
								//	"" + 'i'+' '+
		
		message = String.copyValueOf(temp);
		System.out.println("모모의 메시지 : "+message);

	}
	// 이예제의 결론 : String 을 char[] 배열로 변환		- 	문자열.toCarArray()
	//				char[] 배열을 String 으로 변환 	- 	String.valueOf(문자배열)
}
