package practice.ex2;

public enum Season {
	
	//定数
	SPRING("haru"), SUMMER("natsu"), AUTUMN("aki"), WINTER("fuyu");
	
	//メンバ変数
	private String japanese;

	//コンストラクタ
	private Season(String japanese) {
		this.japanese = japanese;
	}

	//getter,setter
	public String getJapanese() {
		return japanese;
	}

	public void setJapanese(String japanese) {
		this.japanese = japanese;
	}
	
	
}
