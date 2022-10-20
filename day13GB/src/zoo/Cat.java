package zoo;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	void cry() {
		System.out.println(name+" 야옹");
	}
}
