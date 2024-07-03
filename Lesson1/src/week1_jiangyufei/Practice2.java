package week1_jiangyufei;

public class Practice2 {

	public static void main(String[] args) {
		double rs1 = calcTriangleArea(10.0, 5.0);
		double rs2 = calcCircleArea(5.0);
		
		System.out.println(rs1);
		System.out.println(rs2);
		

	}

	static double calcTriangleArea(double base, double height) {
	
		return base * height / 2;
	}

	// radius :半径
	static double calcCircleArea(double radius) {
		
		return 3.14 * radius * radius;
	}
	
	
}
