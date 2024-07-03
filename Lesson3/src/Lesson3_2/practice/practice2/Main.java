package Lesson3_2.practice.practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// インスタンス化

		List<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person("tanaka", 28));
		personList.add(new Person("suzuki", 25));
		personList.add(new Person("izawa", 32));
		
		//拡張for文
		for(Person data : personList) {
			System.out.println(data.getName() + "は" + data.getAge() + "歳");
		}
		
		//tanakaの部分
		System.out.println("一件目は" + personList.get(0).getName() + "さんです。");
		
		//年齢の若い人から歳をとった方の順に並び替え
		System.out.println(
				personList.stream()
				.sorted((s1, s2) -> s1.getAge() - s2.getAge())
				.collect(Collectors.toList())
			);
		
		//for eachで表示する
		personList.stream()
		.sorted((s1, s2) -> s1.getAge() - s2.getAge())
		.forEach( a -> System.out.println("名前：　" + a.getName() + " 年齢：　" + a.getAge()));
		
	}

	
	

}
