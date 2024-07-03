package lesson1_3.if_statement;

public class Ex2 {

	public static void main(String[] args) {
		//else 只能二选一
		//else if 多种条件下的选择
		
		// もし、scoreが90点より大きければ「A評価」
		// そうではなく、もし点数が60点より大きければ「B評価」
		// それ以外は「不合格」
		
		int score = 50;
		if (score > 90) { 
			System.out.println("A評価");
		}else if (score > 60) {
			System.out.println("B評価");
		}else if(score > 30) {
			System.out.println("C評価");
		}else {	
			System.out.println("不合格");
		}	
		
			
		//可以删除最后的else
		
		int a = 0;
		int b = 0;
		if(++a > 0 || ++b > 0) {
			System.out.println(a);  // 1
			System.out.println(b);  // 0
		// or条件　|| 如果前面已经是true的话后面就不执行，因此b不会进行加减，输出还是0
		}
	
		if(true) {
			System.out.println("A");
		}
		
		
	
       // 用不上	
		if(false) {
			System.out.println("A");
		}
		
		
		if(false)
			System.out.println(1);
			System.out.println(2);
		//如果不写中括号的话，if只管到下面一行代码，但因为是false所以不会通过
		
	}

}		
	


