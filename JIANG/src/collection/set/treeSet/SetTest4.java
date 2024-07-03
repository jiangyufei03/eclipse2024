package collection.set.treeSet;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class SetTest4 {
//掌握TreeSet集合的应用
	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<>();
		set1.add(6);
		set1.add(5);
		set1.add(7);
		set1.add(6);
		System.out.println(set1);
		
		//就近选择自己自带的比较器对象进行比较
		Set<Student> students = new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2){
			//按照身高升序排序
			return Double.compare(o1.getHeight(), o2.getHeight());
			}
		});
		
		//简化
		Set<Student> students2 = new TreeSet<>((Student o1, Student o2) -> Double.compare(o1.getHeight(), o2.getHeight()));
		
		//没有办法进行排序，于是报错，但是可以自定义排序规则
		students.add(new Student("蜘蛛精", 23, 169.7));
		students.add(new Student("紫霞", 22, 169.8));
		students.add(new Student("至尊宝", 26, 165.5));
		students.add(new Student("牛魔王", 22, 183.5));
		System.out.println(students);
		
		//牛魔王和紫霞年龄一样被去掉了
	}

}
