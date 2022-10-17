package obj;

public class Product {
	int prodnum;
	String prodname;
	int prodprice;

	public Product(int prodnum, String prodname, int prodprice) {
		this.prodnum = prodnum;
		this.prodname = prodname;
		this.prodprice = prodprice;
	}
	
	@Override
	public int hashCode() {
		return prodnum;
	}

	@Override
	public boolean equals(Object obj) {
		// obj 매개변수는 Object 타입으로 밖에서 넘겨준 객체들을 업캐스팅 해서 받는다.
		// 따라서 내부의 필드를 서로 비교하려면 업캐스팅 되며 잘려 나갔던 필드를 다시
		// 다운캐스팅으로 붙여준 후 붙여진 객체로 서로 비교해야한다. 다운캐스팅은 Product타입의 객체가 업캐스팅
		// 되었을 때만 해야하므로 instanceof로 타입비교부터 먼저 해준다.
		// 1. 타입 비교
		if(obj instanceof Product) {
			// 2. 다운캐스팅
			Product target = (Product)obj;
			
			// 3. 조건비교
			return this.prodnum == target.prodnum;
//			if(this.prodnum == target.prodnum) {
//				return true;
//			}
		}
//		Product타입의 객체가 아니거나, prodnum이 서로 다른 객체일 때 오는 부분
		return false;
	}
	
	
}
