package regex;

public class RegexTest1 {

	/*
	 * 目标 ：体验使用正则表达式来校验数据格式的合法性
	 * 需求：校验qq号码是否正确，要求全部是数字，长度在（6-20）之间，不能以0开头
	*/
	public static void main(String[] args) {
		
		System.out.println(	checkQQ(null));
		System.out.println(	checkQQ("75841230"));
		System.out.println(	checkQQ("7584kij30"));
		
		System.out.println("--------------------------");
		
		System.out.println(	checkQQ1(null));
		System.out.println(	checkQQ1("75841230"));
		System.out.println(	checkQQ1("7584kij30"));
	}

	//使用正则表达式
	public static boolean checkQQ1 (String qq) {
		//						第一位必须是1-9之间的数字
		return qq != null && qq.matches("[1-9]\\d{5,19}");
												//后面有5-19位数字	
	}
	
	
	
	
	
	
	//字符串本身可以接所有数据
	public static boolean checkQQ(String qq) {	
		//1.判断qq号码是否为null
		if(qq == null || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20){
			return false;
		}
		
		//2.qq号码至少不是null，不是以0开头的，满足6-20之间的长度
		//判断qq号码中是否都是数字
		//qq = 25sehh99 不满足要求，遍历
		for(int i = 0; i < qq.length(); i++) {
			//根据索引提取当前位置处的字符
			char ch = qq.charAt(i);
			//判断ch记住的字符如果不是数字，那么qq号就不合法
			if( ch < '0' || ch > '9') {		//证明不在数字区
				return false;
			}
		}
		//没有进入到上面的环节，证明qq号肯定是合法的
		return true;
	}
	
	
}
