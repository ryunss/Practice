package day03;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
		
		// 중첩반복문 사용하지 않고 구구단 전부 출력하기
		for (int i = 0; i < 90; i++) {
			// 0 ~ 9 -> 1
			// 10 ~ 19 -> 2
			// 20 ~ 29 -> 3
			int dan = i/10+1;
			
			// 1, 11, 21, 31, 41 ... -> 1
			// 2, 12, 22, 32, 42 ... -> 2
			int gop = i%10;
			
			if(gop == 0) {
				System.out.printf("-----%d단-----\n", dan);
			}else {
				System.out.printf("%d X %d = %d\n", dan, gop, dan*gop);
			}
		}
		
		// 10진수 숫자 입력받아서 2진수로 출력하기
		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.print("정수 : ");
		num = sc.nextInt();
		
		String msg = "";
		for (int i = num; i >=1; i/=2) {
			msg = i%2+msg;
		}
		
		System.out.println(msg);
		
		// ABCDefghIJKLmnopQRSTuvwxYZ 출력하기
		// 0~3 대문자
		// 4~7 소문자
		// 8~11 대문자
		// 12~15 소문자
		String result = "";
		for (int i = 0; i < 26; i++) {
			if((i/4)%2 == 0) {
				result += (char)(i+'A');
			}else {
				result += (char)(i+'a');
			}
		}
		System.out.print(result);
		// 0
		// AbCDefGHIjklMNOPqrstUVWXYz 출력하기
//		String result ="";
//		int cnt = 0; 
//		num = 1;
//		boolean caseType = true;
//		for (int i = 0; i < 26; i++) {
//			if(cnt >= num) {
//				caseType = !caseType;
//				cnt = 0;
//				
//				if(caseType == true) {
//					num++;
//				}
//			}
//			
//			if(caseType) {
//				result += (char)(i+'A');
//			}else {
//				result += (char)(i+'a');
//			}
//			cnt++;
//		}
//		System.out.print(result);
	}
}
