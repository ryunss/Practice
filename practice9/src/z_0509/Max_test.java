package z_0509;

import java.util.Scanner;

public class Max_test {

	public static void main(String[] args) {
		// �л� �� �л� ���� �Է¹޾Ƽ� �ְ� ���� �� ��������� ���ϴ� ���α׷�
		boolean run = true;
		int studentNum = 0;
		int scores[] = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("--------------------------------------------");
			System.out.print("����> ");
			
			int no = Integer.parseInt(scanner.nextLine());
			if(no==1) {
				System.out.print("�л��� > ");
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
				System.out.println("�ְ� ����: "+max);
				System.out.println("��� ����: "+avg);
			}
			else if(no==5) {
				System.out.println("���α׷� ����");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 1~5 ������ ��ȣ�� �ٽ� �Է��ϼ���.");
				continue;
			}
		}

	}

}
