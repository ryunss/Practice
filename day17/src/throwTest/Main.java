package throwTest;

public class Main {

	public static void main(String[] args) {
		Method m = new Method();
		
		try {
			m.setNickName("¹Ùº¸");
		} catch (BadWordException e2) {
			e2.printStackTrace();
		}
		try {
			m.f2();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		try {
			m.f(1);
		}catch(Exception e) {
			
		}
	}

}
