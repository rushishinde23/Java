package MultiThreading.preventThreadExecution;

class MyJoinThread implements Runnable{

    static Thread mt;
    @Override
    public void run() {

        try {
            mt.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i=0;i<10;i++){
            System.out.println("Child Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class TestJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyJoinThread mjt=new MyJoinThread();
        Thread t=new Thread(mjt);

        MyJoinThread.mt=Thread.currentThread();
        t.start();

       // t.join();
        for (int i=0;i<10;i++){
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }
}
