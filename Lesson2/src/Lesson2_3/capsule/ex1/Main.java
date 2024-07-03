package Lesson2_3.capsule.ex1;

public class Main {

	public static void main(String[] args) {
		// bankインスタンス化
		Bank alice = new Bank("Alice");
		//public 呼び出し
		System.out.println(alice.name);
		//private 呼び出し
		System.out.println(alice.getPassword());
		//private 不能出力
		//用get方法获取private的password，调用getPassword
		
		//setterを呼び出す
		alice.setPassword("666666");
		System.out.println(alice.getPassword());
		
		alice.setBalance(10000);
		System.out.println(alice.getBalance());
	}

}
