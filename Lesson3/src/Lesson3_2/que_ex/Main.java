package Lesson3_2.que_ex;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		//キューの宣言
		Queue<Integer> numList = new LinkedList<Integer>();
		//add data
		numList.offer(1);
		numList.offer(2);
		numList.offer(3);
		//先頭の要素を取得して削除
		System.out.println(numList.poll());
		System.out.println(numList);
		//先頭の要素を削除しないで取得
		System.out.println(numList.peek());
		System.out.println(numList);
		
	}

}
