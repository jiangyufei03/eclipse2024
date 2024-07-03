package stream.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class StreamTest3 {
//掌握Stream流提供的常见中间方法
	public static void main(String[] args) {
	List<Double> scores = new ArrayList<>();
	Collections.addAll(scores, 88.5, 100.0, 60.0, 99.0, 9.5, 99.6, 25.0);
	//需求1.找出成绩大于60分的数据，并升序输出
	//forEach是终结方法，不能再继续连接
	scores.stream().filter(s -> s >= 60).sorted().forEach(s -> System.out.println(s));
	
	List<Student> students = new ArrayList<>();
	Student s1 = new Student("蜘蛛精", 26, 172.5);
	Student s2 = new Student("蜘蛛精", 26, 172.5);
	Student s3 = new Student("紫霞", 23, 167.6);
	Student s4 = new Student("白晶晶", 25, 169.0);
	Student s5 = new Student("牛魔王", 35, 183.3);
	Student s6 = new Student("牛夫人", 34, 168.5);
	Collections.addAll(students, s1, s2, s3, s4, s5, s6);
	
	//需求2.找出年龄大于等于23，且年龄小于等于30岁的学生，并按照年龄降序输出
	//s此时代表学生对象，用学生对象来get年龄(要用重载的sorted方法)
	students.stream().filter(s -> s.getAge() >= 23 && s.getAge() <= 30)
			.sorted((o1, o2) -> o2.getAge()- o1.getAge())
			.forEach(a -> System.out.println(a));
	
	//需求3.取出身高前三名学生并输出
	students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()))
			.limit(3).forEach(System.out::println);
	
	//需求4.取出身高倒数的两名学生并输出
	//身高降序，找最后两个.skip 跳过前几个数据
	System.out.println("---------------------------------------");
	students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()))
			.skip(students.size() - 2).forEach(a -> System.out.println(a));

	
	//需求5.取出身高超过168的学生的名字，去除重复名字并输出
	//													把学生对象变成名字（加工）
	students.stream().filter(s -> s.getHeight() >= 168).map(s -> s.getName())
			.distinct().forEach(s -> System.out.println(s));

	//distinct 去重复，如果希望内容一样就去重复，则需要重写hashCode和equals方法
	students.stream().filter(s -> s.getHeight() >= 168)
			.distinct().forEach(s -> System.out.println(s));
	
	Stream<String> st1 = Stream.of("张三", "李四");
	Stream<String> st2 = Stream.of("张三2", "李四2", "王五");
	Stream<String> allSt = Stream.concat(st1, st2);
    allSt.forEach(System.out::println);
	}
}
