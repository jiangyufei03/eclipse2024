package lesson1_3.method.practice;

public class Practice1 {

	public static void main(String[] args) {
	
		String result = checkParity(5);
		System.out.println(checkParity(5));
		System.out.println(checkParity(12));
		
	}

	//メソッドを定義
	static String checkParity(int num) {
		if(num % 2 == 0) {
			return  "even" ;			
		}else {
			return "odd";
		}
		
	}
	
	
}
