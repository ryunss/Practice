package generic;

public class GClassTest<IVE> {
	IVE data;
	
	public void f(IVE data) {
		this.data = data;
	}
	
	public void k() {
		System.out.println(data+" kkkkk");
	}
}
