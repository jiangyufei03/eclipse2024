package Lesson2_3.capsule.practice2;

public class Manager extends Employee{
	
	//メンバー変数
	private String department;

	//コンストラクタ
	public Manager(String name, int employeeID, double salary, String department) {
		super(name, employeeID, salary);
		this.department = department;
	}
	
	//メソッド
	public String getDepartment() {
		return department;
	}

}
