package objectTest;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car(1234);
		Car c2 = new Car(1234);

		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.toString()); // toString 생략되어있던거랑 같음
		System.out.println(c1);
		System.out.println(c2); // 객체가 println 안에 쓰이면 toString() 메소드가 생략된 상태이다.
								// 따라서 toString()을 오버라이딩하면 출력할때의 모양을 설정할 수 있다.
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}

}
