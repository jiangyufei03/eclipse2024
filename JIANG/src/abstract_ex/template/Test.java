package abstract_ex.template;

public class Test {

	public static void main(String[] args) {
		// 抽象类的应用场景之一：经常用来设计模板方法模式
		/*
		 * 场景：学生和老师都要写作文
		 * 第一段相同
		 * 正文部分随意发挥
		 * 最后一段是一样的
		 */
		
		Teacher t = new Teacher();
		t.write();
		
		Student s = new Student();
		s.write();
		
	}

}
