package exception.ex3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest3 {

	public static void main(String[] args) {
		// 异常的处理（底层异常往外送，在最外层捕获异常）
		try {
			test1();
		} catch (FileNotFoundException e) {
			System.out.println("您要找的文件不存在");
			e.printStackTrace();	//打印出这个对象异常的信息，记录下来
		} catch (ParseException e) {
			System.out.println("您要解析的时间有问题");
			e.printStackTrace();	//打印出这个对象异常的信息，记录下来
		}

	}

	//抛多个异常出去给他的调用者
	public static void test1() throws FileNotFoundException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse("2028-11-11 10:24:11");
		System.out.println(d);
		
		test2();
	}
	
	public static void test2() throws FileNotFoundException  {
		//读取文件
		InputStream is = new FileInputStream("D:/meinv.png");
	}
	
}
