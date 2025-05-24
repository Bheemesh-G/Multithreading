package Locks.EvenOdd;

public class EvenAndOdd {


   public int i = 0;

   public synchronized void printEven() throws InterruptedException {
       while(i<=10) {
           while (i % 2 != 0) {
               System.out.println(" Not even Entering into wait stage "+Thread.currentThread().getName());
               wait();
           }
           if(i<=10) {
               System.out.println(i);
               ++i;
               notifyAll();
           }
       }
   }
   public synchronized void printOdd() throws InterruptedException {
       while (i<=10) {
           while (i % 2 == 0) {
               System.out.println(" Not Odd Entering into wait stage "+Thread.currentThread().getName());
               wait();
           }
           if(i<=10)
           {
               System.out.println(i);
               ++i;
               notifyAll();
           }
       }
   }






}
