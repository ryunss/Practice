package test02;

import java.util.Scanner;

public class Main28 {

	public static void main(String[] args) {
		//자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 합이 n 이상이면
		//그때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.
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
