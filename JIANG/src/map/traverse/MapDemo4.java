package map.traverse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class MapDemo4 {
//案例：统计投票人数
	public static void main(String[] args) {
		// 1.把80个学生选择的投票数据拿到程序中来
		List<String> data = new ArrayList<>();
		String[] selects = {"A", "B", "C", "D"};
		//随机一个索引
		Random r = new Random();
		for(int i = 1; i <= 80; i++) {
			//每次模拟一个学生选择一个经典存入集合
			int index = r.nextInt(4);	//包前不包后，0.1.2.3
			//将随机索引对应的数据存入集合中
			data.add(selects[index]);
		}
		System.out.println(data);
		
		//2.统计每个景点的投票人数
		//准备一个Map集合用于统计最后的结果
		Map<String, Integer> result = new HashMap();
		
		//3.开始遍历80个景点数据
		for(String s : data) {
			//问问Map集合中是否存在该景点
			if(result.containsKey(s)) {
				//如果包含，说明这个景点之前统计过，其值+1，然后重新存入到Map集合中
				result.put(s, result.get(s) + 1);
			}else {
				//说明这个景点是第一次统计
				result.put(s, 1);
			}
		}
		System.out.println(result);
		
	}

}
