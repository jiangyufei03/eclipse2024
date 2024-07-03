package week2_jiangyufei.practice3;

public class Main {

	public static void main(String[] args) {
		Teacher teacher = Teacher.getTeacher();
		System.out.println("name: " + teacher.getName());
		System.out.println("subjet: " + teacher.getSubject());
		teacher.teach();

	}

}
