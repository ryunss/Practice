package z_0502;

import java.util.Random;
import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int ran1 = 0;
		int ran2 = 0;
		int ran3 = 0;
		int password = 0;
		int password1;
		
		while(true)
		{
			System.out.println("1. ���� �߱޹ޱ�");
			System.out.println("2. �Ա��ϱ�");
			System.out.println("3. ����ϱ�");
			System.out.println("4. ������");
			System.out.print("�����Ͻ� ��ȣ�� �Է��ϼ��� : ");
			int a = sc.nextInt();
			
			int ps1;
			if(a==1) {
				ran1 = ran.nextInt(99)+1;
				ran2 = ran.nextInt(9999)+1;
				ran3 = ran.nextInt(9999)+1;
				
				System.out.println("���¹�ȣ�� �����Ǿ����ϴ�.");
				System.out.println(ran1 +"-"+ran2+"-"+ran3);
				
				System.out.print("��й�ȣ�� �Է��ϼ��� : ");
				password = sc.nextInt();
				for(int i=0; i<3; i++)
				{
					System.out.print("��й�ȣ�� �ٽ� �Է��ϼ��� : ");
					password1 = sc.nextInt();
					if(password == password1)
					{
						System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
						break;
					} else {
						if(i==2)
						{
							System.out.println("��й�ȣ 3ȸ ������ ù ȭ������ ���ư��ϴ�.");
							continue;
						}
							System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ���.");
						continue;
					}
				}
			}
			else if(a==2) {
				System.out.print("���¹�ȣ �Է� : ");
				int ran123 = sc.nextInt();
				for(int i=0; i<3; i++)
				{
					System.out.print("��й�ȣ : ");
					ps1 = sc.nextInt();
					if(password==ps1) 
					{
						System.out.println("��¿�����");
					}
				}
			}
			else if(a==3) { }
			else if(a==4) {
				System.out.println("ATM ���α׷��� �����մϴ�.");
				break;
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
		}
	}

}
