package method_references.ex1;

import extends_ex.override.Student;

public class CompareByData {
	public static int compareByAge(Student o1, Student o2) {
		return o1.getAge() - o2.getAge();	//升序排序的规则
		
	}

}
