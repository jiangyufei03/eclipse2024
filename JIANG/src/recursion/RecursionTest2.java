package recursion;

public class RecursionTest2 {
//掌握递归的应用，执行流程和算法思想
	
	public static void main(String[] args) {
		System.out.println("5的阶乘是" + f(5));
	}
	
	public static int f(int n) {
		//终结点
		if(n == 1) {
			return 1;
		}else {
			return f(n- 1) * n;	//在调方法自己
		}
	}
}
