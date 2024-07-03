package collection.set.ex2;

public class SetTest {
	/*
	 * 目标： 了解哈希值 Object提供的方法，hashCode返回对象自己的哈希值
	 *  public int hashCode(): 返回对象的哈希值
	 *  同一个对象多次调用的hashCode（）返回的哈希值是一样的、
	 *  不同的对象，哈希值一般不同，但也有可能相同（哈希碰撞）
	 */ 
	
	public static void main(String[] args) {
		Student s1 = new Student("蜘蛛精", 25, 169.5);
		Student s2 = new Student("紫霞", 22, 166.5);
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		String str1 = new String("abc");
		String str2 = new String("acD");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}

}
