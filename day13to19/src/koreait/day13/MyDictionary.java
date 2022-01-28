package koreait.day13;

import java.util.Scanner;
import java.util.TreeMap;

public class MyDictionary {

	public static void main(String[] args) {

		TreeMap<String, String> map = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		String English;
		String Korean;
		String num;
		System.out.println("선택 기능   1. 단어저장     2. 단어검색     3. 단어장보기    4.프로그램 끝내기");
		boolean run = true;
		while (run) {	//break때매 종료를 못시켜서 run사용
			System.out.print("선택 ✏️->");
			num = sc.nextLine();
			switch (num) {
			case "1":
				System.out.print("English -> ");
				English = sc.nextLine();
				System.out.print("Korean -> ");
				Korean = sc.nextLine();
				if(map.containsKey(English)) {	//존제하는 key값은 value를 ","로 구분하여 저장하기
					String temp=map.get(English);	//Map에 저장되어있는 value 가져오기
					temp +=", "+Korean;
					map.put(English, temp);
				}else
				map.put(English,Korean);
				break;
			case "2":
				System.out.print("English -> ");
				English = sc.nextLine();
				System.out.println("단어장에 검색했습니다. => "+map.get(English));
				break;
			case "3":
				System.out.print(map+"\n");
				break;
			case "4":
				run=false;
				break;
			default:
				System.out.println("잘못 입력된 선택입니다. 1~4입력입니다");
				break;
			}
		}	//while 종료
		System.out.println("::::: 단어장 종료 :::::");

	}

}
