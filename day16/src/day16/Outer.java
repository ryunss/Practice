package day16;

public class Outer {
	int ov = 10;
//	InnerLocal il ; 내부 지역클래스이기 때문에 outerFunction() 메소드 안에서만 사용 가능
	
	// 내부 인스턴스 클래스
	class InnerInstance{
		int iiv = 20;
		
		public void innerInstanceFunction() {
			System.out.println("인스턴스클래스 메소드 호출됨");
		}
	}
	
	// 내부 스태틱 클래스
	static class InnerStatic{
		int isv = 30;
		
		public void innerStaticFunction() {
			System.out.println("스태틱클래스 메소드 호출됨");
		}
	}
	
	public void show() {
		InnerInstance ii = new InnerInstance();
		System.out.println(ii.iiv);
		ii.innerInstanceFunction();
		
		InnerStatic is = new InnerStatic();
		System.out.println(is.isv);
		is.innerStaticFunction();
	}
	
	
	// 아우터 클래스 안 그냥 일반 메소드
	public void outerFunction() {
		// 내부 지역 클래스. 다른데서는 클래스가 사용되지 않고, 
						//오로지 메소드 안에서만 클래스가 사용될 경우에는 내부클래스로 만들어서 간단히 사용할 수 있다.
		class InnerLocal{
			int ilv = 40;
			
			public void innerLocalFuntion() {
				System.out.println("지역클래스 메소드 호출됨");
			}
		}
		
		InnerLocal il = new InnerLocal();
		
		System.out.println(il.ilv);
		il.innerLocalFuntion();
	}
	
}
