package day04;

import java.util.Scanner;

public class NestedFor {

	public static void main(String[] args) {
		// 구구단 출력(1~9) -----1단-----
		System.out.println("구구단 출력(1~9단)");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println("----"+i+"단----");
			for(int j = 1; j <= 9; j++) {
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}
		
		// *****	*		*****	   *				*
		// *****	**		****	   ***			   ***
		// *****	***		***		   *****		  *****
		// *****	****	**		   *******		 *******
		// *****	*****	*		   *********	*********
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
		// *	
		// **  
		// ***
		// ****
		// *****
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
		
		// *****
		// ****
		// ***
		// **
		// *
		
		for(int i = 0; i < 5; i++) {
			for(int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("===============");
		
		// *			0 1 8
		// ***			1 3 6
		// *****		2 5 4
		// *******      3 7 2
		// *********    4 9 0
		
		for(int i = 0; i < 5; i ++) {
			for(int j = 0; j < 9; j++) {
				if(9-(i*2+1) > j) {
					System.out.print("");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("===============");
		//		*
		//	   ***
		//    *****
		//   *******
		//  *********
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<9; j++) {
				if(j<4-i || i+5<=j) {
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		// 0 5
		// 1 6
		// 2 7
		// 3 8
		// 4 9
		System.out.println("===============");
		//*********
		//**** ****
		//***   ***
		//**	 **
		//*		  *
				
		for(int i=0; i<5; i++) {
			for(int j=0; j<9; j++) {
				if(j<5-i || i+4<=j) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// 국어 점수 여러 학생용으로 만들기
		// 학생 수 입력 -> (과목수와 과목명 입력받기) -> 1번째 학생부터 ~ n번째 학생까지의 점수 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요 >> ");
		int std = sc.nextInt();
		System.out.print("과목 수를 입력하세요 >> ");
		int cnt = sc.nextInt();
		
		int result = 0; // 총합
		
		String[] sub = new String[cnt];
		for(int i=0; i<cnt; i++) {
			System.out.print("과목 명을 입력하세요 >> ");
			sub[i] = sc.next();
		}
		
		int[][] score = new int[std][cnt];
		for(int i = 0; i<std; i++) {
			System.out.print(i+1+"번째 학생-----\n");
			for(int j = 0; j<cnt; j++) {
				System.out.print(sub[j]+"점수 입력 >> ");
				score[i][j] = sc.nextInt();
			}
		}
		
		int[] sum = new int[cnt];
		
		// 총 점수의 합계/평균 구하기
		for(int i = 0; i<std; i++) {
			System.out.print(i+1+"번째 학생의 결과-----\n");
			for(int j = 0; j<cnt; j++) {
				sum[i] += score[i][j];
			}
			result += sum[i];
			System.out.printf("총점 : %d점, 평균: %.1f점\n", sum[i], sum[i]/(cnt*1.0));
		}
		System.out.println("전체 학생들의 총 평균 : "+result/(std*cnt*1.0)+"점");
	}	

}
