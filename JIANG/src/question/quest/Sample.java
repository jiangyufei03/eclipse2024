package question.quest;

public class Sample {

	private String value;
	public void setValue(String value) {
		//没有this，就是原始值的状态,local変数として使う
		value = "Hello," + value;
	}
	public String toString() {
		return value;
	}
}
