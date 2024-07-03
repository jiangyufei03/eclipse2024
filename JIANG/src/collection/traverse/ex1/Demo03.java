package collection.traverse.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

//从JDK8开始的Lambda表达式遍历Collection集合

public class Demo03 {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<>();
		c.add("赵敏");
		c.add("小昭");
		c.add("殷素素");
		c.add("周芷若");
		System.out.println(c);
		// c = [赵敏, 小昭, 殷素素, 周芷若]
		//  	 s
		
							//	Consumer 是个接口，不能创建对象
		// default void forEach(Consumer<? super T> action) : 结合Lambda表达式遍历集合
				// 创建匿名内部类对象
		c.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {	//送给accept方法接收
				System.out.println(s);
			}
		});
		
		
		//进行简化
		c.forEach((String s) -> {	//送给accept方法接收
				System.out.println(s);
		});
		
		//只有一个参数的情况，小括号类型也可以省掉
		c.forEach(s -> {	//送给accept方法接收
			System.out.println(s);
		});
		
		//					print是方法 out是对象
		c.forEach(s -> System.out.println(s) );
		
		//再次简化
		c.forEach(System.out::println );
		
		
	}

}
