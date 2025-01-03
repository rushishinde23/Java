package MultiThreading.interThreadCommunications;

class ThreadB extends Thread{
    int total;

    @Override
    public void run() {
        synchronized (this){

            System.out.println("Child thread starts calculating");

            for(int i=1;i<=100;i++){
                total=total+i;
            }
            System.out.println("Child thread trying to give notification");
            this.notify();
        }
    }
}

public class ThreadA {
    public static void main(String[] args) throws InterruptedException {

        ThreadB b=new ThreadB();
        b.start();
        //Thread .sleep(1);

        synchronized (b){
            System.out.println("Main thread trying to call wait() method");
            b.wait();
            System.out.println("Main thread got notification");
        }
        System.out.println("Total is: "+b.total);

    }
}
