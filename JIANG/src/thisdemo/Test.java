package thisdemo;

public class Test {

	public static void main(String[] args) {
		//认识this，掌握this的应用场景
		//this是一个变量，可以拿到当前对象
		Student s1 = new Student();
		System.out.println(s1);
		s1.printThis();
		
		//打印出的this的值和s1的学生地址的值一样
		//证明this拿到了s1的学生对象		
		
		
		System.out.println("-----------------------");
		
		Student s2 = new Student();
		System.out.println(s2);
		s2.printThis();
		
		System.out.println("-----------------------");
		
		Student s3 = new Student();
		s3.score = 325;
		s3.printPass(250);
		
	}

}
