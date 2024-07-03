package Lesson1_1.array;

public class Demo1 {

	public static void main(String[] args) {
		// 多个变量指向同一个数组对象的形式，并掌握其注意事项
		int[] arr1 = {11, 22, 33};
		
		
		//把数组对象的地址赋值给arr2
		int[] arr2 = arr1;
		
		//两个数组变量的地址相同，指向同一个变量		
		System.out.println(arr1);
		System.out.println(arr2);
		
		arr2[2] = 99;
		System.out.println(arr1[2]);
		
		arr2 = null;
		//输出没有问题，但不能访问数组对象和数组长度
		System.out.println(arr2);
		
		//NullPointerException ，是null的情况下不能访问他的功能
		//System.out.println(arr2[0]);
		
		
		String[] menu = {"唐揚げ", "寿司", "ラーメン", null, "すき家"};
		System.out.println(menu[3]);
		menu[4] = null;
		for(String name : menu) {
			System.out.print(name + " ");
		}
		
	}

}
