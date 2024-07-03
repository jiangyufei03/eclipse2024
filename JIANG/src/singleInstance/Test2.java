package singleInstance;

public class Test2 {

//	懒汉式单例写法
	
	public static void main(String[] args) {
		B b1 = B.getInstance();	//第一次拿对象
		B b2 = B.getInstance();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1 == b2);
		
//		如果单例对象会被频繁用到————用饿汉式，把单例对象提前做出来
//		如果单例对象使用的不频繁————用懒汉式(节省内存)
		
	}

}
