package wrapper;

public class WrapperTest2 {

	public static void main(String[] args) {
		f(10);
		Integer obj = 20;
		
		f(obj); 
		
		f((Integer)20);
		
		f((Object)30);
		
		f(10.24); // 오토박싱과 업캐스팅이 일어남.
				// 10.24 -> double 타입 -> (Double) 로 오토박싱 -> Object 타입으로 업캐스팅
				// 업캐스팅은 클래스끼리 하는거다
		
		// int 타입의 값을 obj 타입으로 호출하고 싶으면 ?
		Object obj2 = (Integer)10;
		f(obj2);
	}
	
	static void f(int data) {
		System.out.println("int 타입으로 호출한 메소드 : "+data);
	}
	static void f(Integer obj) {
		System.out.println("Integer 타입으로 호출한 메소드 : "+obj);
	}
	static void f(Object obj) {
		System.out.println("Object 타입으로 호출한 메소드 : "+obj);
	}

}
