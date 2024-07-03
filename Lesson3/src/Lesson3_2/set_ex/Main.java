package Lesson3_2.set_ex;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// セットの宣言
		Set<String> name = new HashSet<String>();
		//データ追加
		name.add("Alice");
		name.add("Bob");
		name.add("Carol");
		name.add("Alice");
		System.out.println(name);
		
		//集合の中に指定したデータがあるかないか確認
		System.out.println(name.contains("Bob"));
		
		
		
		

	}

}
