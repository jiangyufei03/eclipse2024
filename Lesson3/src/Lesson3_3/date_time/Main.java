package Lesson3_3.date_time;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		//今日の日付を取得
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);

		// 曜日の取得
		System.out.println(now.getDayOfWeek());
		
		//日付を足す(在当前时间加上日期)
		now = now.plusDays(10);
		System.out.println(now);
	}

}
