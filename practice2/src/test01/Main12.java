package test01;

import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		// 하나의 정수를 입력받아 1부터 입력받은 정수까지의 짝수를 차례대로 출력하는 프로그램을 작성하시오.
		// 입력되는 정수는 50 이하이다.
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int a = sc.nextInt();
		
		for(i=1; i<=a; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
