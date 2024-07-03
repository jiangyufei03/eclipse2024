package Lesson3_3.string_builder;

public class Main {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		//確認用
		System.out.println("０１２３４５６７８９０１２３４５６７８９←インデクス番号");
	    System.out.println("１２３４５６７８９０１２３４５６７８９０←文字数");
	    
	    sb.append("こんにちは。");
	    sb.append("今日はいい天気ですね。");
	    
	    System.out.println(sb.toString());
	    
	    //文字列の挿入　９文字目直後に文字を挿入
	    sb.insert(9, "とても");
	    System.out.println(sb.toString());
	    
	   //文字列部分置き換え
	    sb.replace(5, 6, "!");
	    System.out.println(sb.toString());
	    
	    //１文字目から５文字目を"おはようございます。"に置き換える
	    //索引从0开始
	    sb.replace(0, 5, "おはようございます");
	    System.out.println(sb.toString());
	    
	    //文字列の部分削除
	    sb.delete(10, 13);
	    System.out.println(sb.toString());
	    
	    //文字列の検索
	    //「天気」が最初に出現するインデックス番号を取得
	    System.out.println("「天気」の開始位置⇒" + sb.indexOf("天気"));
	    
	    
	}

}
