package classTest;

import accessTest.Test;

public class Main {

	public static void main(String[] args) {
		// 접근 권한 테스트
		Test t = new Test();
		t.a = 10;
		t.f1();
		// public만 사용이 가능하다.
	
		Student kim = new Student("김철수", 100, 70, 50);
		Student park = new Student("박영희", 50, 60, 70);
		
		kim.school = "초등학교";
		
		System.out.println(kim.school);
		System.out.println(park.school);
		System.out.println(Student.school); // 클래스 변수. 
		
		kim.f();
		park.f();
		Student.f();
	}

}
