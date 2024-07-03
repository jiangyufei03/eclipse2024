package map.impl;

import java.util.HashMap;
import java.util.Map;

public class Test1HashMap {
//掌握HashMap集合的底层实现原理

	public static void main(String[] args) {
		Map<Student, String> map = new HashMap<>();
		map.put(new Student("蜘蛛精", 25, 168.5), "盘丝洞");
		map.put(new Student("蜘蛛精", 25, 168.5), "水帘洞");
		map.put(new Student("至尊宝", 23, 163.5), "水帘洞");
		map.put(new Student("牛魔王", 28, 183.5), "牛头山");
		System.out.println(map);
		
		//此时因为哈希值不同，所以认为两个蜘蛛精不一样，如果想保留一个，要重写hashCode和equals方法
	}

}
