package game;

public class Cat extends Animal{

	public Cat(String name, int hp, int feed) {
		super(name, hp, feed);
	}
	//먹이주기 eat
	public void eat() {
		this.hp += 2;
		this.feed -= 2;
		super.play();
	}
	//산책하기 walk
	//놀아주기 play
	public void play() {
		System.out.println(this.name+"이랑 노는중!");
		for(int i=0; i<3; i++) {
			System.out.print("야옹!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
		}
		super.play();
	}
	// Animal 클래스에는 없고, 자식에서 새롭게 만든 메소드
	public void onlyCat() {
		System.out.println("야옹야옹~~~~!");
	}
}
