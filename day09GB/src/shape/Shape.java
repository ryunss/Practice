package shape;

abstract public class Shape {
	int lineCnt;
	double width;
	double height;
	double area;
	
	public Shape(int lineCnt, double width, double height) {
		this.lineCnt = lineCnt;
		this.width = width;
		this.height = height;
	}
	
	// 상속받는 모든 도형 클래스에서 필수로 재정의
	abstract double getArea();
	
	// final 메소드는 자식에서 절대 재정의가 불가능
	final void init() {
		System.out.println("저는 도형이에요");
	}
}
