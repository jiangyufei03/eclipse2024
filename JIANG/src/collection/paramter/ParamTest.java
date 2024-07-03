package collection.paramter;

import java.util.Arrays;

public class ParamTest {
	// 认识可变参数，掌握其作用(定义在方法或者构造器上，用来灵活接收数据)
	public static void main(String[] args) {
		//特点
		test();//不传数据
		test(10);//传输一个数据
		test(10, 20, 30);//传输多个数据
		test(new int[] {10, 20, 30, 40});//传输一个数组给可变参数
		
		

	}
	//注意事项：1.一个形参列表中只能有一个可变参数（多个的话不知道谁来接数据）
	//注意事项：2.可变参数必须放在形参列表的最后面
	public static void test(int...nums) {
		//可变参数在方法内部本质就是一个数组
		System.out.println(nums.length);	//长度属性是数组专有的
		System.out.println(Arrays.toString(nums));
		System.out.println("--------------------------------------");
	}
	
}
