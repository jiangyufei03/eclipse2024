package try_catch;

public class Ex2 {
	public static void main(String[] args) {
		int result = sample();
		System.out.println(result);

	}

	/*finally 塊中的代碼總是會執行，
	 * 即使在 catch 塊中已經有了返回值。
	 * 因此，finally 塊中的 return 20; 將覆蓋之前的返回值，
	 * 導致最終返回20。
			*/
			
	private static int sample() {
		try {
			throw new RuntimeException();
		} catch (RuntimeException e) {
			return 10;
		} finally {
			return 20;
		}
	}
}
