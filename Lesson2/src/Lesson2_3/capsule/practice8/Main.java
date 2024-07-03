package Lesson2_3.capsule.practice8;

public class Main {

	public static void main(String[] args) {
	
		Bank bank = Bank.getBank();
		System.out.println("名前：　" + bank.getUserName());
		System.out.println("パスワード：　" + bank.getPassword());
		bank.chechkAccount();
		

	}

}
