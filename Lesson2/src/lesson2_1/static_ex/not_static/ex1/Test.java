package lesson2_1.static_ex.not_static.ex1;

public class Test {

	public static void main(String[] args) {
		
	        // 访问类变量
	        System.out.println(Static_ex.classVariable); // 输出：10
	        
	     // 实例化对象
	        Static_ex obj1 = new Static_ex(20);
	        Static_ex obj2 = new Static_ex(30);

	        // 访问实例变量
	        System.out.println(obj1.instanceVariable); // 输出：20
	        System.out.println(obj2.instanceVariable); // 输出：30

	        // 修改类变量
	        Static_ex.classVariable = 50;
	        System.out.println(Static_ex.classVariable); // 输出：50
	        System.out.println(obj1.classVariable);    // 输出：50
	        System.out.println(obj2.classVariable);    // 输出：50

	        // 修改实例变量
	        obj1.instanceVariable = 40;
	        System.out.println(obj1.instanceVariable); // 输出：40
	        System.out.println(obj2.instanceVariable); // 输出：30
	    }
	        
	}


