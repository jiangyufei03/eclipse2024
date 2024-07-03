package Lesson3_3.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// List作成
		List<Teacher> teacher = new ArrayList<>();
		teacher.add(new Teacher("Sasaki",50));
		teacher.add(new Teacher("Tanaka",24));
		teacher.add(new Teacher("Suzuki",39));

		//method
		teacher.stream().filter(t -> t.getAge() < 50)
				.forEach( t -> System.out.println(t));
		
		System.out.println(
				teacher.stream()
				.filter(t -> t.getAge() < 50)
				.collect(Collectors.toList()));
	}

}
