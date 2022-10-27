package z_0509;

public class For_test {

	public static void main(String[] args) {
		// max : 8 출력되게 코드 작성
		
		int max = 0;
		int array[] = {1,5,3,8,2};
		
		for(int i=0; i<array.length; i++) {
			if(array[i]>max)
			{
				max = array[i];
			}
		}
		
		System.out.println("max : "+max);
	}

}
