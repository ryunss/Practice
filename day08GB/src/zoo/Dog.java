package zoo;

public class Dog extends Animal{

	String name;

	public Dog() {}

	public Dog(String name) {
		this.name = name;
	}
	
	void cry() {
		System.out.println(name + " 멍멍..울기");
	}
	
	void sleep() {
		System.out.println(name + "......zZzZ");
	}
}
