package day07;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// 랜덤한 정수를 가져오는 메소드
		// Random 클래스 안에 있는 nextInt();
		
		Random r = new Random();
		System.out.println(r.nextInt(3)+1);
		
		
	}

}
