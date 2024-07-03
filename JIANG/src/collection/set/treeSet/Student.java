package collection.set.treeSet;

import java.util.Objects;

public class Student implements Comparable<Student>{

	private String name;
	private int age;
	private double height;
	
	//重写compareTo方法
	//this 调方法，被比较的是o
	@Override
	public int compareTo(Student o) {
		// 如果认为左边对象大于右边对象，返回正整数，
		// 如果认为左边对象小于右边对象，返回负整数，相等为0
		// 需求：按照年龄升序排序
		return this.age - o.age;
	}
	
	
	public Student() {
	}
	
	public Student(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	//重写hashCode和equals方法
	
	//只要两个对象内容一样，返回的哈希值就是一样的
	@Override
	public int hashCode() {
		return Objects.hash(age, height, name);
	}

	//只要两个对象内容一样，就返回true
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Objects.equals(name, other.name);
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
}

