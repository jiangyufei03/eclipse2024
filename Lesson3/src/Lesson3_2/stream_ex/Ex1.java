package Lesson3_2.stream_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Bob");
		names.add("Alice");
		names.add("Carol");
		names.add("Alice");
		names.add("Dave");
		
		// 重複しているデータ（Alice）を除く
		// 名前の長さが3文字より大きい人を抽出
		// 名前をabc順に
		// Listにまとめて表示
		System.out.println(
				names.stream()
				.distinct()
				.filter(e -> e.length() > 3) //条件式
				.sorted() 	//如果里面只有一个数据的话，可以不用指定排序，自动进行自然排序(123456/abcdef)
				.collect(Collectors.toList())
		);
	}
}