package abstractTest;

public class Main {

	public static void main(String[] args) {
		Dog d = new Dog();
//		Animal a = new Animal(); 추상클래스는 객체화가 불가능하다
		
		Animal a =new Dog(); // 업캐스팅은 됨
		a.eat();
		a.play();
		
		d.eat();
		d.play();
	}

}
