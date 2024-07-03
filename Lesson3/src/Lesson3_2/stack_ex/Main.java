package Lesson3_2.stack_ex;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// stackの宣言
		Stack<Integer> numList = new Stack<Integer>();
		//データ追加
		numList.push(1);
		numList.push(2);
		numList.push(3);
		System.out.println(numList);
		//先頭から要素を取得して削除
		//后添加的先取出消除
		System.out.println(numList.pop());
		System.out.println(numList);
		//先頭から要素を削除しないで取得（確認するとき）
		System.out.println(numList.peek());
		System.out.println(numList);
		

	}

}
