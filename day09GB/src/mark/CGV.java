package mark;

public class CGV {
	public static void main(String[] args) {
		Movie[] movies = {
				new LifeIsBeautiful("인생은 아름다워"),
				new Orphan("오펀:천사의 탄생"),
				new GongZo2("공조2:인터내셔날")
		};
		
		for (int i = 0; i < movies.length; i++) {
			if(movies[i] instanceof Korean) {
				System.out.println(movies[i].name + " 상영중");  				
			}
		}
	}
}
