package week1_jiangyufei;

public class Practice3 {

	public static void main(String[] args) {
		
		int[] array = {5, 3, 9, 1, 7};
		int max = findMax(array);
		System.out.println("Maximum value in the array:" + max);

	}

	
	static int findMax(int[] num) {
		
		int max= num[0];
		for(int i = 0; i < num.length ; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		return  max;
	}
	
}
