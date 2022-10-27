package z_0509;

public class ObjectArray1 {

	public static void main(String[] args) {
		Aclass ar[] = new Aclass[3]; // 클래스명 객체배열명[] = new 클래스명[크기];
		
		ar[0] = new Aclass(); // 객체 생성 기능
		
		ar[0].x=100;
		ar[0].f1();
		System.out.println(ar[0].x);
	}
}


class Aclass{
	int x;
	void f1() {
		System.out.println("f1()");
	}
}
