package wrapper;

public class WrapperTest1 {
	public static void main(String[] args) {
		int num = 10;
		
		// 박싱
//		Integer obj = new Integer(num);
		Integer obj = (Integer)num;
		
		// 언박싱
		int data = obj.intValue();
		
		// 오토박싱
		obj = 20;
		// 오토언박싱
		data = obj;
		
	}
}
