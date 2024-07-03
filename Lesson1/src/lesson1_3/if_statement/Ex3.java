package lesson1_3.if_statement;

public class Ex3 {

	public static void main(String[] args) {
		// 条件演算子(三項演算子)
		int age = 20;
		String message =( age > 18)? "成人です": "未成年です";
		System.out.println(message);
		System.out.println((age > 18)? "成人です": "未成年です");
	}
}
