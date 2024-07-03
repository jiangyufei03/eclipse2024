package recursion;

public class RecursionTest3 {
//递归的算法基础：解决求和
	public static void main(String[] args) {
		System.out.println("1-5的和：" + f(5));
		
		

	}

	public static int f(int n) { 
		if(n == 1) {
			return 1;
		} else {
			return f(n-1) + n;	//方法递归
		}
	}
}
