package z_0501;

import java.util.Scanner;

public class Main33 {

	public static void main(String[] args) {
		// 자연수 n을 입력받아서 n줄만큼 다음과 같이 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
