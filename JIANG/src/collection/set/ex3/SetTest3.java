package collection.set.ex3;

import java.util.HashSet;
import java.util.Set;


public class SetTest3 {

	public static void main(String[] args) {

		Set<Student> students = new HashSet<>();
		
		Student s1= new Student("蜘蛛精", 23,169.5);
		Student s2 = new Student("紫霞",  26, 163.8);
		Student s3 = new Student("紫霞", 26, 163.8);
		Student s4 = new Student("至尊宝", 24, 167.5);
		//输出结果一样
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		System.out.println(students);
		
		
	}

}
