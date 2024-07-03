package exception.IllegalArgumentException;

public class Ex {

	public static void main(String[] args) {
		/*
		 * IllegalArgumentException（非法参数异常）是Java中的一种异常，
		 * 通常表示在方法或构造函数中传递了不合法或不允许的参数。
		 * 这可能是由于参数的值不在预期范围内、类型不匹配或其他原因导致的
		 * 
		 * 1.不合法的值调用：例如，在以下代码中，
		 * 我们试图创建一个容量为负数的ArrayList，这是不合法的：
		 */
		
//		ArrayList array = new ArrayList(-20); // 负数容量是不合法的
		 
		
	String str = "あいうえおかきくけこさ"; // 11个字符的字符串
    if (str.length() > 10) {
        throw new IllegalArgumentException("字符串的长度太长（0-10个字符）");
    }
    System.out.println("字符串OK");
		
	}
}


