package ThreadExecutionPause;

public class YieldMethodDemo {


    public static class MyThread extends Thread{

        @Override
        public void run() {
            for(int i=1;i<=10;i++)
            {
                System.out.println("child thread "+i);
                Thread.yield();
            }
        }
    }




    public static void main(String[] args) {

        Thread.currentThread().setPriority(10);
        MyThread myThread = new MyThread();
        myThread.setPriority(5);
        myThread.start();
        for(int i=1;i<=10;i++)
        {
            System.out.println("main thread "+i);
        }

    }




}
