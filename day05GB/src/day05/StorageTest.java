package day05;

public class StorageTest {
	// 전역변수는 지역변수와 서로 다른 메모리 영역에 할당되기 때문에 같은 이름으로 선언이 가능하다.
	int num;
	int gdata = 200;
	
	// 살짝 기울어짐(이탤릭체)
	static int sdata = 300;
	
	public static void main(String[] args) {
		StorageTest s = new StorageTest();
		s.f1(10);
		s.f2();
		// 정적 메소드 (static 메모스)에서는 일반 전역변수를 사용할 수 없음.
//		System.out.println(gdata);
		System.out.println(sdata);
	}
	
	// 매개변수도 지역변수의 일종이다.
	void f1(int data) {
		// 지역변수는 직접 초기화하지 않으면 사용할 수 없다.
		int num ;
//		System.out.println(num);
		System.out.println(data);
		num = 100;
		System.out.println(num);
		System.out.println(gdata);
		System.out.println(sdata);
	}
	
	void f2() {
		// 지역변수는 해당 지역에서만 가능하다.
//		System.out.println(num);
		System.out.println(gdata);
		System.out.println(sdata);
	}

}
