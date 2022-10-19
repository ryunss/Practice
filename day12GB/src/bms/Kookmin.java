package bms;

// 1000원 입금시 500원만 입금됨 (나머지는 수수료)
public class Kookmin extends Bank{

	public Kookmin(String account, String pw, String name) {
		super(account, pw, name);
	}

	@Override
	void deposit(int money) {
		super.deposit(money/2);
	}
	
	

}
