package method_references.ex1;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {

	public static void main(String[] args) {
		
		String[] names = {"boby", "angela", "Andy", "dlei", "caocao", "Babo", "jack", "Cici"};
		
		//进行排序
//		Arrays.sort(names);
		//默认按照首字母，abc排序，从大到小  A：65，a：97 按照首字符编号升序排序
		
		//需求：要求忽略首字符大小写进行排序（本质上是一个函数式接口，匿名内部类）
//		Arrays.sort(names, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				//         		o1 = "Andy"  o2 = "angle"
//				//制定比较规则
//				//			忽略大小写(认为A，a都是A)。如果首字符一样，拿次字符进行比较
//				return o1.compareToIgnoreCase(o2);
//			}
//		});
		
		//lambda简化后
//		Arrays.sort(names, (String o1, String o2) ->  o1.compareToIgnoreCase(o2) );
		//特定类型的方法引用
		Arrays.sort(names, String::compareToIgnoreCase );
		
		System.out.println(Arrays.toString(names));
		
		
	}

}
