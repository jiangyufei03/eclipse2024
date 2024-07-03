package Lesson2_3.capsule.practice4;

public class Cooler {

	//メンバ―変数
	protected int nowTemp;
	protected int goalTemp;
	
	//コンストラクタ:
	public Cooler(int nowTemp) {
		this.nowTemp = nowTemp;
	}

	//メソッド getter:
	public void setGoalTemp(int goalTemp) {
		this.goalTemp = goalTemp;
	}
	//冷却処理を行う
	public void adjust() {
		if(nowTemp > goalTemp) {
			nowTemp -= 1;
			System.out.println("室温を1°下げました。");
		}else {
			System.out.println("適温です。");
		}
	}
	
}
