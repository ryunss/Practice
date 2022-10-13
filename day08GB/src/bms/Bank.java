package bms;

public class Bank {
	String account;
	String pw;
	String name;
	int balance;
	
	public Bank(String account, String pw, String name) {
		this.account = account;
		this.pw = pw;
		this.name = name;
		this.balance = 0;
	}

	void deposit(int money) { // 입금
		this.balance += money;
	}
	
	void withdraw(int money) { // 출금
		if(this.balance >= money) {
			this.balance -= money;					
		}
	}
	
	void show() { // 잔액보기
		System.out.println(name+"님 계좌("+account+")\n잔액 : "+balance+"원");
	}
}
