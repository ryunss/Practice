package z_0507;

import java.util.Scanner;

public class Main44 {

	public static void main(String[] args) {
		// 10���� ������ �Է¹޾� 100 �̸��� �� �� ���� ū ���� 100 �̻��� �� �� 
		// ���� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// (�ԷµǴ� ������ ������ 1�̻� 10,000 �̸��̴�. ���� �ش��ϴ� ���� ���� ������ 100 �� ����Ѵ�.)
		Scanner sc = new Scanner(System.in);
		int min = 9999;
		int max = 0;
		int a[] = new int[10];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			
			
			if(i>0) {
				if (a[i] < 100) {
					max = max < a[i] ? a[i] : max;
				}
				else if (a[i] >= 100) {
					min = min > a[i] ? a[i] : min;
				}
			}
			else if (i==0) {
				if (a[i] < 100) {
					max = a[i];
				} else {
					min = a[i];
				}
			}
			
		}
		if(max == 0) {
			max = 100;
		} else if (min ==9999 ) {
			min = 100;
		}
		System.out.printf("%d %d", max, min);
	}

}