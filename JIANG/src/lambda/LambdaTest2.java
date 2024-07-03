package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

import arrays.compare.ex2.Student;

public class LambdaTest2 {

	public static void main(String[] args) {
		// 使用lambda简化函数式接口
		
		double[] prices = {99.8, 128, 100};
//		Arrays.setAll(prices, new IntToDoubleFunction() {
//			@Override
//			public double applyAsDouble(int value) {
//				return prices[value] * 0.8;
//			}
//		});
//		System.out.println(Arrays.toString(prices));
		
		//简化后
//		Arrays.setAll(prices, (int value) -> {
//				return prices[value] * 0.8;
//		});
		
		//1次简化后
//		Arrays.setAll(prices, (value) -> {
//			return prices[value] * 0.8;
//		});
		
		//2次简化后
//		Arrays.setAll(prices, value -> {
//			return prices[value] * 0.8;
//		});
		
		//3次简化后
		Arrays.setAll(prices, value -> prices[value] * 0.8);
		
		System.out.println(Arrays.toString(prices));
		
		
		System.out.println("--------------------------------");
		
		Student[] students = new Student[4];
		students[0] = new Student("蜘蛛精", 169.5, 23);
		students[1] = new Student("紫霞", 163.8, 26);
		students[2] = new Student("紫霞", 163.8, 26);
		students[3] = new Student("至尊宝", 167.5, 24);
		
//		Arrays.sort(students, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return Double.compare(o1.getHeight(), o2.getHeight());		//升序
//			}
//		});
//		System.out.println(Arrays.toString(students));
		
		//简化后
//		Arrays.sort(students,(Student o1, Student o2) -> {
//				return Double.compare(o1.getHeight(), o2.getHeight());		//升序
//		});
		
		//1次簡化后(只有一个参数的时候才能省略小括号)
//		Arrays.sort(students, (o1, o2) -> {
//			return Double.compare(o1.getHeight(), o2.getHeight());		//升序
//		});
		
		//2次簡化后
		Arrays.sort(students, (o1, o2) ->  Double.compare(o1.getHeight(), o2.getHeight()));
		
		
		System.out.println(Arrays.toString(students));
		
		
	}

}
