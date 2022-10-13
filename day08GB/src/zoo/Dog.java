package zoo;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	
	void cry() {
		System.out.println(name + " 멍멍..울기");
	}
	
	void sleep() {
		System.out.println(name + "......zZzZ");
	}
}
