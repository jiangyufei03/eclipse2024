package try_catch;

public class Ex1 {

	

		public static void main(String[] args) {
			System.out.println(test(null));
		
		}

		/*
		 * 在這段代碼中，Object 是一個通用的類型，它可以表示任何Java物件。
		 * 在這裡，test 方法接受一個 Object 作為參數，並執行以下操作：
		 * 嘗試調用 obj.toString() 方法，如果 obj 是 null，則會拋出 NullPointerException。
		 * 無論是否拋出異常，finally 塊中的代碼都會執行，即打印 “B”。
		 * 如果沒有拋出異常，則返回 “C”。
		* Object 是一個通用的基類，可以表示任何Java物件。
		*/
		private static String test(Object obj) {
			try {
				System.out.println(obj.toString());
			} catch (NullPointerException e) {
				return "A";
			} finally {
				System.out.println("B");
			}
			return "C";
		}
	}

