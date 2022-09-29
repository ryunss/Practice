package game;

public class Dog extends Animal{

	public Dog(String name, int hp, int feed) {
		super(name, hp, feed);
	}
	
	//�Ա�. �θ� ���ǵ� �޼ҵ� �״�� ���.
	//��å�ϱ�
	@Override
	public void walk() {
		this.hp -= 2;
		super.walk();
		/* this.hp -= 3; this.feed++; this.show(); < ������ show�� �����̺��̶� ����. ��������� �ۺ����� �ٲٸ� �� */
	}
	//����ֱ�
	@Override
	public void play() {
		System.out.println(this.name+"�̶� �����!");
		for(int i=0; i<5; i++) {
			System.out.print("�۸�!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		super.play();
	}
	
}
