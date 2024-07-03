package Lesson1_1.loop;

public class For_Ex1 {

	public static void main(String[] args) {
		
		String[] s = {"a","bb","ccc","dddd"};
		
		int totalLength = 0;
		for (int i = 0; i < s.length ; i++ ) {
			totalLength += s[i].length();
		}
		System.out.println(totalLength);
	}
}
