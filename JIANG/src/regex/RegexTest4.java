package regex;

import java.util.Arrays;

//掌握正则表达式做替换搜索，内容分割

public class RegexTest4 {

	public static void main(String[] args) {
		//1.public String replaceAll(String regex , String newStr):按照正则表达式匹配的内容进行替换
		//需求1：把古力娜扎585154jiho迪丽热巴5254ghvyu马儿扎哈5624juff卡尔扎巴，中间的非中文文字替换成“-”
		String s1 = "古力娜扎585154jiho迪丽热巴5254ghvyu马儿扎哈5624juff卡尔扎巴";
		System.out.println(s1.replaceAll("\\w+", "-"));
		
		
		//需求2（拓展）：某语音系统，收到一个口吃的人说的“我我我喜欢编编编编编编编编编编编程程程！”需要优化
		String s2 = "我我我喜欢编编编编编编编编编编编程程程";
		System.out.println(s2.replaceAll("(.)\\1+", "$1"));
		
		/*
			(.)代表一组: .匹配任意字符
			\\1：	为这个组声明组号：1号
			+: 声明必须是重复的字符
			$1： 可以取到第一组代表的那个重复字
		*/
		
		
		//2.public String[] split(String regex):按照正则表达式匹配的内容进行分割字符串。返回一个字符串数组
		//需求1：把古力娜扎585154jiho迪丽热巴5254ghvyu马儿扎哈5624juff卡尔扎巴，中间的人名取出来
		
		String s3 = "古力娜扎585154jiho迪丽热巴5254ghvyu马儿扎哈5624juff卡尔扎巴";
		//声明分割符
		String[] names = s3.split("\\w+");
		System.out.println(Arrays.toString(names));

	}

}
