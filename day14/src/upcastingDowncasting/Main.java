package upcastingDowncasting;

public class Main {
	
	public static void test(Parent c) { // 공통된 타입으로 관리하기 위함. 삼성 - 전자,전기,생명 등...
										// 삼성의 공통적으로 사용할 수 있는 부분을 익히고 다운캐스팅하면 자식이 정의한 멤버도 사용할 수있게 된다.
										// 확실히 맞는지 다시 확인하기.
	}


	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		Child2 c2 = new Child2();
		
		Object[] ar = {"안녕", p, c, c2}; // String, parent, child, child2 전부 업캐스팅 되고 있는 것.
		
//		ar[1]. <- 업캐스팅했기 때문에 p 에 있는 f1() f2() 사용할 수 없다. 재정의 한 것이 있다면 사용 가능함. 
		
		Main.test(c2);
		Main.test(c);
		
		// 타입
		// p 의 타입을 알고 싶다.
		// 인스턴스 instanceof 클래스 : 인스턴스가 클래스타입이니? 맞으면 true, 틀리면 false
		System.out.println(p instanceof Object);
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof Child);
		
		System.out.println(c instanceof Object);
		System.out.println(c instanceof Parent); // 자식은 부모타입도 된다.
		System.out.println(c instanceof Child);
	
		System.out.println("============================");
		Parent up = (Parent)c;
		System.out.println(up instanceof Object);
		System.out.println(up instanceof Parent);
		System.out.println(up instanceof Child);
	}

}
