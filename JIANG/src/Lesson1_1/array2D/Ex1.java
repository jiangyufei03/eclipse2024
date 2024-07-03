package Lesson1_1.array2D;

public class Ex1 {

	public static void main(String[] args) {
		//二维数组的静态初始化
		int[][] arr = {{1,2},{1,2,3},{4,5,6}};
		
		//二维数组的动态初始化
		int[][] arr2 = new int [2][3];
		arr2[0][2] = 5;
		System.out.println(arr2[0][2]);

	}
}
