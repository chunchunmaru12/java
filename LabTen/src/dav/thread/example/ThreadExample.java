package dav.thread.example;

public class ThreadExample extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running ");
    }

    public static void main(String[] args) {
        ThreadExample te = new ThreadExample();
        te.start();
    }
}
