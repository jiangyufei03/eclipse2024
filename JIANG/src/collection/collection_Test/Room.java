package collection.collection_Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Room {
	//必须有一张牌
	private List<Card> allCards = new ArrayList<>();
	
	public Room() {
		//1.做出54张牌，存入到allCards中去
		//a.点数：个数确定。类型确定
		String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		//b.花色
		String[] colors = {"♠","♥","♣","♦"};
		int size = 0;	//	表示每张牌的大小
		//c.遍历点数，内部遍历花色
		for(String number : numbers) {
			size++;
			for(String color : colors) {
				//得到一张牌,封装点数和花色
				Card c = new Card(number, color, size);
				allCards.add(c);//存入了牌
			}
		}
		//单独存入大小王的牌
		Card c1 = new Card("", "🃏", ++size);
		Card c2 = new Card("", "👲", ++size);
		Collections.addAll(allCards, c1, c2);
		System.out.println("新牌： "+ allCards);
	}
		/*
		 * 游戏启动
		*/
		
	public void start() {
		//1.洗牌
		Collections.shuffle(allCards);
		System.out.println("洗牌后： "+ allCards);
			
		//2.发牌，要定义三个玩家	ArrayList
		List<Card> p1 = new ArrayList<>();
		List<Card> p2 = new ArrayList<>();
		List<Card> p3 = new ArrayList<>();
		
		//3.发牌给三个玩家，发出51，剩余3张
		//allCards = {[♣10, ♠J, ♣J, ♦9, ♣5, ♠6, ♣9, ♥4......
		//				0    1   2   0   1  2  每三次一轮，可以用求余
		//							因为一共有54张牌
		for(int i = 0; i < allCards.size() - 3 ; i++) {
			Card c = allCards.get(i);
			//判断牌发给谁
			if(i % 3 == 0) {
				//给第一个人
				p1.add(c);
			}else if(i % 3 == 1) {
				//第二个人
				p2.add(c);
			}else if(i % 3 == 2) {
				//给第三个人
				p3.add(c);
			}
		}
		//3.对三个玩家的牌进行排序
		sortCards(p1);
		sortCards(p2);
		sortCards(p3);
		
		//4.看牌
		System.out.println("第一位玩家： " + p1);
		System.out.println("第二位玩家： " + p2);
		System.out.println("第三位玩家： " + p3);
		//在集合中可以直接倒给某个人
		List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size()); 	//包前不包后
		System.out.println("底牌： " + lastThreeCards);
		p2.addAll(lastThreeCards);
		sortCards(p2);
		System.out.println("第二位玩家抢到地主后 " + p2);
	}
	
	/*
	 * 集中排序
	*/
	private void sortCards(List<Card> cards) {
		Collections.sort(cards, new Comparator<Card>() {
			@Override
			public int compare(Card o1, Card o2) {
				return o1.getSize() - o2.getSize();
			}
		});
		
	}
}
