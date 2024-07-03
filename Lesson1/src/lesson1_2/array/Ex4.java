package lesson1_2.array;

public class Ex4 {

	public static void main(String[] args) {
		
		String[] array = {"A", "B", "C", "D"};
		array[0] = null;
		for(String name : array) {
			System.out.println(name);
		}
				
		//可以打印出null

	}

}
