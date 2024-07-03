package thisdemo;

public class Student {
	double score;	//成员变量
	
	public void printThis() {
		System.out.println(this);
//		公用方法
//		哪个对象调这个方法，this就会指向哪个对象
		
//		this主要用来解决变量名称冲突问题
//		（对象的成员变量和方法内部变量的名称冲突）
	}
	
	public void printPass(double score) {
		//this.score 访问的是成员变量的成绩
		//或者形参与成员变量的名称不同，亦可完成
		if(this.score > score) {
			System.out.println("恭喜成功考入");
		}else {
			System.out.println("落选了");
		}
	}
}
