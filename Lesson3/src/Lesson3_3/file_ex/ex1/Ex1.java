package Lesson3_3.file_ex.ex1;

import java.io.File;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) {
		// ファイルクラスを使ってファイルを指定する
		File file = new File("practice1.txt") ;
		// もし、practice1.txtが存在していたら、ファイルサイズを出力
		// 存在していなかった場合、practice1.txtを作成し、絶対パスを出力
		if(file.exists()) {
			//ある場合
			System.out.println(file.length());
		} else {
			// ファイルが存在しない場合
			// ファイルを作成
			//因为知道是否能创建文件成功，所以为了不让程序停止，暂时抓住错误
			try {
			file.createNewFile();
			// ファイルの絶対パスを出力
			System.out.println(file.getAbsolutePath());
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		//フォルダ作成
		File dir = new File("test");
		dir.mkdir();
		
		//ファイルの作成
		//testフォルダの中に「hello.text」ファイル作成
		File file2 = new File("test/hello.txt");
		
		try {
			//ファイル作成
			file2.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}


