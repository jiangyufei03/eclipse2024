package extends_ex.constructor;

public class Test2 {

	public static void main(String[] args) {
		
		Teacher t = new Teacher("Tom", 36, "Java") ; //老师类里面有三个成员变量的数（skill，name，age）
		System.out.println(t.getName());
		System.out.println(t.getAge());
		System.out.println(t.getSkill());
	}

}

class Teacher extends People{
	
	private String skill;
	
	//处理对象的构造器拆到了多个类里去了，所以对象要通过调用多个构造器才能把对象的数据处理完整
	public Teacher(String name, int age, String skill) {
		super(name, age);
		this.skill = skill;
	}
	
	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
}


//父类
class People{
	private String name;
	private int age;
	
	public People() {
	}
	
	public People(String name, int age) {
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
	
	
}