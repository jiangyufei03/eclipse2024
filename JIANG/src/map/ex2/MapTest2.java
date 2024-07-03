package map.ex2;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {

	public static void main(String[] args) {
		//1.添加元素：无序，不重复，无索引
		Map<String, Integer> map = new HashMap<>();	//有序，不重复，无索引
		map.put("手表", 100);
		map.put("手表", 220);	//后面重复的数据会覆盖前面的数据
		map.put("手机", 2);
		map.put("Java", 2);
		map.put(null, null);
		System.out.println(map);
		
		//2. public int size():获取集合大小
		System.out.println(map.size()); //包含的元素值的个数（按对算）
		
		//3.public void clear():清空集合
//		map.clear();
		System.out.println(map);
		
		//4.public boolean isEmpty():判断集合是否为空，为空则返回true，反之
		System.out.println(map.isEmpty());

		//5.public V get(Object key):根据键获取对应值
		int v1 = map.get("手表");
		System.out.println(v1);
		System.out.println(map.get("手机"));
		System.out.println(map.get("张三"));//不存在则返回null
		
		//6.public V remove(Object key):根据键删除整个元素（删除键会返回键的值）
		System.out.println(map.remove("手表"));
		System.out.println(map);
		
		//7.public boolean containsKey(Object key):判断是否包含某个键，包含则返回true
		System.out.println(map.containsKey("手表"));
		System.out.println(map.containsKey("手机"));
		System.out.println(map.containsKey("java"));	//精确匹配，注意大小写
		
		//8.public boolean containsValue(Object value):判断是否包含某个值，包含则返回true
		System.out.println(map.containsValue(2));
		System.out.println(map.containsValue("2")); //false
		
		//9.public Set<K> keySet():获取Map集合的全部键
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		//10.public Collection<V> values():获取Map集合的全部值.Collection的值可以重复
		Collection<Integer> values = map.values();
		System.out.println(values);
		
		//11.把Map集合的其他数据导入自己集合中来
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("Java1", 10);
		map1.put("Java2", 20);
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("Java3", 10);
		map2.put("Java2", 222);
		map1.putAll(map2);	//putAll：把Map2的元素全部倒入一份到Map1集合中去（无序）
		System.out.println(map1);
		System.out.println(map2);
	}

}
