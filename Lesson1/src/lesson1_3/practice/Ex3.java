package lesson1_3.practice;

public class Ex3 {

	public static void main(String[] args) {
		
	//1から20までの整数の合計を計算し、その結果を出力するプログラムをforループを使って書いてください。
		
		int sum = 0;
		int[]n = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11, 12 ,13 ,14 ,15 ,16 ,17 ,18 ,19 ,20 };
		for (int i = 0; i < n.length ; i++) {
			sum += n[i];
		}
		
		System.out.println("合計" + sum);
		
		System.out.println("--------------------------------");
		
		for (int j = 1; j <= 20; j++ ) {
			sum +=  j;
		}
		System.out.println(sum);
	}

	
	
	
}
