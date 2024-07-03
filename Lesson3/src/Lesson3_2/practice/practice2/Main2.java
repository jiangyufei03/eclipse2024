package Lesson3_2.practice.practice2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Main2 {

	public static void main(String[] args) {
		// map
		
		Map<String, Person> personMap = new HashMap<>();
		
		// add data
		personMap.put("田中", new Person("tanaka", 28));
		personMap.put("鈴木", new Person("suzuki", 25 ));
		personMap.put("井澤", new Person("izawa", 32));
		
		if(personMap.containsKey("井澤")) {
			System.out.println(personMap.get("井澤").getName() + "はいます。");
		}
		
		
//		if(personMap.get("izawa") != null) {
//			System.out.println(personMap.get("izawa").getName() + "はいます。");
//		}
		
		//for each
		for (String p : personMap.keySet()) {
			System.out.println(p + "は" + personMap.get(p).getAge() + "歳");
		}
		
		//最年長
		int max = 0;
		for(String person : personMap.keySet()) {
			max = Math.max(max, personMap.get(person).getAge());
		}
		System.out.println(max + "歳が最年長です");
		
		
		Optional<Person> maxValue = personMap.values().stream()
                .max((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));    
		
		System.out.println(
				personMap.values().stream()
				.max((m1, m2) -> m1.getAge() - m2.getAge())
				.get()
				);
		
	}

}
