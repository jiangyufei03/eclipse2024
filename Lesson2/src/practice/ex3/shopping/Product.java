package practice.ex3.shopping;

public class Product {

	//メンバー変数
	
	private String name;
	private double price;
	private int stock;
	
	//コンストラクタ
	public Product(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	//メソッド
	public void decreaseStock(int amount) {
		if(stock >= amount) {
			stock -= amount;
			System.out.println("Stock decreased by " + amount +
								" for product: " + name + 
								". Remaining stock: " + stock);
		} else {
			System.out.println("Insufficient stock for product: " + name);
		}
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}
	
	
		
}
