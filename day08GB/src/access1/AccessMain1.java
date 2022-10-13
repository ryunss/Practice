package access1;

public class AccessMain1 {
	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		
		System.out.println(at.getData3());
		at.setData3(50);
		System.out.println(at.getData3());
		
		System.out.println(at.data1);
		System.out.println(at.data2);
//		System.out.println(at.data3); 같은 패키지에 있어도 사용 불가
		System.out.println(at.data4);
	}
}
