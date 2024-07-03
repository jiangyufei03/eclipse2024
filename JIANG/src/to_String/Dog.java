package to_String;

public class Dog {
	private String name;
	private int age;
	//	品种
	private String breed;
	
	public Dog(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}
	
	
}
