package day12;

public class ClassTest {
	// 오버로딩, 객체, 필드 등 용어 재정리 및 선언, 정의 다시 확인.

	public static void main(String[] args) {
//		String name = "김철수";
//		int kor = 100;
//		int eng = 70;
//		int math = 50;
//		
//		String name1 = "홍길동";
//		int kor1 = 50;
//		int eng1 = 30;
//		int math1 = 40;
		
		Student kim = new Student("진하륜", 90, 100, 80); // 객체화.
		Student hong = new Student("홍길동", 50, 30, 40);
		       //kim : 객체, 인스턴스라고 부름
			   //new : 메모리에 할당시켜주는 연산자
		       //Student() : 생성자. 객체를 생성할 때 사용한다.
		
			   // 사실 자세한건 kim 은 참조변수, new Student 를 객체라 부르는건데
			   // 추후 깊게 공부예정.
	//	Student hong = new Student();
		
	//	kim.setVariables("김철수", 100, 70, 50);
//		kim.name = "김철수";
//		kim.kor = 100;
//		kim.eng = 70;
//		kim.math = 50;
		
	//	hong.setVariables("홍길동", 50, 30, 40);
//		hong.name = "홍길동";
//		hong.kor = 50;
//		hong.eng = 30;
//		hong.math = 40;
		
		kim.show();
		hong.show();
		ClassTest.printStudent(kim);
//		System.out.println("---학생정보---");
//		System.out.println("이름: "+kim.name);
//		System.out.println("국어점수: "+kim.kor);
//		System.out.println("영어점수: "+kim.eng);
//		System.out.println("수학점수: "+kim.math);

		ClassTest.printStudent(hong);
//		System.out.println("---학생정보---");
//		System.out.println("이름: "+hong.name);
//		System.out.println("국어점수: "+hong.kor);
//		System.out.println("영어점수: "+hong.eng);
//		System.out.println("수학점수: "+hong.math);
		
		
		}
	
	public static void printStudent(Student s) {
		System.out.println("---학생정보---");
		System.out.println("이름: "+s.name);
		System.out.println("국어점수: "+s.kor);
		System.out.println("영어점수: "+s.eng);
		System.out.println("수학점수: "+s.math);
		
		Student s1 = new Student("박영희",100,100,100);
		s1.show();
		
		Student s2 = new Student();
	}
}
class Student { // 클래스 안에서 변수 생성하면 초기값 안줘도 다 초기화 되어있음.    // 필드
	String name;								 // 멤버, 멤버 변수 == 인스턴스변수
	int kor;									 // 멤버, 멤버 변수	== 인스턴스변수
	int eng;									 // 멤버, 멤버 변수	== 인스턴스변수	
	int math;								     // 멤버, 멤버 변수 == 인스턴스변수
	
	public Student() { // 67번째줄 매개변수 하나도 없을 떄 동작 되게끔 하는 것. 메서드 오버로딩
		 			   // 기본 생성자
	}
	
	// 초기화 생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 멤버, 멤버함수 == 메소드
	public void setVariables(String s, int num1, int num2, int num3) {
		name = s;
		kor = num1;
		eng = num2;
		math = num3;
	}
	// 멤버, 멤버함수 == 메소드
	public void show() {
		System.out.println("show() 메소드 실행됨");
		System.out.println("이름 : "+this.name);
		System.out.println("국어 : "+this.kor);
		System.out.println("영어 : "+this.eng);
		System.out.println("수학 : "+this.math);
	}
}
