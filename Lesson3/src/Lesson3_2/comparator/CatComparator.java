package Lesson3_2.comparator;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat>{

	@Override
	public int compare(Cat cat1, Cat cat2) {
		//	用if文比較
		if(cat1.getWeight() == cat2.getWeight()) {
			return 0;
			//第一引数が小さい場合
		} else if (cat1.getWeight() < cat2.getWeight()) {
			return -1;
		} else {
			return 1;
		}
	}

	
}
