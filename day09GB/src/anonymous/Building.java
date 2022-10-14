package anonymous;

public class Building {
	public static void main(String[] args) {
		Banapresso yeoksam = new Banapresso();
		
		yeoksam.openCafe(new Cafe() {
			@Override
			public void clean() {
				System.out.println("청소");
			}
			
			@Override
			public void sell() {
				System.out.println("팔기");
			}
		});
	}
}
