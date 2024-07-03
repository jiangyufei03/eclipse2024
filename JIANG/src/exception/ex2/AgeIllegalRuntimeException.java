package exception.ex2;

//必须让这个类继承RutimeException，才能成为一个运行时异常类

public class AgeIllegalRuntimeException extends RuntimeException{

	public AgeIllegalRuntimeException() {
		// TODO Auto-generated constructor stub
	}

	//参数用来封装出现问题异常的原因，送到父类RuntimeException接收
	public AgeIllegalRuntimeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
