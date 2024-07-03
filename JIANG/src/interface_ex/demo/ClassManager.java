package interface_ex.demo;
import java.util.ArrayList;

public class ClassManager {
	//集合容器
	 private ArrayList<Student> students = new ArrayList<>();
	 //面向接口编程
	 //第一套实现类
	// private StudentOperator studentOperator = new StudentOperatorImpl1();
	 private StudentOperator studentOperator = new StudentOperatorImpl2();
	
	public ClassManager() {
		Student s1 = new Student("迪丽热巴", '女',  99);
		students.add(s1);
//		students.add(new Student("迪丽热巴"， '女'， 99));
		students.add(new Student("古力娜扎", '女',  100));
		students.add(new Student("马尔扎哈", '男',  80));
		students.add(new Student("卡尔扎巴", '男', 60));
	}
	
//对象调第一套实现类的方法
	//打印全部学生的信息
	public void printInfo() {
		//上面创建的新变量 studentOperator	
		studentOperator.printAllInfo(students);
	}
	
	//打印全班学生的平均分	
	public void printScore() {
		studentOperator.printAverageScore(students);
		
	}
	
	
}
