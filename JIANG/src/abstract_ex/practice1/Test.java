package abstract_ex.practice1;

public class Test {

	public static void main(String[] args) {
		// 掌握抽象类的好处
		Animal a = new Cat();
		a.setName("叮当猫");
		a.cry();	//多态
		
	}

}
