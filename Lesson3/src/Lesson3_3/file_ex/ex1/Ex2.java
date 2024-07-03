package Lesson3_3.file_ex.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) {
				
		// ファイルクラスを使ってファイルを指定
		File file = new File("test/apple.txt");

		//file作成
		//file が存在していたら、ファイルサイズを出力
		// 存在していなかった場合、fileを作成し、絶対パスを出力
		
		if(file.exists()) {
			//存在する場合
			System.out.println(file.length());
		} else {
			//else ---> file存在しない場合
			try {
				file.createNewFile();
				System.out.println(file.getAbsoluteFile());
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		//fileの書き込み操作
		//try-with-resourse
		try (
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter (fileWriter);
		
		){
			// 文字列をファイルに書き込む
			bw.write("Line1");
			//改行
			bw.newLine();
			bw.write("Line2");
			bw.newLine();
			bw.write("Line3");
		}catch (FileNotFoundException e){
			System.out.println("ファイルが見つかりませんでした。");
			e.printStackTrace();
		} catch (IOException e){
			System.out.println("書き込みに失敗しました。");
			e.printStackTrace();
		}	
		
		//fileの読み込み操作
		//try-with-resourse
		//自動的に閉じます
		try (
				FileReader fileReader = new FileReader(file);
				BufferedReader reader = new BufferedReader (fileReader);
		
		){
//			System.out.println(reader.lines().toList());
			// 一行ずつ書いた内容を改行の状態でコンソールに出力する
			String line = reader.readLine();
			while(line != null){
			//内容を出力
			System.out.println(line);
			line = reader.readLine();
			}
			
		}catch (FileNotFoundException e){
			System.out.println("ファイルが見つかりませんでした。");
			e.printStackTrace();
		} catch (IOException e){
			System.out.println("読め込みに失敗しました。");
			e.printStackTrace();
		}	
		
	}

}
