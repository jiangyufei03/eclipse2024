package Lesson2_4.enum_ex.practice;

import Lesson2_4.enum_ex.ex1.Fruit;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Animal.CAT);
		System.out.println(Animal.CAT.getAnimalName());
		
		for(Animal name :Animal.values()) {
			System.out.println(name + " " + name.getAnimalName());
		}
	}

}
