package zoo;

import cage.Animal;
import cage.Bird;
import cage.Dog;
import cage.Mammal;
import cage.Pig;
import cage.Snake;

public class Ground {

	public static void main(String[] args) {
		// 포유류 두마리, 파충류 한마리, 조류 한마리 데려와서
		// 포유류는 울게하고, 파충류는 움직이게 하고, 조류는 날게 하기
		// 각 동물들은 모두 울기, 움직이기가 있음 (날기는 조류만 있음)
		// 동물 클래스들은 전부 cage 패키지에 선언
		
		Animal[] a = {
				new Bird("새"),
				new Dog("개"),
				new Pig("돼지"),
				new Snake("뱀"),
		};
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] instanceof Mammal) {
				a[i].MakeSomeNoise();
			}else if(a[i] instanceof Bird) {
				((Bird)a[i]).fly();
			}else {
				a[i].Move();
			}
			
		}
	}

}
