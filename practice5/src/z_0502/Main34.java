package z_0502;

import java.util.Scanner;

public class Main34 {

	public static void main(String[] args) {
		// �ڿ��� n�� �Է¹޾Ƽ� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=a; i>0; i--) 
		{
			for(int j=i; j>0; j--) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
		for(int i=0; i<a; i++) 
		{
			for(int j=0; j<(i+1); j++)  
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
