package Lesson2_3.this_and_super.practice;

public class Student extends Person{
	
	private int score;

	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
		
	}

	@Override
	public void display() {
		super.display();
		System.out.println("student");
	}
	
	

}
