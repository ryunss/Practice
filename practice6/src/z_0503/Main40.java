package z_0503;

import java.util.Scanner;

public class Main40 {

	public static void main(String[] args) {
		//1���� 100������ ���� �� �� ���� �Է¹޾� 100 ���� ���� ������� ���ʷ� ����ϴٰ� 
		// 10 �� ����� ��µǸ� ���α׷��� �����ϵ��� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		
		for(int j=1; j<=10; j++)
		{
			if(a*j>100)
			{
				break;
			}
			else if((a*j)%10==0)
			{
				System.out.println(a*j);
				break;
			}
			System.out.print(a*j+" ");
			
		}
	}
}
