package extends_ex.override;

public class B extends A{

	//方法重写（权限大）
	//static方法不能被重写
	//申明不变，重新实现	
	
	@Override
	public void print1() {
		System.out.println("666");
	}
	
	@Override
	public void print2(int a, int b) {
		System.out.println("666666");
		
	}
}
