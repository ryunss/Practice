package day16;

public class Outer {
	int ov = 10;
//	InnerLocal il ; ���� ����Ŭ�����̱� ������ outerFunction() �޼ҵ� �ȿ����� ��� ����
	
	// ���� �ν��Ͻ� Ŭ����
	class InnerInstance{
		int iiv = 20;
		
		public void innerInstanceFunction() {
			System.out.println("�ν��Ͻ�Ŭ���� �޼ҵ� ȣ���");
		}
	}
	
	// ���� ����ƽ Ŭ����
	static class InnerStatic{
		int isv = 30;
		
		public void innerStaticFunction() {
			System.out.println("����ƽŬ���� �޼ҵ� ȣ���");
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
	
	
	// �ƿ��� Ŭ���� �� �׳� �Ϲ� �޼ҵ�
	public void outerFunction() {
		// ���� ���� Ŭ����. �ٸ������� Ŭ������ ������ �ʰ�, 
						//������ �޼ҵ� �ȿ����� Ŭ������ ���� ��쿡�� ����Ŭ������ ���� ������ ����� �� �ִ�.
		class InnerLocal{
			int ilv = 40;
			
			public void innerLocalFuntion() {
				System.out.println("����Ŭ���� �޼ҵ� ȣ���");
			}
		}
		
		InnerLocal il = new InnerLocal();
		
		System.out.println(il.ilv);
		il.innerLocalFuntion();
	}
	
}
