class MyThread extends Thread {

    public void run() {
        try {
            while (true) {
                int n = (int) (Math.random() * 10);
                System.out.println("Generated Number: " + n);

                if (n % 2 == 0)
                    System.out.println("Square: " + (n * n));
                else
                    System.out.println("Cube: " + (n * n * n));

                System.out.println("------------------------");

                Thread.sleep(1000); // 1 second delay
            }
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}

public class SimpleMultiThread {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();   // start new thread
    }
}