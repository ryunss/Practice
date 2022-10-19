package bms;

import java.util.Random;

public class BankManager {
	
	static Bank[][] arUser = new Bank[3][1000]; // 0 국민, 1 신한, 2 우리
	static int[] arCnt = {0, 0, 0}; // 각 은행의 회원수들
	
	String join(int bankChoice, String name, String pw) {
		Random r = new Random();
		
		// 10000 ~ 99999
		// 0 ~ 89999 + 10000 => 10000 ~ 99999
		String account = r.nextInt(90000)+10000+"";
		
		for (int i = 0; i < arCnt.length; i++) {
			for (int j = 0; j < arCnt[i]; j++) {
				if(arUser[i][j].account.equals(account)) {
					account = r.nextInt(90000)+10000+"";
					i = -1;
					break;
				}
			}
		}
		
		switch(bankChoice) {
		case 1:
			arUser[0][arCnt[0]] = new Kookmin(account, pw, name);
			arCnt[0]++;
			break;
		case 2:
			arUser[1][arCnt[1]] = new Shinhan(account, pw, name);
			arCnt[1]++;
			break;
		case 3:
			arUser[2][arCnt[2]] = new Woori(account, pw, name);
			arCnt[2]++;
			break;
		}
		
//		스위치안쓰고도 공통점을 찾아서 이렇게도 가능하다.
//		Bank[] maker = {
//				new Kookmin(account, pw, name),
//				new Shinhan(account, pw, name),
//				new Woori(account, pw, name)
//		};
//		arUser[bankChoice-1][arCnt[bankChoice-1]] = maker[bankChoice-1];
//		arCnt[bankChoice-1]++;
		
		return account;
	}

	public Bank login(String account, String pw) {
		for (int i = 0; i < arCnt.length; i++) {
			for (int j = 0; j < arCnt[i]; j++) {
				if(arUser[i][j].account.equals(account) && arUser[i][j].pw.equals(pw)) {
					return arUser[i][j];
				}
			}
		}
		return null;
	}
}
