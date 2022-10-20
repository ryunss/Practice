package zoo;


public class Ground {

	public static void main(String[] args) {
		// 동물 세마리 만들어서 동시에 울게하기
		Dog d = new Dog("개");
		Cat c = new Cat("고양이");
		Pig p = new Pig("돼지");
		
		Thread d1 = new Thread(d);
		Thread c1 = new Thread(c);
		Thread p1 = new Thread(p);
		
		d1.start();
		c1.start();
		p1.start();
	}

}
