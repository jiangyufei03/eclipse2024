package lesson1_3.practice;

public class Ex4 {

	public static void main(String[] args) {
		// 正三角形、二等辺三角形、不等辺三角形のどれであるかを判定し、結果を出力するプログラム

		int side1 = 5;
		int side2 = 10;
		int side3 = 10;
		
		if(side1 == side2 && side2 == side3) {
			System.out.println("正三角形です.");
		}else if (side1 != side2 && side2 != side3 && side1 != side3) {
			System.out.println("不等辺三角形です.");
		}else  {
			System.out.println("二等辺三角形です.");
		}	
		
		System.out.println("------------------------------------");
		
		if(side1 == side2 && side2 == side3) {
			System.out.println("正三角形です.");
		}else if (side1 == side2 || side2 == side3 || side1 == side3) {
			System.out.println("二等辺三角形です.");
		}else  {
			System.out.println("不等辺三角形です.");
		}	
		
		
	}

}
