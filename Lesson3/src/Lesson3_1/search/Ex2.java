package Lesson3_1.search;

public class Ex2 {

	public static void main(String[] args) {
		int[] data = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(search(data, 3));
		System.out.println(search(data, 50));
	}
	
	//二分探索
	
	static int search(int[] data, int val) {
		//1を指す
		int left = 0;
		//番地（index）长度（数字的个数）- 1为索引，因为索引从0开始
		int right = data.length - 1;
		int result = -1;
		
		//不知道折返几次所以用while
		while(left <= right) {
			// leftの値がrightの値以下の間繰り返す
			int middle = (left + right) / 2;
			if(data[middle] == val) {
				return middle;
			} else if(val < data[middle]){
				// 真ん中の値より小さかった場合
				//比中间值小，所以右边到中间值左边的数字为止，所以索引-1
				right = middle - 1;
			} else{
				// 真ん中の値より大きかった場合
				//左右缩小范围直到找到对应的值
				left = middle + 1;
			}
		}
		// どれにも当てはまらない場合
		return result;
	}
}
