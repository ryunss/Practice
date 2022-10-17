package obj;

public class ObjectTest {
	public static void main(String[] args) {
		TestData obj1 = new TestData(10, 11.11);
		TestData obj2 = new TestData(10, 11.11);
		
		System.out.println(obj1.toString());
		// toString 재정의해서 사용
		
		Product p1 = new Product(1, "아이폰14", 2000000);
		Product p2 = new Product(1, "아이폰14", 2000000);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}

}
