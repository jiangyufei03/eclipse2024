package practice.ex1;

public class Student extends Person implements Runnable{

	//メンバー変数
	private String studentId;

	//コンストラクタ
	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	//メソッド
	@Override
	public void run() {
		System.out.println(name + " is running.");
	}
	
}
