package lesson1_3.method.practice;

public class Practice3 {

	public static void main(String[] args) {
		
		int n = calculateStringLength("Hello");
		System.out.println(n);
	    System.out.println("文字の長さ：" + n);
	    

	}

	static int calculateStringLength(String name) {
		int i = name.length();
		return i;
		//文字列の長さ　　ｓｔｒ.length()
				
	}
}
