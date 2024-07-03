package file.ex;

import java.io.File;
import java.util.Arrays;

public class FileTest4 {

	public static void main(String[] args) {
		// 1.public String[] list ():获取当前目录下所有“一级文件名称”到一个字符串数组中去返回
		//拿名字
		File f1 = new File("C:\\elipse2024");
		String[] names = f1.list();
		for(String name : names){
			System.out.println(name);
		}
		
		//2.public File[] listFiles();(重点)获取当前目录下所有“一级文件对象”到一个文件对象数组中去返回
		//拿文件对象,可以用文件对象调删除方法和获取绝对路径等
		File[] files = f1.listFiles();
		for(File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		
		File f = new File("C:\\data\\aaa\\bbb\\ccc");
		File[] files1 = f.listFiles();
		System.out.println(Arrays.toString(files1));	//为空
		
		
				
	}

}
