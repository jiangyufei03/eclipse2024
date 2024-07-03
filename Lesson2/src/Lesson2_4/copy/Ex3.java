package Lesson2_4.copy;

public class Ex3 {

	public static void main(String[] args) {
		//二次元配列宣言
		int[][] a = {{1, 2},{3, 4}};
		int[][] b = {{5, 6},{7, 8}};
		//一次元配列只对值进行复制
		//二次元只能竖着复制[数量(横着没有很好的复制）]（二次元需要两个for文）
		//int[][] b = a.clone();     //不能单独使用
		
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i].clone();
		}
		
		
			
		a[0][0] = 100;
		System.out.println(a[0][0]);
		System.out.println(b[0][0]);

	}

}
