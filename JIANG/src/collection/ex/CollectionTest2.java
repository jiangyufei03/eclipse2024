package collection.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

//掌握collection集合的常用方法

public class CollectionTest2 {

	public static void main(String[] args) {
		//Collection是接口，不能直接new，要挑一个实现类		//多态写法
		//ArrayList中添加数据是可以重复的，因此添加数据不会失败		
		Collection<String> c = new ArrayList<>();
		//1.public boolean add(E e): 添加元素，添加成功返回true
		c.add("java1");
		c.add("java1");
		c.add("java2");
		c.add("java2");
		c.add("java3");
		System.out.println(c);	//通过对象调toSTring方法，最终返回内容
		
		//2. public void clear（） ： 清空集合的元素
		//c.clear();
		//System.out.println(c);
		
		//3. public boolean isEmpty（）： 判断集合是否为空，是空则返回true，反之返回false
		System.out.println(c.isEmpty());
		
		//4. public int size():获取集合的大小
		System.out.println(c.size());
		
		//5. public boolean contains(Object obj): 判断集合中是否包含某个元素
		System.out.println(c.contains("java1"));
		System.out.println(c.contains("Java1"));	//精确匹配 false
		
		//6. public remove （E e）： 删除某个元素，如果有多个重复元素，默认删除前面的第一个
		System.out.println(c.remove("java1"));
		System.out.println(c);
		
		//7. public Object[] toArray(): 把集合转成数组
		Object[] arr = c.toArray();
		//Object可以兼容集合中的任意数据，用Arrays调toString方法打印数组内容
		System.out.println(Arrays.toString(arr));
		
		//指定类型的数组(要保证数据确实都是字符串)
		String[] arr2 = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("-----------------------------------");
		
		//把一个集合中的全部数据倒入到另一个集合中去（批量添加数据）
		Collection<String> c1 = new ArrayList<>();
		c1.add("java1");
		c1.add("java2");
		Collection<String> c2 = new ArrayList<>();
		c2.add("java3");
		c2.add("java4");
		c1.addAll(c2);		//把c2集合的全部数据导入（拷贝）到c1集合中去，但两个集合数据类型必须一致
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
