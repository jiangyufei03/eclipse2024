package stream.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		//1. 如何获取List集合的Stream流
		List<String> names = new ArrayList<>();
		Collections.addAll(names,  "张三丰", "张无忌", "周芷若", "赵敏", "张强");
		Stream<String> stream = names.stream();
		
		//2.Set集合的Stream流
		Set<String> set = new HashSet<>();
		Collections.addAll(set,  "刘德华", "张无忌", "周芷若", "玛德", "德玛西亚");
		Stream<String> stream1 = set.stream();
		stream1.filter( s -> s.contains("德")).forEach(s -> System.out.println(s));
 
		
		//3.如何获取Map集合的Stream流
		Map<String, Double> map = new HashMap<>();
		map.put("古力娜扎", 172.3);
		map.put("迪丽热巴", 168.3);
		map.put("马儿扎哈", 166.3);
		map.put("卡尔扎巴", 168.3);
		//Map不能直接调Stream方法,把key取出来放在Set里面，再用Set调Stream
		Set<String> keys =	map.keySet();
		Stream<String> ks = keys.stream();
		
		//,把values取出来放在Collection里面，再用Collection的对象调Stream
		Collection<Double> values = map.values();
		Stream<Double> vs = values.stream();
		
		//用entrySet方法把map集合转成Set.把键值对作为一个整体来用
		Set<Map.Entry<String, Double>> entries = map.entrySet();
		//此时的Stream处理的是整个键值对数据
		Stream<Map.Entry<String, Double>> kvs = entries.stream();
		//e此时代表Map集合中的每一个键值对
		kvs.filter(e -> e.getKey().contains("巴"))
				.forEach(e -> System.out.println(e.getKey() + "--->" + e.getValue()));
		
		//4.如何获取数组的Stream流
		String[] names2 = { "张翠山", "东方不败", "唐大山", "独孤求败" };
		Stream<String> s1 = Arrays.stream(names2);
		Stream<String> s2 = Stream.of(names2);
	}

}
