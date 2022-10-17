package factory;

public class Himart {
	public static void main(String[] args) {
		Aircon 휘센 = (Aircon) Factory.getInstance("에어컨");
		TV prism = (TV) Factory.getInstance("TV");
		
		TV[] arTV1 = {
			new TV(),	
			new TV(),	
			new TV(),	
			new TV(),	
			new TV()
		};
		
		TV[] arTV2 = {
				(TV) Factory.getInstance("TV"),
				(TV) Factory.getInstance("TV"),
				(TV) Factory.getInstance("TV"),
				(TV) Factory.getInstance("TV")
		};
	}
}
