package Lesson3_2.stream_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// リストの宣言
	
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("satou", 61));
		list.add(new Student("suzuki", 19));
		list.add(new Student("tanaka", 45));
		list.add(new Student("kojima", 68));
		list.add(new Student("sasaki", 10));
		list.add(new Student("nakajiam", 59));
		
		// スコアが60点より小さい人を抽出
		// スコアが小さい⇒大きい順に並び替え
		// 結果をリストにまとめて表示
		
		System.out.println(
				//ライン
				list.stream()
				//e是随便起的名字
				.filter(e -> e.getScore() < 60)
				//顺序，两个数字进行比较
				.sorted((s1, s2) -> s1.getScore() - s2.getScore())	//小到大
				.collect(Collectors.toList())
		);
		
		// forEachで表示する場合の方法
		list.stream()
		.filter(e -> e.getScore() < 60)
		//第二个减去第一个
		.sorted((s1, s2) -> s2.getScore() - s1.getScore())	//大到小
		.forEach( a -> System.out.println("名前：　" + a.getName() + " 点数" + a.getScore() ));
	
	
		//最大値の求め方
		System.out.println(
				//ラインを作る
				list.stream()
				//比较,找出成绩最高值
				.max((m1, m2) -> m1.getScore() - m2.getScore())
				//	Optionalから値を取り出す		
				.get()
			
		);
		
		/*
		在使用 min 方法时，不应该同时使用 max 方法。
		这两个方法是独立的，你只需要使用其中一个。
		想要找到列表中成绩最高和最低的学生，要分别调用 max 和 min 方法来实现。
		*/
		
		System.out.println(
				//ラインを作る
				list.stream()
				//比较,找出成绩最小值
				.min((m1, m2) -> m1.getScore() - m2.getScore())
				.get()
		);
		
		
	}

}
