package day04;

public class ArrTest1 {

	public static void main(String[] args) {
		int[][] arrData1 = {
				{10,20,30},	
				{40,50,60}
		};
		
		int[][] arrData2 = new int[3][5];
		arrData2[0][0] = 10;
		
		// 비정방배열 <= 열 수가 다 다를때를 의미. arrData2 를 보면 3행에 5열 (열에 5개씩있음) arrData3은 열이 몇개씩인지 다 다름.
		int[][] arrData3 = new int[3][];
		
		int[] sub = {10, 20, 30};
		int[] sub1 = {20, 30, 40, 50, 60};
		arrData3[0] = sub;
		arrData3[1] = sub1;
		
		System.out.println(arrData3[0][1]); // 20
		System.out.println(arrData3[1][4]); // 60
		
		// 비정방배열
		int[][] arrData4 = new int[3][];
		// 비정방 배열은 한번 접근하여 찾아갔을 때 연결되어 있는 공간들(소배열)이 존재하지 않으므로
		// 먼저 그 공간들을 할당해서 연결해주는 작업부터 하고 사용한다.
		// null : 주소값의 초기값, 비어있다 라는 뜻
		arrData4[0] = new int[3];
		arrData4[1] = new int[5];
		arrData4[2] = new int[1];
		
		arrData4[2][0] = 20; // <- 이런식으로 가능
	}

}





