package algorithm;

import java.util.Arrays;

/*
 * 掌握二分法查找数据
 * */
public class Test3 {

	public static void main(String[] args) {
		//1.准备好一个数组
		int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
		
		System.out.println(binarySearch(arr, 150));
		
		System.out.println(Arrays.binarySearch(arr,81));
		
	}
//把数据的索引返回来
	public static int binarySearch(int[] arr, int data) {
		//1.定义两个变量，一个在左边，一个在最右边
		int left = 0;
		int right = arr.length - 1;
		
		//2.定义一个循环控制折半(不知道折几次用while)
		while(left <= right) {
			//3.每次折半，算出中间位置处的索引
			int middle = (left + right) / 2;
			//4.判断当前要找的元素值（数字），与中间位置元素值的大小情况
			if(data < arr[middle]) {
				//往左边找，截至位置(右边位置) = 中间位置 - 1
				right = middle - 1;
			}else if(data > arr[middle]){
				//往右边找,起始位置 = 中间位置 + 1
				left = middle + 1;
			}else {
				//中间位置处的元素值正好等于要找的元素值
				return middle;
			}
		}
		return -1; //-1特殊结果，代表没有找到数据，数组中不存在该数据
	}
}
