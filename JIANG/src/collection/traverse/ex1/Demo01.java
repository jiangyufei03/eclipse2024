package collection.traverse.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


//使用迭代器遍历集合
public class Demo01 {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		c.add("赵敏");
		c.add("小昭");
		c.add("素素");
		c.add("灭绝");
		System.out.println(c);
		// c = [赵敏, 小昭, 素素, 灭绝]
		//      it
		
		//使用迭代器遍历集合
		//1.从集合对象中获取迭代器对象
		Iterator<String> it = c.iterator();		//调Iterator得到一个迭代器对象，默认站在集合的第一个元素处
//		System.out.println(it.next());		//最初为第一个元素，取完之后向右移
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		//System.out.println(it.next());		//第五个为空，出现异常（NoSuchElementException）
		
		//2.使用循环结合迭代器遍历集合
		//		调迭代器（hasNext）,询问当前位置是否有数据，如果有则返回true,进到循环内部
		//		此时为第一个位置，有数据
		//		直到最后位置没有数据，结束循环
		while(it.hasNext()) {
			//用迭代器调next方法取出来，之后交给一个变量,之后向后继续取下一个数据
			String ele = it.next();		//把第一个数据去出来，并移到下一个位置（这个方法会执行两个动作）
			System.out.println(ele);
			//问一次，取一次，并交给变量。不能同时取两次，否则会踏空
		}
		
	}

}
