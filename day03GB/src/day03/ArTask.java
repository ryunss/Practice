package day03;

import java.util.Scanner;

public class ArTask {

	public static void main(String[] args) {
		
		// 5칸 빈 배열 생성 후 1~5 넣어 준 후 출력 ---> {1,2,3,4,5} (X)
		System.out.println("5칸 빈 배열 생성 후 1~5 넣어 준 후 출력 ---> {1,2,3,4,5} (X)");
		int[] arData = new int[5];
		arData[0] = 1;
		arData[1] = 2;
		arData[2] = 3;
		arData[3] = 4;
		arData[4] = 5;
		
		for (int i = 0; i < arData.length; i++) {
			System.out.print(arData[i]+" ");
		}
		System.out.println();
				
		// 5칸 빈 배열 생성후 10,7,4,1,-2 넣어준 후 출력 ---> {10,7,4,1,-2} (X)
		Scanner sc = new Scanner(System.in);
		int[] arData2 = new int[5];
		for (int i = 0; i < arData2.length; i++) {
			System.out.print("정수 입력 : ");
			arData2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arData2.length; i++) {
			System.out.print(arData2[i]+" ");
		}
		System.out.println();
		
		// 사용자에게 정수 3개 입력받아서 전체 출력 후 총 합도 출력
		System.out.print("정수를 3개 입력하세요 : ");
		int[] arData3 = new int[3];
		int sum = 0;
		for (int i = 0; i < arData3.length; i++) {
			arData3[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arData3.length; i++) {
			sum += arData3[i];
			System.out.print(arData3[i]+" ");
		}
		System.out.println();
		System.out.println("총 합 : "+ sum);
		
		// 1,100,7,35,24,17,13,19,57,66 반복문을 통해서 출력
		int[] arData4 = {1, 100, 7, 35, 24, 17, 13, 19, 57, 66};
		
		for (int i = 0; i < arData4.length; i++) {
			System.out.print(arData4[i]+" ");
		}
		System.out.println();
		
		// 사용자에게 국어점수, 수학점수, 영어점수 입력받은 후 전체 점수 출력하고 총점과 평균 츨출력
		// 입력
		// 국어점수 :
		// 수학점수 :
		// 영어점수 :
		
		// 출력
		// 국어점수 : 100점
		// 수학점수 : 90점
		// 영어점수 : 80점
		// 총점 : 270점
		// 평균 : 90.0점
		String[] sub = {"국어점수", "수학점수", "영어점수"};
		int[] score = new int[3];
		double hap = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.print(sub[i]+" : ");
			score[i] = sc.nextInt();
			hap += score[i];
		}		
		System.out.println();
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(sub[i]+" : "+score[i]);
		}
		System.out.printf("총점 : %.0f점 , 평균 : %.2f점 \n", hap, hap/3);
		
		// 사용자에게 과목 수 입력받고, 과목명 입력받은 후 위의 과정 하기
		System.out.print("과목 수를 입력하세요 : ");
		int cnt = sc.nextInt();
		double hap1 = 0;
		
		String[] sub1 = new String[cnt];
		int[] score1 = new int[cnt];
		
		for(int i = 0; i<cnt; i++) {
			System.out.print("과목 명을 입력하세요 : ");
			sub1[i] = sc.next();
		}
		
		for (int i = 0; i < score1.length; i++) {
			System.out.print(sub1[i]+"점수를 입력하세요 : ");
			score1[i] = sc.nextInt();
			hap1 += score1[i];
		}
		System.out.println();
		
		for (int i = 0; i < cnt; i++) {
			System.out.print(sub1[i] + " : " +score1[i]+ "점\n");
		}
		System.out.printf("총점 : %.0f점 , 평균 : %.2f점 \n", hap1, hap1/cnt);

		// 정수타입을 담아줄 빈 배열 하나 생성된 상태로 그 배열에 데이터 추가, 데이터 삭제, 데이터 조회, 데이터 수정할 수 있는 프로그램 구현
//		Scanner sc = new Scanner(System.in);
//		int cnt = 0;
//				
//		while(true) {
//			int[] arr = new int[cnt];
//			int[] sub = arr;
//			int choice = 0;		
//			System.out.println("1. 데이터추가, 2. 데이터삭제, 3. 데이터조회, 4. 데이터수정, 5. 종료");
//			System.out.print("입력 : ");
//			choice = sc.nextInt();
//			if(choice == 5) {
//				break;
//			}
//			switch(choice) {
//			case 1:
//				cnt++;
//				arr = new int[cnt];
//				arr[cnt-1] = sc.nextInt();
//				break;
//			case 2:
//			case 3:
//				for(int i=0; i<sub.length; i++) {
//					System.out.print(sub[i]+" ");
//				}
//				System.out.println();
//				break;
//			case 4:
//			}
//		}
		
	}

}
