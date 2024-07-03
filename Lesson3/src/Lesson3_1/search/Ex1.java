package Lesson3_1.search;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {1, 3, 5, 7, 13, 19};
		//存在する値		
		System.out.println(search(data, 7));
		//存在しない値		
		System.out.println(search(data, 100));
	}
	//線形探索メソッド
	//				検索したい配列　　　検索したい値
	static int search (int[] data, int val) {
		for (int i = 0; i < data.length; i++) {
			if(data[i] == val) {
				//添え字の番号を返す(从0开始的索引)
				return i;
			}
		}
		//什么都没有的标记
		return -1;
	}
}
