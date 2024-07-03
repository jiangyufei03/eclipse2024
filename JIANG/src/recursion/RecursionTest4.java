package recursion;

public class RecursionTest4 {

	public static void main(String[] args) {
		// 目标：猴子吃桃问题
		//f(10) = 0
		//公式：f(x) - f(x) / 2  - 1 = f(x + 1)
		//变形： 2f(x) - f(x) - 2 = 2f(x + 1);
		//变形2: f（x） = 2f(x + 1) + 2;
		//求f（1） = ？
		System.out.println(f(1));
		System.out.println(f(2));
		System.out.println(f(3));
	}

	public static int f(int x) {
		if(x == 10) {
			return 1;
		}else {
			return 2 * f(x + 1) + 2;
		}
		
	}
	
}
