package week3_JIANGYUFEI.practice2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//ファイルを作成する
		File file = new File("test/nikujaga.txt");
		if(file.exists()) {
			System.out.println(file.length());
		}else {
			try {
				file.createNewFile();
				System.out.println(file.getAbsolutePath());
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

		//ファイルの書き込み
		try(
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fileWriter);
				
			){
				bw.write("carrot");
				bw.newLine();
				bw.write("potato");
				bw.newLine();
				bw.write("meat");
				bw.newLine();
				bw.write("onion");
		}catch(FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
			
		//ファイルの読み込み
		try(
				FileReader fileReader = new FileReader(file);
				BufferedReader reader = new BufferedReader(fileReader);
					
				){
					String line = reader.readLine();
					while(line != null) {
						System.out.println(line);
						line = reader.readLine();
					}
					
			}catch(FileNotFoundException e) {
				System.out.println("ファイルが見つかりません");
				e.printStackTrace();
			}catch(IOException e){
				e.printStackTrace();
			}
		
	}

}
