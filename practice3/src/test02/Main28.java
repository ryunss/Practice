package test02;

import java.util.Scanner;

public class Main28 {

	public static void main(String[] args) {
		//�ڿ��� n�� �Է¹ް� 1���� Ȧ���� ���ʴ�� ���س����鼭 ���� n �̻��̸�
		//�׶����� ������ Ȧ���� ������ �� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//ex 100          10 100
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int cnt1 = 0;
		int sum = 0;
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++)
		{
			if(i%2!=0)
			{
				cnt ++;
				cnt1 = cnt;
				sum +=i;
			}
			else if(sum>=100)
			{
				System.out.println(cnt);
				System.out.println(sum);
				System.exit(0);
			}
		}
	}

}
