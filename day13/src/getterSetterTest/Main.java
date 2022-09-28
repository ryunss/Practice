package getterSetterTest;

public class Main {

	public static void main(String[] args) {
//		Student kim = new Student();
//		Student park = new Student("박영희", 100, 100, 100);
//		Student hong = new Student("홍길동", 70, 70, 70);
//		
//		
////		kim.name = "김철수"; 
////		Student 클래스에서 프라이빗으로 설정되어있기 때문에 바로 사용할 수 없다.
//		kim.setName("김철수");
//		kim.setKor(100);
//		kim.setEng(70);
//		kim.setMath(50);
//		
//		// 김철수의 국어점수는 100점, 영어점수 70점, 수학점수 50점이다
//		// 해당 값들을 kim 이라는 객체 속 인스턴스 변수에 저장하고
//		
////		System.out.println(kim.name);
//		// ---김철수 성적정보---
//		// 국어 : 100점
//		// 영어 : 70점
//		// 수학 : 50점
//		// 평균점수 : 00.00점
//		
//		System.out.println("---"+kim.getName()+" 성적정보---");
//		System.out.println("국어 : "+ kim.getKor()+"점");
//		System.out.println("영어 : "+ kim.getEng()+"점");
//		System.out.println("수학 : "+ kim.getMath()+"점");
//		System.out.println("평균점수 : "+(double)(kim.getKor()+kim.getEng()+kim.getMath())/(double)3);
		
		//----------------------------------------------------------
		//객체타입 배열 kim, park, hong이 요소로 들어있는 배열
		
		//ex) int num1 = 100;
		//	  int num2 = 200;
		//    int[] ar = {num1, num2}; 이거랑 같은의미.
		Student[] students = {
				new Student("김철수", 50, 50, 50), 
				new Student("박영희", 100, 100, 100), 
				new Student("홍길동", 50, 50, 50)
				};
		
		System.out.println(students[0].getName());
		System.out.println(students[1].getName());
		System.out.println(students[2].getName());
	}

}
