package abstractTest;

public abstract class Animal {
	public void eat() {
		System.out.println("�θ𿡼� ���ǵ� eat()");
	}
	
	abstract public void play(); // �߰�ȣ�� ������ �ٵ� ���� ���̴�. �̷� �޼ҵ尡 �߻�޼ҵ�
					             // �������� ������ �߻�޼ҵ����� �Ϲݸ޼ҵ����� ������ ���ϱ� ����
								 // abstract �� �տ� ���̸� �� (�߻� Ŭ������ �޼ҵ� �Ѵ�)
}
