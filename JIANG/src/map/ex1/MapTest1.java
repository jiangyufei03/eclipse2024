package map.ex1;
//掌握Map集合的特点

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest1 {

	public static void main(String[] args) {
//		Map<String, Integer> map = new HashMap<>();	//经典代码。按照键，无序，不重复，无索引支持
		Map<String, Integer> map = new LinkedHashMap<>();	//有序，不重复，无索引
		map.put("手表", 100);
		map.put("手表", 220);	//后面重复的数据会覆盖前面的数据
		map.put("手机", 2);
		map.put("Java", 2);
		map.put(null, null);
		System.out.println(map);
		
		Map<Integer, String> map1 = new TreeMap<>();	//可排序，不重复，无索引。按照键升序
		map1.put(23, "Java");
		map1.put(23, "MySQL");
		map1.put(19, "李四");
		map1.put(20, "王五");
		System.out.println(map1);
		
	}

}
