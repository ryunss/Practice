package z_0507;

import java.util.Scanner;

public class Main44 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와 100 이상의 수 중 
		// 가장 작은 수를 출력하는 프로그램을 작성하시오.
		// (입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 없을 때에는 100 을 출력한다.)
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