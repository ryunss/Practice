package zoo;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	void cry() {
		System.out.println(name+" 멍멍");
	}
}
