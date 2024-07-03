package extends_ex.override;

public class Student {
	
	private String name;
	private int age;
	
	//无参构造器
	public Student() {
	}

	
	//有参构造器
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//手写重写to String方法
//	@Override
//	public String toString() {
//		return "Student{name=" + name + ",age=" + age + "}";
//	}
	
//自动生成的to String方法	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
