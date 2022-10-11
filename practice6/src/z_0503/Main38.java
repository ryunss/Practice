package z_0503;

import java.util.Scanner;

public class Main38 {

	public static void main(String[] args) {
		// 자연수 n을 입력받아서 n개의 줄에 n+1개의 숫자 혹은 문자로 채워서 다음과 같이 출력하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);

		int n;

		int num = 1;

		char cha = 'A';

		n = sc.nextInt();
		for(int i=0; i<n; i++) 
		{
			for(int j=n; i<j; j--)
			{
				System.out.printf("%d ", num++);
			}
			for(int k=0; k<=i; k++)
			{
				System.out.printf("%c ", cha++);
			}
			System.out.print('\n');	
		}
	}

}
