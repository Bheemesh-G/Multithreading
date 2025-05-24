package ThreadExecutionPause;

public class InterruptMethodDemo {


    static class InterruptMethod extends Thread{

        @Override
        public void run() {

            try{
                for(int i=0;i<10;i++)
                {
                    System.out.println("I am Lazy Thread");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                System.out.println("I got Interrupted");
            }
        }
    }



    public static void main(String[] args) {

        InterruptMethod interruptMethod = new InterruptMethod();
        interruptMethod.start();
        interruptMethod.interrupt();
        System.out.println("main thread");



    }


}
