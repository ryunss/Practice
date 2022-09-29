package day01;

import java.util.Scanner;

public class InputTask {

	public static void main(String[] args) {
		// 회원의 정보 입력받아서 회원정보 출력하기
		// 이름, 나이, 키, 몸무게, 학점, 자기소개
		// 출력의 형태는 자유롭게 하되 모든 데이터들이 다 보여지도록 하기 + BMI(몸무게/키 제곱)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 >> ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 >> ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요 >> ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.print("몸무게를 입력하세요 >> ");
		double weight = sc.nextDouble();
		sc.nextLine();
		System.out.print("학점을 입력하세요 >> ");
		char score = sc.next().charAt(0);
		System.out.print("자기소개를 입력하세요 >> ");
		String myself = sc.nextLine();
		
		double bmi = (weight / (height*height)) * 100;
		
		System.out.printf(
					"제 이름은 %s 이고, 나이는 %d살입니다. 키는 %.2fcm 이며, 몸무게는 %.2fkg 입니다. \n"
					+ "BMI 는 %.2f 이에요. 그리고 학점은 %s 입니다. \n"
					+ "제 소개를 잠깐드릴게요  %s 이상입니다."
					, name, age, height, weight, bmi, score, myself
				);
	}

}
