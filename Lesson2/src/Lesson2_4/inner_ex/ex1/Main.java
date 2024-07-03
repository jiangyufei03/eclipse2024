package Lesson2_4.inner_ex.ex1;

public class Main {

	public static void main(String[] args) {
		//外部クラス名 外部クラスのオブジェクト名 = new 外部クラス名();
		//外部クラス名.内部クラス名 内部クラスのオブジェクト名 = 外部クラスのオブジェクト名.new 内部クラス名();

		//外部クラスのインスタンス化（和之前一样）
		Sample sample = new Sample();

		//内部クラスのインスタンス化
		//无static修饰的内部类的对象创建
		//（外部类名.内部类名 内部变量名 = 外部变量名.new.内部类名 ）
		Sample.Sample2 sample2 = sample.new Sample2();

		//外部クラスのインスタンスから外部クラスのメンバ変数を呼ぶ
		System.out.println(sample.str1);
		//外部クラスのインスタンスから外部クラスのメソッドを呼び出す。
		sample.outerExe();
		//外部クラスから内部クラスのメンバ変数を呼び出すことはできない。
		//System.out.println(sample1.str2);
		System.out.println("--------------------");
		//内部クラスから内部クラスのメンバ変数を呼び出す
		System.out.println(sample2.str2);
		sample2.innerExe();
		//System.out.println(sample2.str1);
	    //sample2.outerExe();

	}

}
