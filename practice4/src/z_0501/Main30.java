package z_0501;

import java.util.Scanner;

public class Main30 {

	public static void main(String[] args) {
		// 10���� ���ڸ� �Է¹޾Ƽ� ù ��° �� ��° �ϰ� ��° �Է¹��� ���ڸ� ���ʷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		Scanner sc = new Scanner(System.in);
		
		String a[] = new String[10];
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.next();
		}
		
		for(int i=0; i<a.length; i+=3)
		{
			if(i%3==0 && i<=6)
				System.out.print(a[i]+" ");
		}
	}

}
