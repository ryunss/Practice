package test02;

import java.util.Scanner;

public class Main27 {

	public static void main(String[] args) {
		//2부터 9까지의 수 중 2개를 입력받아 입력받은 수 사이의 구구단을 출력하는 프로그램을 작성하시오.
		//단 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력하여야 한다
		//구구단 사이의 공백은 3칸이다.
		
		 Scanner sc =new Scanner(System.in);
       	 int a = sc.nextInt();
		 int b = sc.nextInt();        
	     
		 if(a<0 || a>10 || b<0 || b>10)
		 {
			 System.exit(0);
		 }
		 
		 for(int i=1; i<10; i++) 
		 {
			 if(a>=b)
			 {
				 for (int j=a; j>=b; j--) 
				 {
					 if(j>b)
					 {
						 System.out.printf("%d * %d = %2d   ",j, i, i*j);						 
					 }
					 else if(j==b)
					 {
						 System.out.printf("%d * %d = %2d", j, i, i*j);
					 }
				 }
			 }
			 else if(b>a)
			 {
				 for (int j=b; j >= a; j--) 
				 {
					 if(j>a)
					 {
						 System.out.printf("%d * %d = %2d   ",j, i, i*j);						 
					 }
					 else if(j==a)
					 {
						 System.out.printf("%d * %d = %2d", j, i, i*j);
					 }
				 }
			 }
			 System.out.println();
	         	     
		 }
	}
}

