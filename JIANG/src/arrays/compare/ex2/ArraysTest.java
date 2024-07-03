package arrays.compare.ex2;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest {

	public static void main(String[] args) {
		// 掌握对数组中的对象排序
		Student[] students = new Student[4];
		students[0] = new Student("蜘蛛精", 169.5, 23);
		students[1] = new Student("紫霞", 163.8, 26);
		students[2] = new Student("紫霞", 163.8, 26);
		students[3] = new Student("至尊宝", 167.5, 24);
		
		// 1.public static void sort(类型[] arr)： 对数组进行排序
		//并不能为数组中的对象直接排序（多个数据，没有标准）
		//要自己制定比较规则
		
//		Arrays.sort(students);
//		System.out.println(Arrays.toString(students));
		
		//2. public static <T> void sort(T[] arr, Comparator<? super T> c)
		//参数一：需要排序的数组
		//参数二：Comparator比较器对象（用来制定对象的比较器规则）
		//				接口不能有对象，但是可以创建匿名内部类对象
		Arrays.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				//制定比较规则：左边对象o1，右边对象o2
				// 约定1：如果认为左边对象 大于 右边对象 ———— 返回任意正整数
				// 约定2：如果认为左边对象 小于 右边对象 ———— 返回任意负整数
				// 约定3：如果认为左边对象 等于 右边对象 ———— 返回0
				//按照身高升序排序
				//不能强转类型 178.1  178.0 == 0.1 --- 0
//				if(o1.getHeight() > o2.getHeight()) {
//					return 1;
//				}else if(o1.getHeight() < o2.getHeight()) {
//					return -1;
//				}
//				return 0;
				
				//简化
				return Double.compare(o1.getHeight(), o2.getHeight());		//升序
//				return Double.compare(o2.getHeight(), o1.getHeight());		//降序
			}
		});
		System.out.println(Arrays.toString(students));
		
	}

}
