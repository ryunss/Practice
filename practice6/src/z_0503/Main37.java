package z_0503;

import java.util.Scanner;

public class Main37 {

	public static void main(String[] args) {
		// �ڿ��� n( 3 <= n <= 10) �� �Է¹޾� ������ ���� �����ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
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
