package koreait.day6;

import java.util.Scanner;

public class StudentScoreTest {

	public static void main(String[] args) {
		//작성자 김재현 0105
		StudentScore score = new StudentScore();
		score.num = 1;
		score.name = "김재현";
		score.korean = 86;
		score.english = 67;
		score.science = 77;
		score.printScore();
		System.out.println("총점 : "+score.sum());
		System.out.printf("평균 : %.2f\n",score.avg());
		
		
		score.inputData();
		
		score.printScore();
		System.out.println("총점 : "+score.sum());
		System.out.printf("평균 : %.2f",score.avg());
		
	}

}
