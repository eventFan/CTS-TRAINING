// Thread class by extending Thread
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyThread is running: iteration " + i);
            try {
                Thread.sleep(300); // pause 300 ms
            } catch (InterruptedException e) {
                System.out.println("MyThread interrupted");
            }
        }
    }
}

// Thread class by implementing Runnable
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("MyRunnable is running: iteration " + i);
            try {
                Thread.sleep(300); // pause 300 ms
            } catch (InterruptedException e) {
                System.out.println("MyRunnable interrupted");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();
    }
}
