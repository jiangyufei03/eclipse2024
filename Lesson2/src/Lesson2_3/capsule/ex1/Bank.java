package Lesson2_3.capsule.ex1;

public class Bank {

	//メンバー変数
	//ユーザ名（默认不写的话只能本包内访问）
	 String name;
	//password　パスワード
	private String password;
	//残高
	private int balance;
	
	//コンストラクタ
	//如果不公开无法インスタンス	
	//删除private的变量并在下面固定输入内容
	public Bank(String name) {
		this.name = name;
		this.password = "123456";
		this.balance = 10;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
