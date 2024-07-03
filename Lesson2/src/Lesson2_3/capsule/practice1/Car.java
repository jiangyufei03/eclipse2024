package Lesson2_3.capsule.practice1;

public class Car extends Vehicle {
	private int numDoors;

	public Car(String band, int speed, int numDoors) {
		super(band, speed);
		this.numDoors = numDoors;
	}

	
	//getter,setterメソッド
	
	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
	
	public void honk() {
		System.out.println("Honk honk!");
	}

}
