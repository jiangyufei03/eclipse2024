package file.ex;

import java.io.File;

//掌握file创建对象

public class FIleTest1 {

	public static void main(String[] args) {
		// 1.创建一个file对象，指代某个具体的文件
		//路径分割符
		File f1 = new File("‪C:\\data\\テーブル定義\\test.sql");
		//返回true或者false
		System.out.println(f1.exists());
		
		//也可以单独只写一个正斜杠
//		File f2 = new File("‪C:/Users/user/Downloads/メモ/test/test1.0.txt");
		//分割符用File.separator
//		File f3 = new File("‪C:" + File.separator + "Users \\user\\Downloads\\メモ\\test\\test1.0.txt");
		//返回的是文件的字节个数
		System.out.println(f1.length());	//	文件大小
		
		//File也可以指向文件夹，打印的就是文件夹本身的大小
		
		//File对象可以指代一个不存在的文件路径
		
		//要定位的文件在模块中，应该怎么定位？
		//相对路径，不带盘符，直接去工程处找文件
		File f4 = new File("file/test1.0.txt");
		System.out.println(f4.length());
		//绝对路径：一长串，从D盘开始等，带盘符
		
		

	}

}
