package lesson1_3.method.Ex;

public class Ex4 {

	public static void main(String[] args) {
		//メソッドを呼び出す
		//需要有变量来接返回值 受け取る箱を用意必要が`ある
		int calculationResult = calculatingChange(1000, 1200) ;
		//  把1200-1000得到的200返回给calcultion
		System.out.println(calculationResult);
	}

	// お釣りの計算をするメソッド
	static int calculatingChange(int totalAmount, int payMoney) {
		int change = payMoney - totalAmount;
		return change;
	}
	
}
