package factory;

public class Factory {
	static public Product getInstance(String name) {
		if(name.equals("TV")) {
			return new TV();
		}else if(name.equals("에어컨")) {
			return new Aircon();
		}else if(name.equals("치킨")) {
			return new Chicken();
		}else {
			return null;
		}
	}
}
