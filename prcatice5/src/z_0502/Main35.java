package z_0502;

import java.util.Scanner;

public class Main35 {

	public static void main(String[] args) {
		// �ڿ��� n�� �Է¹޾Ƽ� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//  3             ***
		//				   **
		//                  *

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<(a-i); k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}

}
