package ThreadPriorities;

public class ExampleOfThreadPriorities {


    public static class Mythread extends  Thread{
        public void run(){
            for(int i=0;i<10;i++)
            {
                System.out.println("child thread job"+" "+i);
            }
        }
    }

    public static void main(String[] args) {

        Mythread t = new Mythread();
        t.setPriority(10);
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("main Thread job"+" "+i);
        }



    }


}
