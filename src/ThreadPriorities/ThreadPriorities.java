package ThreadPriorities;

public class ThreadPriorities {

    static class Mythread extends Thread{

    }


    public static void main(String[] args) {


        Thread.currentThread().setName("main thread");
        System.out.println(Thread.currentThread().getName());//main thread or parent thread
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        Mythread t = new Mythread();//child thread executed by parent thread
        t.setName("child thread");
        System.out.println(t.getPriority());
        System.out.println(t.getName());



    }
}
