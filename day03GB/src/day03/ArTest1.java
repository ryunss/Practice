package day03;

import java.util.Scanner;

public class ArTest1 {

	public static void main(String[] args) {
		int[] arData = {10, 5, 17, 20, 1};	
		
		for (int i = 0; i < arData.length; i++) {
			System.out.print(arData[i]+" ");
		}
		
		System.out.println();
		
		int[] arData2 = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arData2.length; i++) {
			System.out.print("정수 : ");
			arData2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arData2.length; i++) {
			System.out.print(arData2[i]+" ");
		}
	}
}
