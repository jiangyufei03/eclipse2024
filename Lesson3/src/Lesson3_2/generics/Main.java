package Lesson3_2.generics;

public class Main {

	public static void main(String[] args) {
		// 和 list 相似
		//参照型であれば、OKです
		// <> 中要选择接收的类型
		
		Pocket<String> p = new Pocket<String>("Hello");
		
		//errorになっていない
		String s = p.getData();
		
		//变的话一起变
		Pocket<Integer> i = new Pocket<Integer>(123);
		int j = i.getData();
	}

}
