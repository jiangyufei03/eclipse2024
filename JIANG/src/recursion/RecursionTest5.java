package recursion;

import java.io.File;

public class RecursionTest5 {
	//掌握文件搜索的实现
	
	public static void main(String[] args) {
		searchFile(new File("C:/"), "qq.txt");


	}

	/**
	 * 去目录下搜索某个文件
	 * @param dir	目录（文件夹）
	 * @param Filename	要搜索的文件名称
	 */
	//						把目录送给他, 和文件名
	public static void searchFile(File dir, String fileName) {
		//1.拦截非法情况
		//			但凡有一个是true，就会是true
		if(dir == null || !dir.exists() || dir.isFile()){
			return;
		}
		
		//2.dir不是null，存在，一定是目录对象
		//获取当前目录下的一级文件对象
		File[] files = dir.listFiles();
		
		//3.判断当前目录下是否存在一级目录对象，以及是否能够拿到一级文件对象
		if(files != null && files.length > 0) {
			//4.遍历全部一级文件对象
			for(File f : files) {
				//5.判断对象是否是文件，还是文件夹
				if(f.isFile()) {
					//是文件，判断文件名是否是在寻找的东西
					if(f.getName().contains(fileName)) {
						System.out.println("找到了： " + f.getAbsolutePath());
					}
				}else {
					//遍历到的是文件夹，应该继续重复整个过程（递归）
					searchFile(f, fileName);
				}
			}
		}
	}
}
