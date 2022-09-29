package game;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Animal avatar = null;
		
		System.out.println("---�𿩶� ���� ģ����---");
		
		while(true) {
			System.out.println("--ĳ���� ����--");
			System.out.println("1. ������");
			System.out.println("2. �����");
			System.out.println("3. ������");
			System.out.print("�Է� >> ");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice != 1 && choice != 2 && choice != 3) {
				System.out.println("�߸��Է��ϼ̽��ϴ�. �˸��� ĳ���͸� �����ϼ���");
				continue;		
			}
			System.out.print("ĳ���� �̸� ���� >>");
			String name = sc.nextLine();
			
			if(choice == 1) {
				avatar = new Dog(name, 50, 50); // ��ĳ����
			}else if(choice == 2) {
				avatar = new Cat(name, 100, 15); // ��ĳ����
			}else if(choice == 3) {
				avatar = new Lizard(name, 20, 10); // ��ĳ����
			}
			break;
		}
		
		while(true) {
			System.out.println("1.�Ա�");
			System.out.println("2.��å����");
			System.out.println("3.����ֱ�");
			System.out.println("4.�����ϱ�");
			System.out.print("�Է� >> ");
			int choice = Integer.parseInt(sc.nextLine());
			if(choice ==1 ) {
				avatar.eat();
			}else if(choice == 2) {
				avatar.walk();
			}else if(choice == 3) {
				avatar.play();
			}else if(choice == 4) {
				System.out.println("������ �����մϴ�.");
				if(avatar instanceof Cat) { // ĹŸ���� ��츸 cat���� �ٲ��ش�.
					((Cat)avatar).onlyCat(); // �ٿ�ĳ����					
				}
				break;
			}else {
				System.out.println("�߸��Է��߽��ϴ�.");
			}
			
		}
	}

}