package practice.ex3.shopping;

public class Customer {

	//メンバー変数
	private String name;
	private String email;
	private String address;
	
	//コンストラクタ
	public Customer(String name, String email, String address) {
		this.name = name;
		this.email = email;
		this.address = address;
	}

	//メソッド
	//Product中有三个参数，他的成员包括:
//					[private String name;	
//					private double price;
//					private int stock;]		三个
	
	//注文を処理メソッド
	public void placeOrder(Product product, int quantity) {
        System.out.println("Order placed by customer: " + name);
        //用Order方法 （构造器，输入具体的值） 创建对象     
        Order order = new Order(product, quantity);
        //用对象调注文方法        
        order.processOrder();
    }
	
	
}

