package multi;

public class E extends C implements A{

	@Override
	public void f() {
		System.out.println("E 클래스의 f()");
	}
	
	void doSomething() {
		A.super.f();
		super.f();
	}
	
}
