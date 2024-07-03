package Lesson1_1.for_each;

public class Ex2 {

	public static void main(String[] args) {
		
		// forEach循环不支持修改
		
		int[][] n = {{1,2},{3,4,5},{6,7,8,9}};
		for(int i = 0; i < n.length ; i++) {
			for(int j = 0; j < n[i].length ; j++) {
				//可以直接修改数组的值（数组的值本身发生了改变）
				n[i][j] *= 10 ;
				System.out.print(n[i][j]);
			}
		}
		
		System.out.println();
		System.out.println("-------------------------");
      
		int[][] arr = {{1,2},{3,4,5},{6,7,8,9}};
		//forEachの場合
		for(int[] innerArray : arr) {
			for(int number : innerArray ) {
				//当需要获取值时： 拷贝了数组中的值，并把拷贝的值*10，元素本身的值没有发生改变
				//forEach对元素的拷贝值进行操作，没有对元素本身的值进行操作
				number *= 10;
				System.out.print(number);
			}
		}
		
		System.out.println();
		System.out.println("-------------------------");
		
		//打印出可发现数组本身的值没发生任何改变
		for(int[] innerArray : arr) {
			for(int number : innerArray ) {
				System.out.print(number);
			}
		}
		
	}
}
