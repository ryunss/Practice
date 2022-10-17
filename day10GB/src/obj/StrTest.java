package obj;

public class StrTest {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		
//		System.out.println(str1 == str2);
//		System.out.println(str1 == str3);
//		System.out.println(str1.equals(str3));
		
		// 동위객체
		Product p1 = new Product(1,"아이폰14",2000000);
		Product p2 = new Product(1,"아이폰14",2000000);
		
		// 동일객체
		Product p3 = p1;
		
		// 개발을 하다 보면 필요에 의해 동위 객체를 동일 객체로 봐야하는 경우가 생기기 때문에
		// 우리가 만든 클래스에서는 재정의를 할 수 있어야한다.
		
		// 매개변수에 Object 타입이 선언되어 있다는 뜻은
		// 아무거나 하나 넘겨 or 객체 하나 넘겨
		System.out.println(p1.equals(p2));
	}

}
