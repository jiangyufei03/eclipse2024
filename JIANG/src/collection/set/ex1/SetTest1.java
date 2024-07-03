package collection.set.ex1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest1 {
	/*
		了解set系列集合的特点
		*/
	public static void main(String[] args) {
		// 1.创建一个set集合的对象
//		Set<Integer> set = new HashSet<>();	//经典代码：无序(一般来说只会无序一次)，不重复，没有索引
//		Set<Integer> set = new LinkedHashSet<>();	//有序（与添加顺序一致），不重复，没有索引
		Set<Integer> set = new TreeSet<>();	//可排序（由小到大，升序排序），不重复，没有索引
		set.add(666);
		set.add(555);
		set.add(555);
		set.add(888);
		set.add(777);
		set.add(777);
		System.out.println(set);

	}

}
