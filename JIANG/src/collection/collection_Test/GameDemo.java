package collection.collection_Test;

/*	
 * 斗地主案例开发
 * 总共有54张牌
 * 点数："3","4","5","6","7","8","9","10","J","Q","K","A","2"
 * 花色："♠","♥","♣","♦"
 * 大小王："👲","🃏",
 * 点数要分别组合，四种花色，大小王各一张
 * 斗地主：发出51张牌，剩下3张为底牌
 * 
*/

public class GameDemo {

	public static void main(String[] args) {
		//1.牌类
		//2.房间
		Room m = new Room();
		//3.启动游戏
		m.start();
		
	}

}
