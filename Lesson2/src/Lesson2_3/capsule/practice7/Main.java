package Lesson2_3.capsule.practice7;

public class Main {

	public static void main(String[] args) {
		Login userLogin = Login.getLogin();
		// ユーザー名を取得し、表示。
		System.out.println(userLogin.getUserName());
		// パスワードを取得し、表示。
		System.out.println(userLogin.getPassword());
		// ログイン認証を実行し、結果を表示。
		userLogin.auth();
	}
 
}