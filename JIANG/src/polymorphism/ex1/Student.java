package polymorphism.ex1;

public class Student extends People{
	public String name = "子类Student的名称";
	@Override
	public void run() {
		System.out.println("学生跑的贼快");
	}
	
	
}
