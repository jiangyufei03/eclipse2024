package stream.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest4 {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		Student s1 = new Student("蜘蛛精", 26, 172.5);
		Student s2 = new Student("蜘蛛精", 26, 172.5);
		Student s3 = new Student("紫霞", 23, 167.6);
		Student s4 = new Student("白晶晶", 25, 169.0);
		Student s5 = new Student("牛魔王", 35, 183.3);
		Student s6 = new Student("牛夫人", 34, 168.5);
		Collections.addAll(students, s1, s2, s3, s4, s5, s6);
		
		//需求1.计算出身高超过168的学生有几人
		long size = students.stream().filter(s -> s.getHeight() > 168).count();
		System.out.println(size);
		
		//需求2.找出身高最高的学生对象并输出
		Student s = students.stream().max((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()))
							.get();
		System.out.println(s);
		
		//需求3.找出身高最矮的学生对象并输出
		Student ss = students.stream().min((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()))
				.get();
		System.out.println(ss);
		
		//需求4.找出身高超过170的学生对象，并放到一个新集合中去返回
		//流只能收集一次
		List<Student> students1 = students.stream().filter(b -> b.getHeight() > 170)
										.collect(Collectors.toList());
		System.out.println(students1);
		
		//放到set集合里（去重复）
		Set<Student> students2 = students.stream().filter(b -> b.getHeight() > 170)
										.collect(Collectors.toSet());
		System.out.println(students2);
		
		//需求5.找出身高超过170的学生对象，并把学生对象的名字和身高，存入到一个Map集合并返回
		Map<String, Double> map = 
				students.stream().filter(a -> a.getHeight() > 170)
						.distinct()
						.collect(Collectors.toMap(a -> a.getName(), a -> a.getHeight()));
		System.out.println(map);
		
		
		Object[] arr = students.stream().filter(a -> a.getHeight() > 170).toArray();
		System.out.println(Arrays.toString(arr));
	}

}
