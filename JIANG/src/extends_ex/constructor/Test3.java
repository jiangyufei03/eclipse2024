package extends_ex.constructor;

public class Test3 {

	public static void main(String[] args) {
		// 通过this（...）来调用兄弟（本类的其他）构造器
		Student s1 = new Student("张三", 26, "零零后大学");
		
		//需求：如果学生没有填写学校，那么学校默认就是A大学		
		Student s2 = new Student("李四", 29); 
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getSchoolName());

	}

}

class Student{
	private String name;
	private int age;
	private String schoolName;
	
	public Student() {
	}
	
	public Student(String name, int age) {
		//复用下面有参构造器的代码
		//this和super不能同时出现在构造器里，this和super都必须在第一行
		this(name, age, "A大学");
	}
	
	public Student(String name, int age, String schoolName) {
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
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
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
}