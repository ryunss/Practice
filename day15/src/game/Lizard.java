package game;

public class Lizard extends Animal{
	public Lizard(String name, int hp, int feed) {
		super(name, hp, feed);
	}
	//�����ֱ� eat
	public void eat() {
		this.hp +=4;
		super.eat();
	}
	//��å�ϱ� walk
	public void walk() {
		this.hp -=2;
		this.feed +=2;
	}
	
	//����ֱ� play
	public void play() {
		System.out.println(this.name+"�̶� �����!");
		for(int i=0; i<10; i++) {
			System.out.print("�O!");
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
