package ThreadExecutionPause;

public class JoinMethodDemoOnChildClass {




    static class  MyThread extends Thread{

        static Thread mainThread;

        @Override
        public void run() {

            try{
                mainThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for(int i=0;i<10;i++)
            {
                System.out.println("child thread");
            }


        }
    }

    public static void main(String[] args) throws InterruptedException {


        MyThread.mainThread=Thread.currentThread();
        MyThread myThread = new MyThread();
        myThread.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("main thread");
            Thread.sleep(2000);
        }




    }



}
