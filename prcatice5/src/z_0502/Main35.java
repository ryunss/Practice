package z_0502;

import java.util.Scanner;

public class Main35 {

	public static void main(String[] args) {
		// 자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
		//  3             ***
		//				   **
		//                  *

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<(a-i); k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}

}
