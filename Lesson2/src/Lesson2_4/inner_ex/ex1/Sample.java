package Lesson2_4.inner_ex.ex1;

//外部クラス
public class Sample {
	String str1 = "外部クラスのフィールドです。";

	//外部类(外部类不能访问内部类的方法)（不能保证一定能创建内部类）
	public void outerExe() {
		System.out.println("外部クラスのメソッドを実行しました。");
		//innerExe();//外部から内部を読んだらエラーになる。
		
	}

	//内部クラス（無static）
	class Sample2 {
		String str2 = "内部クラスのフィールドです。";
		public void innerExe() {
			System.out.println("内部クラスのメソッドを実行しました。");
			//外部クラスのフィールドにアクセス
			System.out.println(str1);
			//外部クラスのメソッドにアクセス
			//内部类可以访问外部的方法			
			outerExe();
		}
	}
}