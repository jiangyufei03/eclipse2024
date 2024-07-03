package Lesson3_2.lambda_ex;

//別のクラス
interface Color{
	String write(String a);
}


public class Ex1 {

	public static void main(String[] args) {
		//  省略しないラムダ式の書き方
//		Color c = (String a) -> {
//			return a + "色です";
//		};
	
		//形式1		
		/*省略形参类型
		 * Color c = (a) -> {
			return a + "色です";
		};	
			
		2.省略小括号
		 * Color c = a -> {
			return a + "色です";
		};	
			
		3.只有一行代码，省略大括号
		 * Color c = a -> return a + "色です";
			
		4.处理内容只有return，可以省略return和{}
		 * Color c = a -> a + "色です";
		 * 
			*/
		
		//最终省略版本		
		Color c = a -> a + "色です";
		//调用结果		
		System.out.println(c.write("青い"));
		
	}

}
