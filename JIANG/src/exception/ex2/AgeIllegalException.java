package exception.ex2;

//必须让这个类继承Exception，才能成为一个运行时异常类

public class AgeIllegalException extends Exception{

	public AgeIllegalException() {
		// TODO Auto-generated constructor stub
	}

	//参数用来封装出现问题异常的原因，送到父类Exception接收
	public AgeIllegalException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
