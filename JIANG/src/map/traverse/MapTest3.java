package map.traverse;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Map<String, Double> map = new HashMap<>();
			map.put("蜘蛛精", 169.8);
			map.put("紫霞", 165.8);
			map.put("至尊宝", 169.5);
			map.put("牛魔王", 183.6);
			System.out.println(map);
			
			//k和v可以任意取名字，分别代表键和值
//			map.forEach((k, v) -> {
//				System.out.println(k + "--->" + v);
//			});
			
//			map.forEach(new BiConsumer<String, Double>() {
//				@Override
//				public void accept(String k, Double v) {
//					System.out.println(k + "--->" + v);
//				}
//			});
		
			map.forEach((k, v) -> {
				System.out.println(k + "--->" + v);
				
			});
			
			
	}

}
