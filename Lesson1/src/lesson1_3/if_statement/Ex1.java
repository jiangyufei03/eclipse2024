package lesson1_3.if_statement;

public class Ex1 {

	public static void main(String[] args) {
		
		boolean weather = true;
		
		
		// もし天気が晴れだったら、洗濯物を干す
		
		if (weather == true) {
			System.out.println("洗濯物を干す");
		}else {
			System.out.println("昼寝をする");
		
		}
		
		//変数 x を用意。値は　77
		// もし x の値が偶数であるならば、コンソールに「偶数」と表示
		// そうでない場合は、コンソールに「奇数」と表
		
		int x = 77;
		if (x % 2 == 0) {
			System.out.println("偶数");
		}else {
			System.out.println("奇数");
		}
		
	
	}

}
