package bms;

import java.util.Scanner;

// Index : 처음으로 시작되는 곳
public class Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		View v = new View();
		System.out.println("BMS 프로그램입니다.");
		while(true) {
			System.out.println("1. 계좌개설\n2. 로그인\n3. 나가기");
			System.out.print("번호 입력 >> ");
			int choice = sc.nextInt();
			if(choice == 3) {
				System.out.println("안녕히 가세요");
				break;
			}
			switch(choice) {
			case 1:
				v.joinview();
				break;
			case 2:
				v.loginview();
				break;
			}
		}
	}
}
