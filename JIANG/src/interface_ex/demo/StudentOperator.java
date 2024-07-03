package interface_ex.demo;
import java.util.ArrayList;

public interface StudentOperator {
//抽象方法
	//打印全班同学信息
	void printAllInfo(ArrayList<Student> students);
	//打印全部平均成绩
	void printAverageScore(ArrayList<Student> students);
	
}
