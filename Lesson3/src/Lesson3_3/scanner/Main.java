package Lesson3_3.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("名前を入力してEnterを押してください");
			String name = scanner.nextLine();
			System.out.println("年齢を入力してEnterを押してください");
			int age = scanner.nextInt();
			System.out.println("あなたの名前" + name + ",年齢は" + age + "です。");
		} catch(InputMismatchException e) {
			e.printStackTrace();
		}
	}

}
