package game;

public class Cat extends Animal{

	public Cat(String name, int hp, int feed) {
		super(name, hp, feed);
	}
	//�����ֱ� eat
	public void eat() {
		this.hp += 2;
		this.feed -= 2;
		super.play();
	}
	//��å�ϱ� walk
	//����ֱ� play
	public void play() {
		System.out.println(this.name+"�̶� �����!");
		for(int i=0; i<3; i++) {
			System.out.print("�߿�!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println();
		}
		super.play();
	}
	// Animal Ŭ�������� ����, �ڽĿ��� ���Ӱ� ���� �޼ҵ�
	public void onlyCat() {
		System.out.println("�߿˾߿�~~~~!");
	}
}
