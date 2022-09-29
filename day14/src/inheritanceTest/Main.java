package inheritanceTest;

public class Main {

	public static void main(String[] args) {
		Car momCar = new Car();
		System.out.println("---------------");
		SuperCar myCar = new SuperCar();
		
		
		momCar.name = "����";
		momCar.price = 100;
		momCar.color = "blue";
//		momCar.mode = "normal"; �θ�ü�� ����. ����
		
		myCar.name = "��";
		myCar.price = 1000;
		myCar.color = "red";
		myCar.mode = "sports";
		
		momCar.go();
		momCar.engineOn();
		momCar.show();
//		momCar.openRoof(); �θ�ü�� ����. ����
		
		System.out.println("--------------------------------------");
		
		myCar.go();
		myCar.engineOn();
		myCar.show();
		myCar.openRoof();
		
		
		//��ĳ����
		//momCar : CarŸ��(�θ�)
		//myCar : SuperCarŸ��(�ڽ�)
		
		//ex) int num = (int)3.14;
		// �ڽ� --> �θ� : ��ĳ����
		System.out.println("===================��ĳ����======================");
//		Car up = (Car)myCar;
		Car up = myCar; // �����ص���. ex) double d = 3; �� �����ϵ��� ���� ��.
		up.name = "�����̸�";
		up.price = 200;
		up.color = "�����Ȼ���";
//		up.mode = "normal"; ��ĳ������ �Ǹ� �ڽĿ��� ���Ӱ� ���ǵ� ����� ����� �Ұ����ϴ�.
		
		up.go();
		up.engineOn(); // �����ǵ� �޼ҵ�� �ڽĿ��� �����ǵ� ��� �����Ѵ�.
		up.show(); // �����ǵ� �޼ҵ�� �ڽĿ��� �����ǵ� ��� �����Ѵ�.
//		up.openRoof(); ��ĳ������ �Ǹ� �ڽĿ��� ���Ӱ� ���ǵ� �޼ҵ�� ����� �Ұ����ϴ�.
		
		System.out.println("===================�ٿ�ĳ����=======================");
		
		// �θ� --> �ڽ� : �Ұ���
//		SuperCar down = (SuperCar)momCar; ���� �߻�
		// �ٿ�ĳ���� : �θ�Ÿ������ ��ĳ���� �� ģ���� �ڽ�Ÿ������ �ٽ� �ǵ����� ����
		
		SuperCar down = (SuperCar)up;
		down.openRoof();
		down.show();
		
	}

}
