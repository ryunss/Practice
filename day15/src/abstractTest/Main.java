package abstractTest;

public class Main {

	public static void main(String[] args) {
		Dog d = new Dog();
//		Animal a = new Animal(); �߻�Ŭ������ ��üȭ�� �Ұ����ϴ�
		
		Animal a =new Dog(); // ��ĳ������ ��
		a.eat();
		a.play();
		
		d.eat();
		d.play();
	}

}
