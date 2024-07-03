package question;

public class Test2 {

	public static void main(String[] args) {
		int cnt = 0;
		Runnable r = () -> {
//			for (cnt = 0; cnt < 10; cnt++) {
//				System.out.println(cnt++);
//			}
		};
		new Thread(r).start();
	}

	//コンパイルエラーが発生、包含lambda的方法中，int cnt 一旦被赋值会变成定数
	//不能再次赋值，故报错	
	
}
