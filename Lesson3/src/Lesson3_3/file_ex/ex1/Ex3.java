package Lesson3_3.file_ex.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex3 {

	public static void main(String[] args) {
		//如果制定了不存在的路径（不存在的文件夹），会报错
		File file = new File("test/time.txt");
		
		if(file.exists()) {
			System.out.println(file.length());
		} else {
			try {
				file.createNewFile();
				System.out.println(file.getAbsolutePath());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		////fileの書き込み操作
		//try-with-resourse
		try(
				//一個ずつ
				FileWriter fileWriter = new FileWriter(file);
				//一行ずつ
				BufferedWriter bw = new BufferedWriter(fileWriter);
		){
			bw.write("アイス");
			//改行
			bw.newLine();
			bw.write("チョコ");
			bw.newLine();
			bw.write("グミ");
		}catch (FileNotFoundException e){
			System.out.println("ファイルが見つかりませんでした。");
			e.printStackTrace();
		} catch (IOException e){
			System.out.println("書き込みに失敗しました。");
			e.printStackTrace();
		}	
		
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
			System.out.println("書き込みに失敗しました。");
			e.printStackTrace();
		}	
		
	}

}
