package Lesson3_3.thread;

public class Parallel {
    static int count;

    public static void main(String[] args) throws InterruptedException {
        // スレッドの作成
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count++;
//                System.out.println("スレッド１"+i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                count--;
//                System.out.println("スレッド2"+i);
            }
        });

        // スレッドの実行を開始
        t1.start();
        t2.start();

        // スレッドが終了するのを待つ
        t1.join();
        t2.join();

        System.out.println("合計値は"+count);
    }
}