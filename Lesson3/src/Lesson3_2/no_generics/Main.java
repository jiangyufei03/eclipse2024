package Lesson3_2.no_generics;

public class Main {

	public static void main(String[] args) {
		//Object 可以接一切类型的数据
		Pocket p = new Pocket("Hello");
		
		//Object 可以接一切类型的数据，在这里无法判断是什么类型的数据
		//	 		需要准确转换成String类型
		String s = (String) p.getData();
		
		//需要转换
//		Pocket a = new Pocket(123);
//		int b = (int) a.getData();

	}

}
