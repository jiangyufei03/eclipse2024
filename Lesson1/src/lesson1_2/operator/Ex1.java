package lesson1_2.operator;

public class Ex1 {

	public static void main(String[] args) {
		
		//足し算
	    System.out.println(2 + 3);
		
		
		//割り算
		System.out.println(4 / 2);
		
		//
		System.out.println(5 % 2);
		
	
		
		//※割り算で割り切れない場合は、小数点は切り捨てされる
		
		System.out.println(5.0 / 2);
		
		// intよりもdoubleのほうが大きい型になるので、double型（大きい型）で演算される
		
		System.out.println(2 / 5.0);
		
		//片方のデータ型がStringの場合、もう片方もStringに変換して連結する
		
		//*出现字符后，后面变成连结，不是纯加减
		
		System.out.println(4+ 100 +"20"+ 40 + 50);
		
		//前置インクリメント
		//インクリメントしてから、使用する
		
		int zenchi = 1;
		System.out.println(++ zenchi);
		
		
		// 後置インクリメント
		//使用してから、インクリメントする（先用后加）
		int kouchi = 1;
		System.out.println(kouchi++); //1
		System.out.println(kouchi); //2
		
		
		int a = 100, b = 20, c = 30;
		System.out.println(a % b * c + a / b);
		
		
	}

}
