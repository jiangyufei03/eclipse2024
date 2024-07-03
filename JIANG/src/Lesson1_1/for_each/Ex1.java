package Lesson1_1.for_each;

public class Ex1 {

	public static void main(String[] args) {

		//forEach 没有循环变量i ； 不指定循环起点 ； 不指定循环终点 ； 不指定步长（循环条件）
		//从头到尾按顺序遍历整个数组
		
		String[] s = { "a", "bb", "ccc", "dddd" };

		int totalLength = 0;
		//  声明变量（宣言）　　　ｓ:配列
		//  变量类型是数组类型： String    str ： 代表数组的值 
		//                         访问str这个变量来获取每个元素————变量类型即为数组元素类型
		for (String str : s) {
			totalLength += str.length();
		}
		System.out.println(totalLength);
		
		System.out.println("----------------------");
		
	//二维数组是一维数组的数组
	//（可以把一个二维数组理解成为一个一维数组，只不过这个数组的每个元素本身又是一个数组）
		int[][] n = {{1,2},{3,4,5},{6,7,8,9}};
    //	             n[0]   n[1]     n[2]
    //
	//       		数组	    	  数组类型		   元素类型
	//			  内层数组		  int[]             int
	//			  外层数组		 int[][]		   int[]
		
		//   外层数组：
		//   元素类型   变量取名（每个小数组的名字）--取到每个小数组，再进到小数组内部取到元素
		for (int[] innerArray : n) {
			//内层数组
			//   元素类型（再定义一个名字，实际就是内部数组的每个元素）  
			//                   刚取的名字 
			for (int number : innerArray) {
				System.out.print(number);
			}
		}
		
	}
}
