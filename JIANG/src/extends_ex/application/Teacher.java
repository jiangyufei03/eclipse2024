package extends_ex.application;

public class Teacher extends People{
	private String skill;
	
	public String getSkill() {
		return skill;
	}
	
	public void setSkill(String skill) {
		this.skill = skill;
	}

//	将子类代码提取到父类，不影响写方法对这些数据进行处理
	public void printInfo() {
		System.out.println(getName() + "具备的技能： " + skill);
	}
}
