package single;

public class Taxi {
	public static void main(String[] args) {
		f1();
		f2();
	}
	
	static void f1() {
		Bridge b1 = Worker.getInstance();
		System.out.println(b1);
	}
	static void f2() {
		Bridge b2 = Worker.getInstance();		
		System.out.println(b2);
	}

}
