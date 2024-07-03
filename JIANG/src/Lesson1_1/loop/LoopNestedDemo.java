package Lesson1_1.loop;

public class LoopNestedDemo {

	public static void main(String[] args) {
		//循环嵌套：外部循环每执行一次，内部循环会执行完一轮
		//打印三行四列星星
		//外部循环控制打印多少行
		 for (int i = 1; i <= 3; i++) {
			 //定义一个循环控制每行打印多少星星（不换行）
			 //内部循环控制每行打印多少星星（列）		 
			 for (int j = 1; j <= 4; j++) {
				 System.out.print("*");
			 }
			 //打完一行之后需要换行("\n")
			 System.out.println();
			}
			

	}

}
