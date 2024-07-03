package collection.traverse.ex1;

import java.util.ArrayList;
import java.util.Collection;

//使用增强for遍历集合
public class Demo02 {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		c.add("赵敏");
		c.add("小昭");
		c.add("素素");
		c.add("灭绝");
		System.out.println(c);
		// c = [赵敏, 小昭, 素素, 灭绝]
		//       ele
		
		//使用增强for遍历集合
		for(String ele : c) {
			System.out.println(ele);
		}
		
		//使用增强for遍历数组
		String[] name = {"迪丽热巴", "古力娜扎", "嘻嘻哈哈"};
		for (String s : name) {
			System.out.println(s);
		}
	}

}
