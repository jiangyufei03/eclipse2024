package Lesson2_3.capsule.practice3;

public class Student extends Person{
	//メンバー変数
	private String studentId;

	//コンストラクタ
	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	//メソッド
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
}
