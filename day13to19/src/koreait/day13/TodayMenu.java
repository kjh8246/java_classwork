package koreait.day13;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TodayMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
								//value 투표수 카운트하고 저장합니다.
				
		System.out.println("투표합시다,!!");
		String foods = "오늘의 저녁 메뉴 : 치킨, 떡볶이, 곱창전골, 오징어물회, 불고기";
		
		map.put("치킨", 0);
		map.put("떡볶이", 0);
		map.put("곱창전골", 0);
		map.put("오징어물회", 0);
		map.put("불고기", 0);
		
		while(true) {
			int temp;
			System.out.println(foods);
			System.out.print("선택메뉴 음식명 입력하세요.(종료 : end) -> ");
			String menu = sc.nextLine();
			//문자열 동응비교 메소드 equals
			if(menu.equals("end")) break;		//종료조건
			
			if(map.containsKey(menu)==false) {	//key값으로 없는 문자열이 입력된 경우 -> !map.containsKey(menu)
				System.out.println("없는 메뉴를 선택했습니다. 메뉴에 추가합니다.~!!");
				//continue;
				map.put(menu, 1);
				foods +=", "+menu;
			}else {		//현재map에 있는 key 값인경우
			
			//입력한 메뉴가 key값입니다. 해당 key의 value 값을 가져와서 +1 증기시키고 그 값을 map에 변경합니다.
			temp = map.get(menu);		//temp++;
			map.put(menu,++temp);		//이미 있는 key 의 value 값을 변경
			//map.put(menu,temp++);	//temp값을 put메소드로 저장 -> temp +1증가     저장한뒤 증가하면 아무소용없음
		// map.put(menu,temp)  -> temp++;
			
			//map.put(menu,++temp);	//temp +1 -> temp값을 put메소드로 저장 
			//   -> temp++;		map.put(menu,temp);
			//결론 : ++ 또는 -- 연산은 다른 메도스 또는 연산자 또는 출력문...과 같이 쓰일때 위치에 따라 먼저 또는 나중에 실행
			//	위치에 따라 앞(전치, prefix) 뒤(후치, postfix) 연산자 용어 기억
				}			
			System.out.println("현재 투표상황 : "+map);	
		}
		
		System.out.println(":::::투표종료:::::");
		System.out.println("최대 득표수 : "+Collections.max(map.values()));	//value 중에 가장 큰값(최대값)
		System.out.println("테스트 : "+Collections.max(map.keySet()));	//키값정렬시 최대값
		
		//Collections 의 종류 : List(ArrayList) , Map(HashMap,TreeMap) , Set(HashSet) : 집합, 이터레이터
		
	}

}














