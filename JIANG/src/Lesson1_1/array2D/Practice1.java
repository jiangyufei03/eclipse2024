package Lesson1_1.array2D;

public class Practice1 {

	public static void main(String[] args) {
		//二次元配列　偶数を出力　逆順　合計
		  int[][] arr = {{1,2,3,4}, {5,6,7}}; 
		  
		  for(int i = 0; i < arr.length; i++) {
			  for(int j = 0; j < arr[i].length ; j++) {
				  int evn = arr[i][j];
				  if(evn % 2 == 0) {
					  System.out.print(evn + " ");
					  
				  }
				  
			  }
		  }
		  
		  System.out.println();
		  System.out.println("----------------------------------"); 
		  
		  //forEach文
		  // j 代表数组中的每个元素
		  
		  for(int[] num : arr) {
			  for(int j : num ) {
				  if ( j % 2 == 0) {
					  System.out.print(j + " ");
				  }
			  }
		  }
		  
		  System.out.println();
		  System.out.println("----------------------------------"); 
		  
		  for(int i = arr.length - 1; i >= 0 ; i-- ) {
			  for(int j = arr[i].length - 1 ; j >= 0 ; j-- ) {
				  System.out.print(arr[i][j] + " ");
			  }
		  }
		  
		  System.out.println();
		  System.out.println("----------------------------------"); 
		  
		  int sum = 0;
		  for(int[] num : arr) {
			  for(int j : num){
				  sum += j;
			  }
		  }
		  
		  System.out.println(sum);
	}

}
