package Lesson3_3.file_ex.filePractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice1 {

	public static void main(String[] args) {
		
		//ファイルの作成
		File file = new File("test/practice3");
		if(file.exists()) {
			System.out.println(file.length());
		} else {
			try {
				file.createNewFile();
				System.out.println(file.getAbsolutePath());
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		//fileの書き込み
		try(
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fileWriter);
				
		){
			bw.write("test1");
			bw.newLine();
			bw.write("test2");
			bw.newLine();
			bw.write("test3");
			
		}catch(FileNotFoundException e) {
			System.out.println("ファイルが見つかりませんでした。");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("書き込みに失敗しました。");
			e.printStackTrace();
		}
		
		//file読み込み
		try (
				FileReader fileReader = new FileReader(file);
				BufferedReader reader = new BufferedReader (fileReader);
		
		){
			String line = reader.readLine();
			while(line != null){
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
