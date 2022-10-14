package shape;

public class Square extends Shape{

	public static void main(String[] args) {
		Square s = new Square(4, 10, 5);
		
		System.out.println(s.getArea());
		System.out.println(s.width);
		System.out.println(s.height);
		System.out.println(s.lineCnt);
		s.init();
	}
	
	public Square(int lineCnt, double width, double height) {
		super(lineCnt, width, height);
	}

	@Override
	double getArea() {
		area = width * height;
		return area;
	}
	
}
