package practice.ex3.shopping;

public class Order {

	//インスタンス変数
	//	
	private static int nextId = 1;
	private int orderId;
	private Product product;
	private int quantity;
	
	//コンストラクタ（Order方法）
	public Order(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
		//自動的に一个个增加，不能重合、用来区分每个人的注文内容	  //自動採番
		this.orderId = nextId++;
	}
	
	//method
	public void processOrder() {
		//获取商品库存，如果比注文订单的数量多，就可以继续执行		
		if(product.getStock() >= quantity) {
			//合計金額　		商品的价格 * 注文数量	
			double totalCost = product.getPrice() * quantity;
			System.out.println("Order ID: " + orderId +
					", Product: " + product.getName() + 
					", Quantity: " + quantity +
					", Total Cost: " + totalCost);
			 product.decreaseStock(quantity);
		}else {
			//解释当前注文商品在库不足的行为			
            System.out.println("Insufficient stock for order ID: " + orderId +
            					", Product: " + product.getName());
        }
    }
		
	}

