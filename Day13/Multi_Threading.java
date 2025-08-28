package Day13;

class thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thrad1 is Calling"+i);
        }
    }
}

class thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread2 is calling"+i);
        }
    }
}

public class Multi_Threading {
    public static void main(String[] args) {
        thread1 th1 = new thread1();
        thread2 th2 = new thread2();
        Thread th = new Thread(th2);
        th1.start();
        th.start();
        // th2.run(); // --> first it will call thrad2 and next it call thread1
    }
}
