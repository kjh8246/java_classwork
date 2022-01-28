package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriteTest {
//System.out : 표주출력 (콘솔/모니터 출력)   지금까지 출력은 표준출력입니다. 이제는 파일출력을 연습합니다.
//파일 출력의 기본 : 경로(어디에 있는 파일인지) , 파일명(파일이름)	
	public static void main(String[] args) {
		
		String filename = "C:\\dev\\test\\자바테스트.txt";	//열슬레쉬\는 \\로 해아한다.
		
		//파일객체를 생성합니다.
		File file = new File(filename);		
		
		//file 참조하는 파일객체를 데이터 출력에 사용하기 위한 클래스는 PrintWriter 이다.
		try {	//파일입력 또는 파일출력할때 자바는 꼭 try~ catch 로 처리하도록 한다.
			
			PrintWriter pw = new PrintWriter(file);
			//파일에 쓰기
			pw.println("모모 90 88 79");
			pw.println("사나 80 70 79");
			
			pw.close(); //파일작업 종료 : 줄력버퍼에서 파일로 전송됩니다.
			System.out.println("파일 출력이 완료되었습니다.");
			
		} catch (FileNotFoundException e) {	//파일출력은 파일없으면 자동생성합니다.Exception 안생깁니다.
					//그러나 ... 없는 경로를 지정하면 Exception 생깁니다.
			System.out.println("없는 파일을 선택했습니다.("+e.getMessage()+")");
		}
	}

}
