package arrays.ex1;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

//掌握Arrays类的常用方法

public class Test1 {

	public static void main(String[] args) {
		// 1. public static String toString（类型[] arr）： 返回数组内容
		// 可以接受任意类型的数组进来，把数组的内容拼接好，再以字符串的形式返回
		int[] arr = {10, 20, 30, 40, 50, 60};
		//不返回字符串的话是一堆地址
		System.out.println(Arrays.toString(arr));
		
		//2. public static 类型[] copyOfRange(类型[] arr， 起始索引， 结束索引) ： 拷贝数组（指定范围，包前不包后）
		int[] arr2 = Arrays.copyOfRange(arr, 1, 4);
		System.out.println(Arrays.toString(arr2));
		
		//3. public static copyOf(类型[] arr， int newLength)： 拷贝数组，可以指定新数组的长度
		//数组扩容
		int[] arr3 = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(arr3));
		int[] arr4 = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr4));
		
		//4. public static setAll(double[] array, IntToDoubleFunction generator)： 把数组中的元数据改为新数据又存进去
		double[] prices = {99.8, 128, 100};
		//			 			0， 1， 2
		//把所有的价格都打八折，然后存进去
		Arrays.setAll(prices, new IntToDoubleFunction() {
			@Override
			public double applyAsDouble(int value) {
				//         				value 取数组索引
				return prices[value] * 0.8;
			}
		});
		System.out.println(Arrays.toString(prices));
		
		// 5. public static void sort(类型[] arr)： 对数组进行排序（默认是升序排序）
		Arrays.sort(prices);
		System.out.println(Arrays.toString(prices));
		
	}

}
