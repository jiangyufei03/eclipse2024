package lesson2_1.static_ex.not_static;

public class Main {

	public static void main(String[] args) {
		
		Cat kitty = new Cat();
		Cat bob = new Cat();
		Cat alice = new Cat();
		
		System.out.println(Cat.counter);
	}

}
