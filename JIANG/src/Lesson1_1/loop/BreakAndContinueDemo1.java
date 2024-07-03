package Lesson1_1.loop;

public class BreakAndContinueDemo1 {

	public static void main(String[] args) {
		// 掌握break和continue的作用
		//1.break ： 跳出并结束当前所在循环的执行
		//2.五句 I love you. 第三句时候改变主意，不再执行
		
		for (int i = 1;i <= 5; i++) {
			System.out.println(" I love you: " + i );
			if (i == 3) {
				break;	//跳出并结束所在循环的执行（遇到break这个循环就结束了）
			}
		}
	 
		//2.continue： 跳出当前循环的当次执行，直接进入到循环的下一次执行
		//洗碗五天，第三天的时候被宽恕不用洗，第四天还要继续
		for(int i = 1; i <= 5; i++) {
			if(i == 3) {
				continue;	//已经到了第三天，跳过
			}
			System.out.println("洗碗: " + i);
				
		}
//		1.break只能在循环loop(for,while,do-while)或switch分支中出现, 不能单独使用在if条件句中不能出现
//																for循环中的if条件句中可以使用
//		2.continue只能在循环中使用（switch也不行）
		
		
	}

}
