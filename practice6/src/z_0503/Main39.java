package z_0503;

import java.util.Scanner;

public class Main39 {

	public static void main(String[] args) {
//		���� 20 ���� �Է¹޾Ƽ� �� �հ� ����� ����ϵ� 0 �� �ԷµǸ� 20�� �Է��� ������ �ʾҴ��� 
//		�� ������ �Էµ� �հ� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//		����� �Ҽ��κ��� ������ ������ ����Ѵ�.(0�� �Էµ� ��� 0�� ������ �հ� ����� ���Ѵ�.)		
		
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
