package collection.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest1 {
	/*
		理解集合的并发修改异常问题并解决
		*/
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("王麻子");
		list.add("小李子");
		list.add("李爱华");
		list.add("张全蛋");
		list.add("肖李");
		list.add("李玉刚");
		System.out.println(list);

		//找出集合中全部带“李”的名字并从集合中删除
		//ConcurrentModificationException (并发修改异常的错误)
//		Iterator<String> it = list.iterator();
//		while(it.hasNext()) {
//			String name = it.next();
//			if(name.contains("李")) {
//				list.remove(name);
//			}
//		}
//		System.out.println(list);
		
		//使用for循环遍历集合，并删除其中带李的
//		for(int i = 0; i < list.size(); i++) {
//			String name = list.get(i);
//			if(name.contains("李")) {
//				list.remove(name);
//			}
//		}
//		//由于元素位置前移，所以会导致漏删除元素
//		System.out.println(list);
		
		System.out.println("-----------------------");
		//怎么解决这个问题
		
//		for(int i = 0; i < list.size(); i++) {
//			String name = list.get(i);
//			if(name.contains("李")) {
//				list.remove(name);
//				i--;
//			}
//		}
//		System.out.println(list);
		
		
		//找出集合中全部带“李”的名字并从集合中删除
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String name = it.next();
			if(name.contains("李")) {
				//list.remove(name);	//并发修改异常出现的错误
				it.remove();//删除迭代器当前遍历到的数据，每删除一个数据后，相当于也在底层做了i--
			}
		}
		System.out.println(list);
		
		//增强for循环和lambda表达式也会出现问题
	}

}
