package Lesson2_5.try_catch;

public class Ex2 {

	public static void main(String[] args) {
		
		try {
			arrayTest();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("エラー！");
		}
	}
	
	public static void arrayTest() throws ArrayIndexOutOfBoundsException{
		//無理やりエラー発生させる
		throw new ArrayIndexOutOfBoundsException();
	}
	
	
}
