package dav.thread.example;

public class RunnableExample implements Runnable {
    @Override
    public void run(){
        System.out.println("Thread is running successfully ");
    }

    public static void main(String[] args) {
        RunnableExample re = new RunnableExample();
        Thread t1 = new Thread(re);
        t1.start();
        Runnable r1 =new RunnableExample();
        Thread t2=new Thread(r1);
        t2.start();
    }
}
