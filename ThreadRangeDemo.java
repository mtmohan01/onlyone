class PrintNumbers extends Thread {
    int start, end;
    
    PrintNumbers(int s, int e) {
        start = s; end = e;
    }
    
    public void run () {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread(). getName() + ": " + i);
            try {Thread.sleep(500);} catch (Exception e) {}
        }
    }
}

public class ThreadRangeDemo {
    public static void main (String [] args) {
        PrintNumbers t1 = new PrintNumbers (1, 10);
        PrintNumbers t2 = new PrintNumbers (90, 100);
        
        t1.setName("Thread1");
        t2.setName("Thread2");
        
        t1.start();
        t2.start();
    }
}