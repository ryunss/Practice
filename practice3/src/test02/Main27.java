package test02;

import java.util.Scanner;

public class Main27 {

	public static void main(String[] args) {
		//2���� 9������ �� �� 2���� �Է¹޾� �Է¹��� �� ������ �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//�� �ݵ�� ���� �Էµ� ���� �����ܺ��� �Ʒ��� ���Ŀ� �°� ����Ͽ��� �Ѵ�
		//������ ������ ������ 3ĭ�̴�.
		
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

