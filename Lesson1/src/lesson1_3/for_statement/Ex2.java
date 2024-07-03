package lesson1_3.for_statement;

public class Ex2 {

	public static void main(String[] args) {
		// 繰り返しfor文を使って配列の中身を表示させる
		//一次元配列
		
		int[] array = {10, 20, 30, 40};
		// index番号： i
		for(int i = 0 ; i < array.length ; i++ ) {
			System.out.print(array[i]);
		}
		
		System.out.println();
		System.out.println("-----------------------");	
		
		//二次元配列
		int sum = 0;
		
		int[][] array2D = {{1,2,3},{4,5,6,7}};
		for (int column = 0; column < array2D.length ; column++) {
			//当column为0的时候，拿到column[0]的长度
			//array2D.length       竖着的长度
			//array[0].length      横着的长度
		
			for(int row = 0; row < array2D[column].length; row++ ) {
				System.out.println("array[" + column + "][" + row + "]の値は" + array2D[column][row]);
				sum += array2D[column][row];		
			}
		}
		
		System.out.println("-----------------------");
		
		System.out.println("sum=" + sum);
		
		System.out.println("-----------------------");
		
		//打印数组
		
		int[][] n =  {{1,2},{3,4,5},{6,7,8,9}};
		for(int i = 0; i < n.length ; i++) {
			for(int j = 0; j < n[i].length ; j++) {
				System.out.print(n[i][j]);
			}
		}
	}
}
