package Lesson2_4.inner_ex.ex1;

//外部クラス
class OuterClass {
	// staticなフィールド
	private static String str = "OuterClassの変数";
	private String name ="akemi";
	//外部的类中的方法	
	public void outerEx() {
		this.name =str;
	}

	// staticな内部クラス
	static class InnerClass {
		String str2 = "内部クラスのフィールドです。";
		public void innerSample() {
			//外部クラスのフィールドにアクセス（有static）
			System.out.println(str);
			//外部クラスのメソッドにアクセス（无static）
			//outerEx();//エラー
		}
		public void innerSample2() {
			//System.out.println(name);//エラー   name没有static
			System.out.println("内部クラスのメソッドです。");
		}
	}
}

public class Main1 {

	public static void main(String[] args) {
		//外部クラス名.内部クラス名 内部クラスのオブジェクト名 = new 外部クラス名.内部クラス名();
		// staticな内部クラスのインスタンスを生成（有static修饰的内部类的对象创建）
		OuterClass.InnerClass ic = new OuterClass.InnerClass();
		ic.innerSample();
		//ic.outerEx();
	}

}

