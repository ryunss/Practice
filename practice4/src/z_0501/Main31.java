package z_0501;

import java.util.Scanner;

public class Main31 {

	public static void main(String[] args) {
		// 100 ���� ������ ������ �� �ִ� �迭�� �����ϰ� ������ ���ʷ� �Է¹޴ٰ� 0 �� �ԷµǸ� 0 �� �����ϰ� �� ������ �Էµ� ������ ���� ���߿� �Էµ� �������� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[100];
		int start = 0;
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			if(a[i]==0) {
				start = i-1;
				break;
			}
		}
		for(int i=start; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
