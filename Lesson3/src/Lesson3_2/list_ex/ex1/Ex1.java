package Lesson3_2.list_ex.ex1;

import java.util.ArrayList;
import java.util.List;

//import

public class Ex1 {

	public static void main(String[] args) {
		// リストの宣言
		//   参照型のデータ＜＞ （クラスもできる）
		List<String> studentNames = new ArrayList<String>();
		
		//データの挿入
		studentNames.add("Alice");
		studentNames.add("Bob");
		studentNames.add("Carol");
		studentNames.add(1, "Dave");	
		// 要素を指定して追加
		studentNames.add(2, "Jon");
		System.out.println(studentNames);
		//データの削除
		studentNames.remove(3);
		System.out.println(studentNames);
		//指定数据内容消除（是精准匹配 ，必须一模一样才能消除)
		studentNames.remove("Alice");	//remove只能删除一个元素
		System.out.println(studentNames);
		//データの取得
		System.out.println(studentNames.get(0));	
		//データの上書き
		studentNames.set(0, "Kitty");
		System.out.println(studentNames);
		// 要素の個数の取得
		System.out.println(studentNames.size());
		
		//foreach
		for (String names : studentNames) {
			System.out.println(names);	//	中身だけを出力
			
		//不可変なリスト
//		List<String> TeacherNames = List.of("Taro", "Hanako");
//		TeacherNames.add("Kitty");   //エラー
			
		}
	}

}
