package collection.ex;

import java.util.ArrayList;
import java.util.HashSet;

/*
	认识collection体系的特点
*/
public class CollectionTest1 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();	//有序，可重复，有索引
		list.add("java1");
		list.add("java2");
		list.add("java1");
		list.add("java2");
		System.out.println(list);
		
		HashSet<String> set = new HashSet<>();	//无序，不可重复，无索引
		set.add("java1");
		set.add("java2");
		set.add("java1");
		set.add("java2");
		set.add("java3");
		System.out.println(set);
	}

}
