package z_0503;

import java.util.Scanner;

public class Main41 {

	public static void main(String[] args) {
		// �ڿ��� n�� �Է¹޾� "��� ��"�� ���� ��µǴ� ���α׷��� �ۼ��Ͻÿ�. 
		// ����! '*'�� '*'���̿� ������ ���� �ٻ��̿��� ������ ����.
		//  *               3 �Է� ���� ��.
		//  **
		//  ***
		//  **
		//  *
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=(n-1); i>0; i--)
		{
			for(int j=i; j>0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
