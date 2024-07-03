package lesson2_1.practice3;

public class Main {

	public static void main(String[] args) {
		Student alice = new Student("Alice",18,"料理");
		Student bob = new Student("Bob",28,"game");

		//Aliceは18歳で趣味は料理です
		alice.hello();
		//bobは28歳で趣味はgameです
		bob.hello();
	}
}