package Lesson2_3.capsule.practice3;

public class Main {

	public static void main(String[] args) {
		// インスタンス 
		Student alice = new Student("Alice", 20, "12345");
		alice.introduce();
		System.out.println("学生ID: " + alice.getStudentId());

	}

}
