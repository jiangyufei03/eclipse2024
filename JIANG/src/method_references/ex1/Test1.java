package method_references.ex1;

import java.util.Arrays;
import java.util.Comparator;

import arrays.compare.ex2.Student;

public class Test1 {

	public static void main(String[] args) {

		Student[] students = new Student[4];
		students[0] = new Student("蜘蛛精", 169.5, 23);
		students[1] = new Student("紫霞", 163.8, 26);
		students[2] = new Student("紫霞", 163.8, 26);
		students[3] = new Student("至尊宝", 167.5, 24);
		
		//原始写法，对数组中的学生对象，按照年龄升序排序
		Arrays.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		//使用lambda表达式后的简化形式
//		Arrays.sort(students,(o1, o2) -> o1.getAge() - o2.getAge());
		
		//1次简化
//		Arrays.sort(students,(o1, o2) -> CompareByData.compareByAge(o1, o2));
		
		//2次简化（静态方法引用）
//		Arrays.sort(students, CompareByData::compareByAge);
		
		System.out.println(Arrays.toString(students));
	}
}
