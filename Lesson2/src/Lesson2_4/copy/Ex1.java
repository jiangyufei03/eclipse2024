package Lesson2_4.copy;

public class Ex1 {

	public static void main(String[] args) {
		int a = 1;
		int b =2;
		a = b;
		a = 3;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		int[] c = {1, 1};
		int[] d = {2, 2};
		c = d;
		//地址相同，指向同一内容，哪个改变都会一起改变
		c[0] = 3;
		System.out.println("c={" + c[0] + "," + c[1] + "}");
		System.out.println("d={" + d[0] + "," + d[1] + "}");

	}

}
