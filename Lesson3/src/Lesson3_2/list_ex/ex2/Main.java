package Lesson3_2.list_ex.ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// リスト宣言
		List<Cat> cats = new ArrayList<Cat>();
		//
		//Catのインスタンス化を格納
		cats.add(new Cat("Kitty", 2)); 	//0番目
		cats.add(new Cat("Bob", 5));	//1番目
		
		System.out.println(cats);
		//toStringを使わない方法,getter,setter
		//						0番目	名前
		System.out.println(cats.get(0).getName());
		//						1番目	年齢
		System.out.println(cats.get(1).getAge());
	}

}
