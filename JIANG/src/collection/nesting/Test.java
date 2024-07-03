package collection.nesting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	/*
	 * 目标：理解集合的嵌套
	 * 江苏省："南京市","扬州市","苏州市","无锡市","常州市"
	 * 湖北省："武汉市","孝感市","十堰市","宜昌市","鄂州市"
	 * 河北省："石家庄市","唐山市","邢台市","保定市","张家口市"
		*/
	public static void main(String[] args) {
		//1.定义一个Map集合储存全部的省份信息和其对应的城市信息、
		Map<String, List<String>> map = new HashMap<>();
		List<String> cities1 = new ArrayList<>();
		Collections.addAll(cities1, "南京市","扬州市","苏州市","无锡市","常州市");
		map.put("江苏省", cities1);
		
		List<String> cities2 = new ArrayList<>();
		Collections.addAll(cities2, "武汉市","孝感市","十堰市","宜昌市","鄂州市");
		map.put("湖北省", cities2);
		
		List<String> cities3 = new ArrayList<>();
		Collections.addAll(cities3, "石家庄市","唐山市","邢台市","保定市","张家口市");
		map.put("河北省", cities3);
		
		System.out.println(map);
		
		List<String> cities = map.get("湖北省");
		for(String city : cities) {
			System.out.println(city);
		}
		
		map.forEach((k, v) -> {
			System.out.println(k + "----->" + v);
		});
	}

}
