package z_0503;

import java.util.Scanner;

public class Main37 {

	public static void main(String[] args) {
		// 자연수 n( 3 <= n <= 10) 을 입력받아 다음과 같이 영문자를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char ch = 'A';
		
		for(int i=n; i>0; i--)
		{
			for(int j=i; j>0; j--)
			{
				System.out.printf("%c", ch);
				ch++;
			}
			System.out.println();
		}
	}

}
