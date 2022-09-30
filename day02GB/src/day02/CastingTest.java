package day02;

import java.util.Scanner;

public class CastingTest {

	public static void main(String[] args) {
		/*
		System.out.println('A'+0); // 65
		System.out.println('a'+0); // 97
		System.out.println('0'+0); // 48
		*/
		
//		System.out.println((char)('A'+3)); // D
		
		// 두 정수의 나눗셈 결과를 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		String num1 = sc.next();
		System.out.print("두번째 정수 : ");
		String num2 = sc.next();
		
		int realNum1 = Integer.parseInt(num1);
		double realNum2 = Double.parseDouble(num2);
		double result = realNum1/realNum2;
			
		System.out.println("결과 : "+result); // 3.333333335 <- 실수의 오류.
		
	}

}
