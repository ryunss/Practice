package zoo;

public class Cat extends Animal{

	String name;

	public Cat() {}

	public Cat(String name) {
		this.name = name;
	}
	
	void cry() {
		System.out.println(name + " 야옹..울기");
	}
	
	void angry() {
		System.out.println(name + "!!!!!!!!!!");
	}
	
}
