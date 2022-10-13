package zoo;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}
	
	void cry() {
		System.out.println(name + " 야옹..울기");
	}
	
	void angry() {
		System.out.println(name + "!!!!!!!!!!");
	}
	
}
