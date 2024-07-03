package collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest1 {

	public static void main(String[] args) {
		// 1.public static <T> boolean addAll(Collection<? super T> c, T...elements):为集合批量添加数据
		List<String> names = new ArrayList<>();
		Collections.addAll(names, "张三", "王五", "李四", "张麻子");
		System.out.println(names);

		//2.public static void shuffle(List<?> list):打乱List集合中的元素数据(只有List集合是有序的)
		Collections.shuffle(names);
		System.out.println(names);
		
		
		//3.public static <T> void sort(List<T> list):对List集合中的元素进行升序排序
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(2);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);//升序排序
		
		
		//4.public static <T> void sort(List<T> list,  Comparator<? super T> c):对List集合中的元素
		//按照比较器对象指定的规则进行比较
		
//		Collections.sort(students, new Comparator<Student>(){
//			@Override
//			public int compare(sudent1, student2) {
//				return Double.compare(o1.getHeight(), o2.geHeight());
//			}
//		});
		
		
	}

}
