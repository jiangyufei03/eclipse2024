package Lesson3_2.map_ex;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// マップの宣言
		Map<String, Integer> students = new HashMap<String, Integer>();
		//add data 
		students.put("Alice", 80);
		students.put("Bob", 100);
		students.put("Carol", 30);
		System.out.println(students);
		//get data
		System.out.println(students.get("Bob"));
		//データの削除
		students.remove("Alice");
		System.out.println(students);
		
		//foreach
		// キーのデータ型
		for (String a : students.keySet()) {
			//key
			System.out.println(a);
			//value
			System.out.println(students.get(a));
		}
	}

}
