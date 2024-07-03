package week2_jiangyufei.practice3;

public class Teacher {
	
	//メンバー変数
	private String name;
	private String subject;
	
	//Teacherクラスの唯一のインスタンス
	private static Teacher teacher = new Teacher();
	
	//デフォルトコンストラクタ
	Teacher(){
		this.name = "ALice";
		this.subject = "Japanese";
	}
	
	//公開メソッド
	public void teach() {
		System.out.println("Hello");
	}
	
	//getter,setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public static Teacher getTeacher() {
		return teacher;
	}
}
