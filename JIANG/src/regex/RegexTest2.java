package regex;

import java.util.Scanner;

//校验用户输入的电话，邮箱，时间是否合法

public class RegexTest2 {

	public static void main(String[] args) {
//		checkPhone();
		checkEmail();
		
	}

	public static void checkPhone() {
		while(true){
			System.out.println("请输入您的电话号码（手机|座机）：");
			Scanner sc = new Scanner(System.in);
			//接收用户输入的一行数据
			String phone = sc.nextLine();
			//					剩下3到9出现9次			问号表示可有可无 5-20位
			if(phone.matches("(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})")){
				//								后面出现2到7个数字（任意数字出现2-7次）
				System.out.println("您输入的号码格式正确");
				break;
			} else {
				System.out.println("您输入的号码格式不正确");
			}
		}
	}
	
	public static void checkEmail() {
		while(true){
			System.out.println("请输入您的邮箱：");
			Scanner sc = new Scanner(System.in);
			//接收用户输入的一行数据
			String email = sc.nextLine();
			//			{}限制位数		@之前	注意	点的书写 	
			if(email.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}")){
				//								@之后2-10个字符	有的邮箱有域名，所以可能.cn
				System.out.println("您输入的邮箱格式正确");
				break;
			} else {
				System.out.println("您输入的邮箱格式不正确");
			}
		}
	}
	
}
