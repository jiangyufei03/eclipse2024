package extends_ex.application;

public class Test {

	public static void main(String[] args) {
		// 继承的优势
		
		Teacher t = new Teacher();
		t.setName("bozai");
		t.setSkill("java,Spring");
		System.out.println(t.getName());
		System.out.println(t.getSkill());
		t.printInfo();

	}

}
