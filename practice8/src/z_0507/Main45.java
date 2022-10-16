package z_0507;

import java.util.Scanner;

public class Main45 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
		// 평균은 반올림하여 소수첫째자리까지 출력한다.
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[10];
		int sum = 0;
		int sum2 = 0;
		double avg = 0;
		for(int i=0; i<ar.length; i++) {
			ar[i] = sc.nextInt();
			
			if(i%2 != 0) { // 사람이 보는 2번째랑 컴퓨터가 보는 2번째(0, 1) 다름.
				sum += ar[i];
			}
			else if(i%2 == 0) {
				sum2 += (double)ar[i];
			}
		}
		avg = (double)sum2/(ar.length/2); // 강제 형변환으로 평균을 소수점자리로 나타내기 위함.
		                                  // ar.length/2  => 10개의 입력값중 홀수 값은 평균을 구하기 때문에 sum2/5 가 되어야함.
		System.out.println("sum : " +sum);
		System.out.printf("avg : %.1f", avg );
	}

}
