package z_0506;

import java.util.Scanner;

public class Main43 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램을 작성하시오.
		// (입력받을 정수는 1000을 넘지 않는다.)
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int min = 0;
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		min = a[0];
		
		for(int j=1; j<a.length; j++) {
			if (min > a[j]) {
				min = a[j];
			}
		}
		System.out.println(min);
		
	}

}
