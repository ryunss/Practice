package z_0501;

import java.util.Scanner;

public class Main30 {

	public static void main(String[] args) {
		// 10개의 문자를 입력받아서 첫 번째 네 번째 일곱 번째 입력받은 문자를 차례로 출력하는 프로그램을 작성하시오.

		Scanner sc = new Scanner(System.in);
		
		String a[] = new String[10];
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.next();
		}
		
		for(int i=0; i<a.length; i+=3)
		{
			if(i%3==0 && i<=6)
				System.out.print(a[i]+" ");
		}
	}

}
