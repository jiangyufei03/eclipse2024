package lesson1_2.operator;

public class Ex3 {

	public static void main(String[] args) {
		// 変数の初期化
		int a = 7;
		int b = 4;
		
		//論理積（&&）	
		System.out.println(a < 9 && b > 3);
		System.out.println(a < 9 && b > 7);
	
		//論理和(||) (もしくは）
		System.out.println(a < 9 || b > 3);
		System.out.println(a < 9 || b > 7);
		System.out.println(a < 5 || b > 7);
		
		//否定(!)
		System.out.println(!(a < 9));     // !true == false
		System.out.println(!(a > 9));     // !false == true
		
	}

}
