package day06;

public class Zoo {

	public static void main(String[] args) {
		// 동물 세마리 만들어서 울게 하기
		CryZoo z = new CryZoo("고양이", 11, "남");
		
		z.eat();
	}

}

class CryZoo{
	String name;
	int age;
	String gender;

	public CryZoo(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	void eat() {
		System.out.println(age+"살"+name+"이(가) 밥먹는중");
	}
	void sleep() {
		System.out.println(name+"이(가) 자는중");
	}
	void cry() {
		System.out.println(name+"이(가) 우는중");
	}
	
	
}













