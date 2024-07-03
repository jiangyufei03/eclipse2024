package Lesson1_1.loop;

public class ForMultiply {

	public static void main(String[] args) {
		// 使用双重循环实现乘法表的打印
		//1、使用外层for循环控制打印的行数
		for (int i = 1; i <= 9; i++) {
			//2、使用内层for循环控制打印的列数
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + " ");
			}
			System.out.println();
		}
		
		
	}

}
