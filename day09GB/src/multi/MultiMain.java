package multi;

public class MultiMain {

	public static void main(String[] args) {
		D d = new D();
		E e = new E();
		
		d.f();
		d.doSomething();
		System.out.println("=====");
		
		e.f();
		e.doSomething();
	}

}
