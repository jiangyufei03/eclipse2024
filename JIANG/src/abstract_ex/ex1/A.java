package abstract_ex.ex1;
//抽象类
public abstract class A {
	private String name;
	public static String schoolName;
	
	//抽象方法：用abstract修饰且不能写方法体（只有方法签名）
	public abstract void run();
	//有抽象方法就一定要申明成抽象类	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		A.schoolName = schoolName;
	}

	public A() {
	}
	
	public A(String name) {
		this.name = name;
	}
	
	
	
}
