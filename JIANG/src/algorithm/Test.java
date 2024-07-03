package algorithm;

import java.util.Arrays;

/*掌握冒泡排序的编写
*/
public class Test {

	public static void main(String[] args) {
		//1.准备一个数组
		int[] arr = {5, 2, 3, 1};
				
		//2.定义一个循环控制排序几轮(3轮，数组长度是4）
		for (int i = 0; i < arr.length - 1; i++) {
			//i = 0, 1, 2        【5.2.3.1】		次数
//			i = 0 第一轮		j	  0 1 2	  		3次
//			i = 1 第二轮   		  0 1			2次
//			i = 2 第三轮			  0				1次
			//3.定义一个循环控制每轮比较几次	
			for (int j = 0; j < arr.length - i - 1; j++) {
				//判断当前位置的元素值，是否大于后一个位置的元素值，如果大则交换
				if(arr[j] > arr[j+1]){
					//临时变量,把后一个值先放在临时变量里
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
