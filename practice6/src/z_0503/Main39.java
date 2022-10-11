package z_0503;

import java.util.Scanner;

public class Main39 {

	public static void main(String[] args) {
//		정수 20 개를 입력받아서 그 합과 평균을 출력하되 0 이 입력되면 20개 입력이 끝나지 않았더라도 
//		그 때까지 입력된 합과 평균을 출력하는 프로그램을 작성하시오. 
//		평균은 소수부분은 버리고 정수만 출력한다.(0이 입력된 경우 0을 제외한 합과 평균을 구한다.)		
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		int a;
		int cnt = 0;
		
		for(int i=0; i<20; i++) {
			a = sc.nextInt();			
			
			sum+=a;
			
			if(a==0)
			{
				avg = sum/cnt;
				System.out.printf("%d", +sum);
				System.out.print(" ");
				System.out.printf("%.0f", +avg);
				break;
			}
			cnt++;
			
			if(i==19)
			{
				avg = sum/cnt;
				System.out.printf("%d", +sum);
				System.out.print(" ");
				System.out.printf("%.0f", +avg);
				break;
			}
		}
	}
}
