package ThreadExecutionPause;

public class SleepMethodDemo {


    public static void main(String[] args) throws InterruptedException {



        for(int i=0;i<10;i++)
        {
            System.out.println("slide "+(i+1));
            Thread.sleep(1500);
        }





    }


}
