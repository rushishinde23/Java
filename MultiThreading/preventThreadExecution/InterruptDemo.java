package MultiThreading.preventThreadExecution;

class MyInterruptedThread extends Thread{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("I am Lazy Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("I got interrupted");
            }
        }

    }
}

public class InterruptDemo {
    public static void main(String[] args) {
        MyInterruptedThread mit=new MyInterruptedThread();

        mit.interrupt();
        mit.start();

        System.out.println("End of main thread");

    }
}
