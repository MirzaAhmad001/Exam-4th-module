package org.example;

public class FirstQuestion {
    static int orderCount;

    public static synchronized void increaseOrderCount() {
        orderCount += 1;
    }


    public static void main(String[] args) {
        int x = 0;

        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
        Thread thread3 = new Thread();

        thread1.start();
        thread2.start();
        thread3.start();
        while (x < 100) {
            increaseOrderCount();
            System.out.println(x);
            x ++;
            Thread thread = Thread.currentThread();
            System.out.println(thread);
        }
    }
}
