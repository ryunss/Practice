package day01;

import java.util.Scanner;

public class InputTask2 {

	public static void main(String[] args) {
		// 회원의 정보 입력받아서 회원정보 출력하기
		// 이름, 나이, 키, 몸무게, 학점, 자기소개
		// 출력의 형태는 자유롭게 하되 모든 데이터들이 다 보여지도록 하기 + BMI(몸무게/키 제곱)
		Scanner sc = new Scanner(System.in);
		
		String arr[] = {"이름", "나이", "키", "몸무게", "학점", "자기소개"};
		String result[] = new String[6];
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"를 입력하세요 >> ");
			result[i] = sc.nextLine();
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.print(arr[i]+" : "+result[i]+"\n" );			
		}
		
	}

}
