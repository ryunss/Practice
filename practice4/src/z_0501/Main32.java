package z_0501;

import java.util.Scanner;

public class Main32 {

	public static void main(String[] args) {
		// �ڿ��� n�� �Է¹ް� 1���� Ȧ���� ���ʴ�� ���س����鼭 ���� n �̻��̸� �� ������ ������ Ȧ���� ������ �� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		int count = 0;
		for(int i=1; i<=n; i++) {
			if(i%2!=0)
			{
				count++;
				sum+=i;
			}
			
			if(sum>=n) {
				System.out.print(+count+" "+sum);
				break;
			}
		}
	}

}
