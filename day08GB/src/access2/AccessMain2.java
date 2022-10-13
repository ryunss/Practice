package access2;

// 다른 패키지에 있는 클래스를 이용하려면 import가 필요하다
import access1.AccessTest;

public class AccessMain2 extends AccessTest {

	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		
//		System.out.println(at.data1);
		System.out.println(at.data2); 
//		System.out.println(at.data3);
//		System.out.println(at.data4);
		
			
	}
	// AccessTest 상속 준 후
	void f() {
//		System.out.println(data1); (default)
		System.out.println(data4); // protected
	}

}
