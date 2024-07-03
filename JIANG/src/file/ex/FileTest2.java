package file.ex;

import java.text.SimpleDateFormat;

public class FileTest2 {

	public static void main(String[] args) {
		// 1.创建文件对象，指代某个文件
//		File f1 = new File("D:.../../00.test");
		
		//2.public boolean exists():判断当前文件对象，对应的文件路径是否存在，存在则返回true
//		f1.exists();
		
		//3.public boolean isFile(): 判断当前文件对象指代的是否是文件，是则返回true，反之
//		f1.isFile();
		
		//4.public boolean isDirectory(): 判断当前对象指代的是否是文件夹，是则返回true
//		f1.isDirectory();
		
		//5. public String getName()：获取文件的名称包括后缀
//		f1.getName();
		
		//6.public long length()：获取文件的大小，返回字节字数
//		f1.length();
		
		//7. public long lastModified();获取文件的最后修改时间
//		long time = f1.lastModified();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		System.out.println(sdf.format(time));
		
		//8.public String getPath():获取创建文件对象时，使用的路径(输出相对路径和绝对路径)
		
		
		//9. public String getAbsolutePath()：获取绝对路径（会把创建时用到的相对路径转化成绝对路径输出）

	}

}
