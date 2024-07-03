package Lesson3_3.thread;

//譲り合い

public class Parallel2 {
    static int count;

    static synchronized void plus() {
        count++;
//        System.out.println("スレッド1の" + count + "回目の処理");
    }

    static synchronized void minus() {
        count--;
//        System.out.println("スレッド2の" + count + "回目の処理");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                plus();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                minus();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count);
    }
}