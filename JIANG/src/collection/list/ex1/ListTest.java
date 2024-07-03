package collection.list.ex1;

import java.util.ArrayList;
import java.util.List;

/*掌握List系列集合的特点，以及提供的特有方法
*/
public class ListTest {

	public static void main(String[] args) {
		// 1.创建ArrayList集合对象（有序，可重复，有索引）
		//List是接口不能直接创建对象(String 类型，自动重写toString)
		List<String> list = new ArrayList<>();		//经典代码
		list.add("蜘蛛精");
		list.add("至尊宝");
		list.add("至尊宝");
		list.add("牛夫人");
		System.out.println(list);
		
		//2.public void add(int index, E element):在某个索引位置处添加元素
		list.add(2, "紫霞仙子");
		System.out.println(list);
		
		//3.public E remove(int index): 根据索引删除元素，返回被删除元素
		System.out.println(list.remove(2));		//把返回的数据打印出来
		System.out.println(list);
		
		//4.public E get(int index): 返回集合中指定位置的元素
		System.out.println(list.get(3));
		
		//5.public E set(int index, E element):修改索引位置处的元素，修改成功后，会返回原来的数据 
		System.out.println(list.set(3, "牛魔王"));    //返回被修改的数据，牛夫人
		System.out.println(list);
	}

}
