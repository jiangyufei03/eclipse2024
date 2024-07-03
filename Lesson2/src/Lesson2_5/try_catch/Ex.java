package Lesson2_5.try_catch;

public class Ex {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		//method呼び出し
		System.out.println(test(arr));
	}

	public static String test(int[] array){
		
		try{
			System.out.println(array[1]);
		} catch ( ArrayIndexOutOfBoundsException e) {
			//return最後輸出			
			return "In catch block";
		} finally {
			//先輸出
			System.out.println("In finally block");
		}
		return "hello";
		
	}
	
}
