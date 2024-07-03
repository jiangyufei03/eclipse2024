package lesson2_1.practice1.copy3;

public class Item {
	/**
	 * Itemクラスは店の商品を扱うクラス
	 * 
	 * 下記に基づいてItemクラスを作成してください。 次のメンバ変数を作成する 商品名を表す「name」をString型で宣言する
	 * 価格を表す「price」をint型で宣言する
	 * 
	 * コンストラクタを作成する 引数：String型「name」、int型「price」 処理内容：引数で与えられた値を、同名のメンバ変数に代入する。
	 * 
	 * displayメソッドを作成する パラメータ：なし 戻り値：なし 処理内容：「商品名：商品価格円」とコンソールに表示する。
	 * （例）オレンジジュース：150円
	 */

	//メンバ―変数
	//商品名
	String name;
	//価額
	int price;

	Item() {
		this.name = name;
		this.price = price;
	}

	
//	コンストラクタ
//	Item(String name, int price){
//		this.name = name;
//		this.price = price;
//	}
	
//	メソッド作成
	void display() {
		System.out.println(name + ":" + price + "円");

	}
}
