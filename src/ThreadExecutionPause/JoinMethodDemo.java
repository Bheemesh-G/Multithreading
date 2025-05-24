package ThreadExecutionPause;

public class JoinMethodDemo {

    public static class Mythread extends Thread{
        @Override
        public void run() {

            for(int i=1;i<=10;i++)
            {
                System.out.println("child thread "+i);
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
            }
            System.out.println("==============="+Thread.currentThread().getName()+"=================");


        }
    }




    public static void main(String[] args) throws InterruptedException {

        Mythread mythread = new Mythread();
        mythread.start();
        mythread.join();
//        mythread.join(10000);
        for(int i=1;i<=10;i++)
        {
            System.out.println("main thread "+i);
        }
        System.out.println("========="+Thread.currentThread().getName()+"======");


    }





}
