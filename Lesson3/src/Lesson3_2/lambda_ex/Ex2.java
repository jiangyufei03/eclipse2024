package Lesson3_2.lambda_ex;

interface Introduce{
	String intro(String name, String hobby);
}

public class Ex2 {

	public static void main(String[] args) {
		// 省略しないラムダ式の書き方
		
//		Introduce i = (String name, String hobby) -> { 
//			String hello = "name: " + name + ",hobby： " + hobby;
//			return hello;
//		};
		
		
		//i 对象，intro接口方法
//		System.out.println(i.intro("Taro", "Game"));
		
		//省略したラムダ式の書き方
		Introduce i = ( name,  hobby) -> { 
			String hello = "name: " + name + ",hobby： " + hobby;
			return hello;
		};
		
	}

}
