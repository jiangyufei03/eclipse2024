package Lesson2_3.capsule.practice8;

public class Bank {
	
	//メンバー変数
	private String userName;
	private String password;
	
	//メソッド:
	private static Bank bank = new Bank();
	
	private Bank() {
		this.userName =  "Tester" ;
		this.password = "9999" ;
	}		
			
		//getter,setter
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//インスタンスを取得するための静的メソッド
	public static Bank getBank() {
		return bank;
	}
	
	public void chechkAccount() {
		if (userName.equals( "Tester") && password.equals( "9999")) {
		System.out.println("アカウントを確認しました。");
		}
	}
	
}
