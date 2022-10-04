package day03;

import java.util.Random;
import java.util.Scanner;

// 스트릿 애니멀 파이터
public class SAF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---스트릿 애니멀 파이터---");
		while(true) {
			int hp = 0;
			int foodCnt = 0;
			int maxHp = 20;
			System.out.println("플레이 하실 동물을 고르세요\n1. 고릴라\n2. 개복치\n3. 코끼리\n4. 나가기");
			System.out.print("숫자 입력 : ");
			int choice = sc.nextInt();

			if(choice == 4) {
				System.out.println("안녕히가세여");
				break;
			}
			
			switch(choice) {
			case 1:
				hp = 6;
				foodCnt = 6;
				break;
			case 2:
				hp = 3;
				foodCnt = 8;
				break;
			case 3:
				hp = 10;
				foodCnt = 4;
				break;
			}
			
			// 동물(캐릭터) 이름 정하기
			System.out.print("캐릭터 이름 : ");
			String name = sc.next();
				
			while(true) {
				System.out.println(name + " 플레이중");
				System.out.println("1. 밥먹기\n2. 잠자기\n3. 산책하기\n4. 내 정보 보기\n5. 나가기");
				// choice 변수 재사용
				// 장점 : 메모리 효율
				// 단점 : 가독성 (변수가 같으면 헷갈릴수있음)
				choice = sc.nextInt();
				if(choice == 5) {
					break;
				}
				
				switch(choice) {
				case 1:
					// 밥먹기
					if(foodCnt > 0) {
						if(maxHp <= hp) {
							System.out.println("배불러요");
						}else if(hp == 19) {
							hp+=1;
							System.out.println(name+"이(가) 먹이를 먹고 체력을 회복했습니다");
							System.out.println("현재 hp : "+hp);	
						}else if(maxHp > hp){
							foodCnt--;
							hp+=2;
							System.out.println(name+"이(가) 먹이를 먹고 체력을 회복했습니다");
							System.out.println("현재 hp : "+hp);							
						}
					}else {
						System.out.println("먹이가 없습니다. 산책을 나가보세요");
					}
					break;
				case 2:
					// 잠자기
					System.out.print("쿨쿨");
					for (int i = 0; i < 3; i++) {
						// try + catch 단축키 : Alt+Shift+Z 
						try {
							Thread.sleep(1000); // 1초동안 프로그램 잠시 멈추기
							System.out.print(".");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println();
					if(maxHp <= hp) {
						System.out.println("잘잣다~ (최대체력이라 회복되지 않습니다)");
					}else {
						hp++;
						System.out.println("체력회복!\n 현재 HP : "+hp);						
					}
					break;
				case 3:
					// 산책하기
					if(hp == 1) {
						System.out.println("지금은 산책을 나가기에 체력이 부족합니다. 현재 hp : "+hp);
						break;
					}
					
					hp--;
					
					String quiz1 = "다음 중 9시 A강의장 국비 강사의 이름은?\n1. 강동원\n2. 송강\n3. 정다솔\n4. 남궁민";
					String quiz2 = "다음 중 컬렉션 프레임워크가 아닌것은?\n1. HashSet\n2. ArrayList\n3. Dictionary\n4. HashMap";
					
					Random r = new Random();
//					r.nextInt(n) : 0 ~ n-1 까지 중 랜덤한 숫자
					int randNum = r.nextInt(2);
					if(randNum == 0) {
						System.out.println(quiz1);
					}else {
						System.out.println(quiz2);						
					}
					
					int answer = sc.nextInt();
					
					if(answer != 3) {
						System.out.println("오답입니다.");
						hp--;
					}else {
						System.out.println("정답입니다.");
						foodCnt += 2;
					}
					break;
				case 4:
					// 내 정보 보기
					System.out.println("캐릭터 이름 : "+name);
					System.out.println("HP : "+hp);
					System.out.println("먹이 : "+foodCnt+"개");
					break;
				}
				if(hp == 0) {
					System.out.println(name+"(이)는 더이상 우리와 함께할 수 없어요");
					break;
				}
			}
		}
	}
}
