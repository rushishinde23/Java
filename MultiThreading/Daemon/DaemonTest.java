package MultiThreading.Daemon;

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("child Thread");
        }
    }
}

public class DaemonTest {
    public static void main(String[] args) {

        //Thread.currentThread().setDaemon(true);
        System.out.println(Thread.currentThread().isDaemon());

        MyThread t=new MyThread();
        System.out.println(t.isDaemon());

        t.setDaemon(true);
        System.out.println(t.isDaemon());
        System.out.println("End of main thread");

    }
}
