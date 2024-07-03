package abstract_ex.template;

public abstract class People {
	/*
	 * 设计模板方法设计模式
	 * 1.定义一个模板方法
	*/
	
	//用final禁止子类重写模板
	public final void write() {
		System.out.println("\t\t\t《我的爸爸》");
		System.out.println("\t\t我的爸爸好啊，牛啊，来看看我爸有多牛");
		//2.模板方法并不清楚正文应该怎么写，但是子类一定要写
		//设计抽象发方法，由子类实现	
		System.out.println(writeMain());
		System.out.println("这样的生活太好了");
	}
	
	//3.设计抽象方法写正文，具体的实现交给子类
	public abstract String writeMain();
}
