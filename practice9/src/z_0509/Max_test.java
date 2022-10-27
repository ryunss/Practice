package z_0509;

import java.util.Scanner;

public class Max_test {

	public static void main(String[] args) {
		// 학생 수 학생 점수 입력받아서 최고 점수 및 평균점수를 구하는 프로그램
		boolean run = true;
		int studentNum = 0;
		int scores[] = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			
			int no = Integer.parseInt(scanner.nextLine());
			if(no==1) {
				System.out.print("학생수 > ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			}
			else if(no==2) {
				for(int i=0; i<studentNum; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			}
			else if(no==3) {
				for(int i=0; i<studentNum; i++) {
					System.out.print("scores["+i+"]> "+scores[i]);
					System.out.println();
				}
			}
			else if(no==4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i=0; i<studentNum; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				avg = (double)sum/studentNum;
				System.out.println("최고 점수: "+max);
				System.out.println("평균 점수: "+avg);
			}
			else if(no==5) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 1~5 사이의 번호를 다시 입력하세요.");
				continue;
			}
		}

	}

}
