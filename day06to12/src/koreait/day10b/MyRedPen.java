package koreait.day10b;

import java.util.Random;

public class MyRedPen {

	public static int random(int max,int min) {
		Random r1 = new Random();
		return r1.nextInt(max-min+1)+min;
	}

}
