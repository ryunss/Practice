package sleepTest;

public class Main {

	public static void main(String[] args) {
		// sleep() �޼ҵ�,Thread Ŭ���� �ȿ� �ִ� ����ƽ �޼ҵ�, �Ű������� �ʿ�����
		System.out.println("����");
		
		for(int i=0; i<5; i++) {
			System.out.print("!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("��");
	}

}
