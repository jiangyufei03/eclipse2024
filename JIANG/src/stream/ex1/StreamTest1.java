package stream.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest1 {
//体验Stream的方法
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		Collections.addAll(names, "张三丰", "张无忌", "周芷若", "赵敏", "张强");
		System.out.println(names);
		//name = [张三丰, 张无忌, 周芷若, 赵敏, 张强]
		
		//找出姓张，且是三个字的名字，存入新的集合中
		//原来方式,建立一个新的集合
		List<String> list = new ArrayList<>();
		for(String name : names) {
			if(name.startsWith("张") && name.length() == 3) {
				list.add(name);
			}
		}
		System.out.println(list);
		
		//使用Stream流解决这个需求(Stream流支持链式编程) 定义一个变量s，用来代表集合中的每一个数据
		//filter --- 筛选 ；  collect --- 收集
		List<String> list2 = names.stream().filter(s -> s.startsWith("张"))
				.filter(a -> a.length() == 3).collect(Collectors.toList());
		System.out.println(list2);
	}

}
