package day04;

public class ArrTest2 {

	public static void main(String[] args) {
		int[][] arrData = {
				{10,20,30},
				{40,50,60}
		};
		
		for(int i = 0; i<2; i++) {
			for(int j = 0; j<3; j++) {
				System.out.print(arrData[i][j]+" ");
			}
			System.out.println();
		}
	}

}
