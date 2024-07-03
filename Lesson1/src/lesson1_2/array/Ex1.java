package lesson1_2.array;

public class Ex1 {

	public static void main(String[] args) {
		
		//testの点数を格納する配列（参照型）を宣言
		int[]scores;
		
		//要素を作成し、変数へ格納する
		scores = new int [5];
		
		//住所が入っている（番地、アドレス）
		System.out.println(scores);
		
		
		//要素0番目の箱に値を代入(第一个数字《索引》是0）
		scores[0] = 20;
		
		//ArrayIndexOutOfBoundsException:
		//Index 5 out of bounds for length 5
		//System.out.println(scores[5]);

		scores[3] = 500;
		System.out.println(scores[3]);
		
	}

}
