package Lesson3_3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex1 {

	public static void main(String[] args) {
		// Stringクラスのmatchesメソッドを使用して正規表現にマッチするか確認
		String str = "Apple";
		//apq中间的一个字出现一次以上
		System.out.println(str.matches("A[pqr]+le"));
		
		// Patternクラスのmatchesメソッド
		//								前面是条件	后面是这次检查的对象
		System.out.println(Pattern.matches("A[pqr]+le", str));
		
		//PatternクラスとMacherクラスを使って部分文字列を検索する
		Matcher matcher = Pattern.compile("A[pqr]+le").matcher("Apple Abcde Appqqqrle Banana");
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		if (valid("Apple")){
			System.out.println("一致");
		}
	}
	
	//呼び出し
	
	
	
	//メソッド化  a = 要检查的内容  
	public static boolean valid (String a) { 
			//				本次规则
		return a.matches("A[pqr]+le");
	}
}
