package Lesson3_3.regex;

public class Practice1 {

	public static void main(String[] args) {
		// 呼び出し
		//二回ずつ

		System.out.println(isUserNameValid("256sa3"));
		System.out.println(isPasswordValid("256s+a3"));
		
		if(isUserNameValid("256sa3")) {
			System.out.println("用户名创建成功");
		}else {
			System.out.println("用户名创建失败");
		}
		
		
		if(isPasswordValid( "aw33f9oo_o") ){
			System.out.println("密码创建成功");
		}else {
			System.out.println("密码创建失败");
		}
		
	}

	public static boolean isUserNameValid(String name) {
			
		return name.matches("[a-zA-Z0-9]+");
	}
	
	
	public static boolean isPasswordValid(String password){
		return password.matches("\\w{8,}");
	}
}
