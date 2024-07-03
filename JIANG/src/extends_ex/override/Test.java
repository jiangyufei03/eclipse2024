package extends_ex.override;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// 目标：认识方法重写，掌握应用场景
		
		//b对象就近选择b类中重写后的方法
		B b = new B();
		b.print1();
		b.print2(2, 3);
		
		System.out.println("--------------");
		
		Student s = new Student("波妞", 19);
		
		//返回学生对象在内存中的地址
		System.out.println(s.toString());
		System.out.println(s);
		
//		当发现输出的不是地址而是对象时，则表示to String被重写了
		
//		ArrayList<E> list = new ArrayList();
//		list.add("java");
//		System.out.println(list);
		
	}

}
