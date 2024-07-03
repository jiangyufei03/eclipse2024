package Lesson3_2.practice.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main4 {

	public static void main(String[] args) {
		
		List<Student> student = new ArrayList <Student>();
		student.add(new Student("Alice", 19, 110120)); 	
		student.add(new Student("Bob", 21, 110121)); 
		student.add(new Student("Carol", 20, 110122)); 
		student.add(new Student("Dave", 19, 110123)); 
		
		System.out.println(
				student.stream()
				.sorted((s1, s2) ->s1.getAge() - s2.getAge())
//				.collect(Collectors.toList())
				);
		
		//for each,在foreach内部打印
		
			student.stream()
			.sorted((s1, s2) -> s1.getAge() - s2.getAge())//小⇒大
			.collect(Collectors.toList())
			.forEach(e -> System.out.println("名前：" + e.getName() + " 年齢：" + e.getAge()));
	    }
				
				
	}
		


