package Lesson1_1.loop;

public class Continue {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++){
			if(i < 3) {
				continue;
			}
			System.out.println("loop");
		}
		//continue ： 结束该循环的当次执行，继续下一次执行 （进入到for循环的下一次执行）
		
	
	}

}
