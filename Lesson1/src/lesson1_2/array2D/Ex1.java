package lesson1_2.array2D;

public class Ex1 {

	public static void main(String[] args) {
		// 2次元配列の初期化
		//             　横(2,4,6)  
//		                   0,1,2   0,1,2
		int[][] scores = {{2,4,6},{8,10,12}};	
		
		//                      縦　２列	
//	    　　　　　　　　　　　　　　　　　　　0,     1
		
		int[][] array = new int[3][3];
//		                       縦　　横
//		int[][] array2 = new int[][3];    //不可以，会报错
		int[][] array3 = new int[3][]; 
//		　　　　　　　　　　　　　　　　　　　　　　横　無
		
		// array.length : 纵向长度
		// array[n].length : 横向长度
		
	}
}
