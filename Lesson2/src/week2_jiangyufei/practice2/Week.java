package week2_jiangyufei.practice2;

public enum Week {
	
	  MON("月曜日"), TUE("火曜日"), WED("水曜日"), THR("木曜日"), FRI("金曜日"), SAT("土曜日"), SUN("日曜日");

	//メンバー変数
	private String japaneseName;
	
	//コンストラクタ
	private Week(String japaneseName) {
		this.japaneseName = japaneseName;
	}


	//get name
	public String getJapaneseName() {
		return japaneseName;
	}
}