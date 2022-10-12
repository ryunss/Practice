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
			System.out.println("1. 계좌 발급받기");
			System.out.println("2. 입금하기");
			System.out.println("3. 출금하기");
			System.out.println("4. 나가기");
			System.out.print("실행하실 번호를 입력하세요 : ");
			int a = sc.nextInt();
			
			int ps1;
			if(a==1) {
				ran1 = ran.nextInt(99)+1;
				ran2 = ran.nextInt(9999)+1;
				ran3 = ran.nextInt(9999)+1;
				
				System.out.println("계좌번호가 생성되었습니다.");
				System.out.println(ran1 +"-"+ran2+"-"+ran3);
				
				System.out.print("비밀번호를 입력하세요 : ");
				password = sc.nextInt();
				for(int i=0; i<3; i++)
				{
					System.out.print("비밀번호를 다시 입력하세요 : ");
					password1 = sc.nextInt();
					if(password == password1)
					{
						System.out.println("계좌 개설이 완료되었습니다.");
						break;
					} else {
						if(i==2)
						{
							System.out.println("비밀번호 3회 오류로 첫 화면으로 돌아갑니다.");
							continue;
						}
							System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요.");
						continue;
					}
				}
			}
			else if(a==2) {
				System.out.print("계좌번호 입력 : ");
				int ran123 = sc.nextInt();
				for(int i=0; i<3; i++)
				{
					System.out.print("비밀번호 : ");
					ps1 = sc.nextInt();
					if(password==ps1) 
					{
						System.out.println("출력오케이");
					}
				}
			}
			else if(a==3) { }
			else if(a==4) {
				System.out.println("ATM 프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
	}

}
