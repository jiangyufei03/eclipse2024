package Lesson3_2.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// リストの宣言
		List<Cat> list = new ArrayList<Cat>();
		//				インスタンスを引数として使う
		list.add(new Cat("Kitty", 12.5));
		list.add(new Cat("Bob", 23.6));
		list.add(new Cat("Job", 10.5));
		
		
		//並び替え
		//			並びたい対象
		Collections.sort(list, new CatComparator());
		//先写配列、 有两个元素的时候，用右边的比较体重的方式
								//		（之前创建的方法）来排序
		System.out.println(list);
		
	}

}
