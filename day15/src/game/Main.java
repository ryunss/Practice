package game;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Animal avatar = null;
		
		System.out.println("---모여라 동물 친구들---");
		
		while(true) {
			System.out.println("--캐릭터 선택--");
			System.out.println("1. 강아지");
			System.out.println("2. 고양이");
			System.out.println("3. 도마뱀");
			System.out.print("입력 >> ");
			int choice = Integer.parseInt(sc.nextLine());
			
			if(choice != 1 && choice != 2 && choice != 3) {
				System.out.println("잘못입력하셨습니다. 알맞은 캐릭터를 선택하세요");
				continue;		
			}
			System.out.print("캐릭터 이름 설정 >>");
			String name = sc.nextLine();
			
			if(choice == 1) {
				avatar = new Dog(name, 50, 50); // 업캐스팅
			}else if(choice == 2) {
				avatar = new Cat(name, 100, 15); // 업캐스팅
			}else if(choice == 3) {
				avatar = new Lizard(name, 20, 10); // 업캐스팅
			}
			break;
		}
		
		while(true) {
			System.out.println("1.먹기");
			System.out.println("2.산책가기");
			System.out.println("3.놀아주기");
			System.out.println("4.종료하기");
			System.out.print("입력 >> ");
			int choice = Integer.parseInt(sc.nextLine());
			if(choice ==1 ) {
				avatar.eat();
			}else if(choice == 2) {
				avatar.walk();
			}else if(choice == 3) {
				avatar.play();
			}else if(choice == 4) {
				System.out.println("게임을 종료합니다.");
				if(avatar instanceof Cat) { // 캣타입인 경우만 cat으로 바꿔준다.
					((Cat)avatar).onlyCat(); // 다운캐스팅					
				}
				break;
			}else {
				System.out.println("잘못입력했습니다.");
			}
			
		}
	}

}