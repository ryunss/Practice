package test02;

import java.util.Scanner;

public class Main26 {

	public static void main(String[] args) {
		/*
		 * ������ �Է¹޾� ������ ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		 * ')'�� '('���̿� ������ 1ĭ �ִ�. (1,_1) ó�� ����Ѵ� : '_'�� ����
		 */	

	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();
	
		for(int i=1; i<=a; i++)
		{
			for(int j=1; j<=a; j++)
			{
				if(j<a)
				{
					System.out.printf("(%d, %d) ",i,j);
				}
				else if(j==a)
				{
					System.out.printf("(%d, %d)",i,j);
					System.out.println();
				}
			}
		}

	}
	

}
