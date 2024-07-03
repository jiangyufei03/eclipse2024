package map.impl;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Test2TreeMap {
//掌握TreeMap集合的使用
	public static void main(String[] args) {
//		Map<Student, String> map = new TreeMap<>(new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return Double.compare(o2.getHeight(), o1.getHeight());
//			}
//		
//		});
		
		//简化
		Map<Student, String> map = new TreeMap<>((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()));
			
		
		map.put(new Student("蜘蛛精", 25, 168.5), "盘丝洞");
		map.put(new Student("蜘蛛精", 25, 168.5), "水帘洞");
		map.put(new Student("至尊宝", 23, 163.5), "水帘洞");
		map.put(new Student("牛魔王", 28, 183.5), "牛头山");
		System.out.println(map);

	}

}
