package game;

public class Lizard extends Animal{
	public Lizard(String name, int hp, int feed) {
		super(name, hp, feed);
	}
	//먹이주기 eat
	public void eat() {
		this.hp +=4;
		super.eat();
	}
	//산책하기 walk
	public void walk() {
		this.hp -=2;
		this.feed +=2;
	}
	
	//놀아주기 play
	public void play() {
		System.out.println(this.name+"이랑 노는중!");
		for(int i=0; i<10; i++) {
			System.out.print("꿕!");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
		}
		super.play();
	}
}
