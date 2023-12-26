package dav.thread.example;
public class ThreadRunnableStringExample implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is created and running.......");

    }
    public static void main(String[] args) {
        Runnable r = new ThreadRunnableStringExample();
        Thread r1= new Thread(r,"Thread One");
        r1.start();
        String name = r1.getName();
        System.out.println("Thread Name: " + name);
    }
}
