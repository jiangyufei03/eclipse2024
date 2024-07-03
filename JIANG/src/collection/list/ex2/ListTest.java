package collection.list.ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List集合的遍历

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("糖宝宝");
		list.add("蜘蛛精");
		list.add("至尊宝");
		
		// 1.用for循环
		for(int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		
		//2.迭代器
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//3.foreach遍历
		for(String s : list) {
			System.out.println(s);
		}
		
		//4.jdk 8之后的Lambda表达式
		list.forEach(s -> System.out.println(s));
				
	}

}
