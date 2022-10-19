package bms;

// 잔액조회시 잔액 절반
public class Woori extends Bank{

	public Woori(String account, String pw, String name) {
		super(account, pw, name);
	}

	@Override
	void show() {
		this.balance /= 2;
		super.show();
	}
	
	

}
