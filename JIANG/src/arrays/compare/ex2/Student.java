package arrays.compare.ex2;
//					   		<>表示与什么类型进行比较
public class Student implements Comparable<Student>{
	private String name;
	private double height;
	private int age;
	
	//重写compareTo方法
	//这个方法用来给sort内部进行比较
	//sort方法内部进行两个两个比较
	//在重写方法内指定比较规则 比较者为this，被比较者为o
	
	@Override
	public int compareTo(Student o) {
		// 约定1：如果认为左边对象 大于 右边对象 ———— 返回任意正整数
		// 约定2：如果认为左边对象 小于 右边对象 ———— 返回任意负整数
		// 约定3：如果认为左边对象 等于 右边对象 ———— 返回0
		// 按照年龄升序排序
//		if(this.age > o.age) {
//			return 1;
//		} else if(this.age < o.age){
//			return -1;
//		}
//		return 0;
		
//		return this.age - o.age;	//升序
		return o.age - this.age;	//降序
	}

	public Student() {
	}

	public Student(String name, double height, int age) {
		this.name = name;
		this.height = height;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	//重写toString查看内容
	@Override
	public String toString() {
		return "Student [name=" + name + ", height=" + height + ", age=" + age + "]";
	}
	
	
	
	
}
