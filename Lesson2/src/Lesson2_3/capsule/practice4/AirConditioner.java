package Lesson2_3.capsule.practice4;

public class AirConditioner extends Cooler{

	//コンストラクタ
	public AirConditioner(int nowTemp) {
		super(nowTemp);
	}

	//メソッド
	@Override
	public void adjust() {
		if(nowTemp < goalTemp) {
			nowTemp += 1;
			System.out.println("室温を1°上げました。");
		}else {
			super.adjust();
		}
	}
	
}
