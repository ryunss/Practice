package generic;

public class GenericMain {
	public static void main(String[] args) {
/*
		// 1. 제네릭 클래스
		GClassTest<String> obj1 = new GClassTest<String>();
		obj1.f("good");
		
		GClassTest<Integer> obj2 = new GClassTest<Integer>();
		obj2.f(10);
		
		obj1.k();
		obj2.k();

		// 2. 제네릭 메소드
		GMethodTest obj = new GMethodTest();
		obj.<String>f("Hello");
		obj.<Integer>f(10);
		obj.f(true);
		// 제네릭 메소드들은 암묵적으로 타입을 알 수 있는 경우가 대부분이다. 그래서 타입을 안썻는데도 알아서 바뀜
		// 꺽쇠괄호를 이용해서 타입을 직접 적지 않아도 된다.
		obj.f("Hello");
*/		
		// 3. 제네릭 인터페이스
		GInterTest<Integer, Double> obj = new GInterTest<Integer, Double>() {
			
			@Override
			public Double div(Integer num1, Double num2) {
				return num1/num2;
			}
			
			@Override
			public Integer add(Integer num1, Integer num2) {
				return num1+num2;
			}
		};
		
	}
}
