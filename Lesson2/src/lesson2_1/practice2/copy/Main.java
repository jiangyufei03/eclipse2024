package lesson2_1.practice2.copy;

public class Main {

	public static void main(String[] args) {
		//インスタンス作成
		Student s1 = new Student("太郎", 75);
		Student s2 = new Student("花子", 80);
		
		s1.showScore();
		s2.showScore();
		
	}

}
