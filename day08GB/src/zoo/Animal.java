package zoo;

public class Animal {
	String name;

	public Animal() {}

	public Animal(String name) {
		this.name = name;
	}
	
	void cry() {
		System.out.println(name + " 울기");
	}
}
