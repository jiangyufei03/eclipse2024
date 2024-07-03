package Lesson2_2.extends_ex.practice1;

public class Dog extends Animal implements Runnable{
	String color;

	public Dog(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog [color=" + color + "]";
	}
	
	@Override
	public void sounds() {
		System.out.println("ワンと鳴く");
	}
	
	@Override
	public void run() {
		System.out.println("犬が走る");
	}
	
}

