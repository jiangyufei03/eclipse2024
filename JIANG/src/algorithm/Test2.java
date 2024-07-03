package algorithm;

import java.util.Arrays;

public class Test2 {
//桉顺序排列数组
	public static void main(String[] args) {
		// 1.准备好一个数组
		int[] arr = {5, 1, 3, 2};
		//			 0  1  2  3
		
		//2.控制选择几轮
		for(int i = 0; i < arr.length - 1; i++) {
			// i = 0 第一轮	（占第一个位置与跟后面比较）	j = 1 2 3
			// i = 1 第二轮	（占第二个位置与跟后面比较）	j = 2 3
			// i = 2 第三轮	（占第三个位置与跟后面比较）	j = 3
			
			// 3.控制每轮选择几次(j < 4 —— 最终到3）
			for (int j = i + 1; j < arr.length; j++) {
				//判断当前位是否大于后面位置处的元素值，若大于则交换
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			   
		}
		System.out.println(Arrays.toString(arr));
	}

}
