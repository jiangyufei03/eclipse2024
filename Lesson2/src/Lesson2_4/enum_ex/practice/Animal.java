package Lesson2_4.enum_ex.practice;

public enum Animal {
	DOG("犬"), CAT("猫"), PIG("豚");
	
	private String animalName;

	private Animal(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalName() {
		return animalName;
	}
	
}
