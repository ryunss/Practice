package z_0503;

import java.util.Scanner;

public class Main38 {

	public static void main(String[] args) {
		// �ڿ��� n�� �Է¹޾Ƽ� n���� �ٿ� n+1���� ���� Ȥ�� ���ڷ� ä���� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

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
