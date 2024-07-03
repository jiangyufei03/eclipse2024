package file.ex;

import java.io.File;

public class FileTest3 {
//掌握File创建和删除文件的方法
	
	public static void main(String[] args) throws Exception {
		//1.public boolean createNewFile():创建一个新文件，文件内容为空，创建成功则返回true
		File f1 = new File("C:/data/filetest.txt");
		System.out.println(f1.createNewFile());
		
		//2.public boolean mkdir()：用于创建文件夹，注意：只能创建一级文件夹
		File f2 = new File("C:/data/aaa");
		System.out.println(f2.mkdir());
		
		//3. public boolean mkdirs():用于创建文件夹，注意：可以创建多级文件夹
		File f3 = new File("C:/data/aaa/bbb/ccc");
		System.out.println(f3.mkdirs());
		
		//4.public boolean delete():删除文件或者空文件，注意：不能删除非空文件夹
		System.out.println(f1.delete());
		System.out.println(f2.delete());
		//而 f2.delete(); 将尝试删除 “aaa” 目录。如果该目录包含任何文件或子目录，它将无法删除，返回值为 false。
		
		
		
		
	}

}
