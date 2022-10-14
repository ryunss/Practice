package multi;

public class D implements A, B{

	@Override
	public void f() {
//		A.super.f();
		System.out.println("D 클래스의 f()");
	}

	void doSomething() {
		A.super.f();
		B.super.f();
	}
}
