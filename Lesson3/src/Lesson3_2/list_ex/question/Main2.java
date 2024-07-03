package Lesson3_2.list_ex.question;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("B");

		// 方法1：
		// Setにリストを追加して重複を削除する
		Set<String> set = new LinkedHashSet<>(list);

		// 削除された重複のないリストを再度作成
		List<String> uniqueList = new ArrayList<>(set);

		// 結果の表示
		System.out.println("重複削除前: " + list);
		System.out.println("重複削除後: " + uniqueList);
		
		
		 // 方法2：
		// Bを削除する
        list.removeIf(element -> element.equals("B"));

        // 結果の表示
        System.out.println("削除後のリスト: " + list);
		
	}
}