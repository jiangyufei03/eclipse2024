package lesson1_3.method.practice;

public class Practice4 {

	public static void main(String[] args) {
		//整数の配列を引数として受け取り、配列内の全ての要素の平均値を計算して返すメソッド 
		
		int[]arr = {5 , 10 , 15 , 20 };
		
		double i =  calculateAverage(arr);
		System.out.println( i );
	}

	
	static double calculateAverage(int[] array) {
		int sum = 0;
		//配列を回す
		for(int i = 0; i < array.length ; i++) {
			sum += array[i];
		}
		
		//forEach
		
		//for(int num : array){
		//    sum += num;
	    // }
		    
		double average =(double) sum / array.length ;
		return average;
		
		// return (double) sum / array.length;
	}
}
