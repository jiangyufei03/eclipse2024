package lesson1_2.practice;

public class Practice {

	public static void main(String[] args) {
		// 配列変数名　menu
		//カレー　ハンバーグ　焼肉
		//配列作成
		//焼肉でお願いします
		
		String []menu = {"カレー","　ハンバーグ","焼肉"};
		String order = menu[2];
		System.out.println("注文は"+order+"でお願いします。");
		
		System.out.println("-----------------------------");
		
		int[][] array2D = {{1,2,3},{7,8}};
		System.out.println(array2D[1][0]+"\n"+array2D[1][0]);
		//                               双引号
		
		System.out.println("-----------------------");
		
		//コンソールで”を表示
		//System.out.println(""");  不能打印出双引号此符号
		System.out.println("\"");
		
		System.out.println("-----------------------");
		
		System.out.println(124+"\n"+56);
		
		}
		
		
	}


