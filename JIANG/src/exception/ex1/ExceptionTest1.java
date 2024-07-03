package exception.ex1;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionTest1 {
	// 认识异常
	public static void main(String[] args) throws ParseException{
//		把数字字符串转换成整型
		Integer.valueOf("123");
		
		//运行时异常(写代码时不会干扰)
		//数字转换异常
//		Integer.valueOf("abc");

//		int[] arr = {11, 22, 33};
//		System.out.println(arr[5]);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date d = sdf.parse("2028-11-11 10:24");
//		System.out.println(d);
	}

}
