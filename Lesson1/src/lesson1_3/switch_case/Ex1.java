package lesson1_3.switch_case;

public class Ex1 {

	public static void main(String[] args) {
		//運勢占いゲーム
		
		//好き番号を変数に格納
		
		
		int fortune = 1;
		
		//	fortnueという変数の値に基づいて異なる処理を行う
		//case1 可以无
		
		switch (fortune) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("中吉");
			break;
		case 3:
			System.out.println("小吉");
			break;
		default:
			System.out.println("凶");
		
		}
	
		int fortune2 = 15;
		switch (fortune2) {
		case 1,2,3:
			System.out.println("大吉");
			break;
		case 4,5,6:
			System.out.println("中吉");
			break;
		case 7,8,9:
			System.out.println("小吉");
			break;
		default:
			System.out.println("凶");
	
		}
	}

}
