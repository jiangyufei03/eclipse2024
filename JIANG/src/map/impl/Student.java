package map.impl;

import java.util.Objects;

public class Student implements Comparable<Student> {

	// this		o
		@Override
	public int compareTo(Student o) {
		return this.age - o.age;	//年龄升序排序
	}

		private String name;
		private int age;
		private double height;
		
		//重写hashCode和equals方法
		@Override
		public int hashCode() {
			return Objects.hash(age, height, name);
		}

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

		public Student() {
		}
		
		public Student(String name, int age, double height) {
			this.name = name;
			this.age = age;
			this.height = height;
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

