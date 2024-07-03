package Lesson2_4.copy;

public class Ex2 {

	public static void main(String[] args) {
		// 配列の初期化
		int[] a = {1, 1};
		int[] b = {2, 2};
		
		//bの内容をaにコピーする（ディープコピー用的更多）
		//clone method
		
		//a = b.clone();
		
		//for文(*)
		for(int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}

		
		int[][] c = {{1, 1},{3,6}};
		int[][] d = {{2, 2},{5,9}};
		//int[][]  = new int[d.length[];
		for (int i = 0; i < d.length; i++) {
		    c[i] = new int[d[i].length];
		    for (int j = 0; j < d[i].length; j++) {
		        c[i][j] = d[i][j];
		    }
		}
		
		
		
		a[0] = 99;
		//別の住所
		System.out.println(a[0]);
		System.out.println(b[0]);
		
		String name = "Taro";
		String userName = "Taro";
		System.out.println(name == userName);	//住所の比較
		System.out.println(name.equals(userName));	//内容の比較
		
		
	}

}
