package MultiThreading.preventThreadExecution;

class MyYieldThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}

public class TestYieldDemo {
    public static void main(String[] args) {
        MyYieldThread myt=new MyYieldThread();
        myt.start();
        Thread.currentThread().setName("Rushi");
        myt.setPriority(11);
        //System.out.println(Thread.currentThread().getPriority());
        for (int i=0;i<10;i++){
            System.out.println("Main Thread");
            Thread.yield();
        }
        System.out.println(myt.getName());
        System.out.println(Thread.currentThread().getName());

    }

}
