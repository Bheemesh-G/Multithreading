package Locks.EvenOdd;

public class EvenAndOddNumbers {

//    🔒 Problem 1: Print Even and Odd Numbers with Two Threads
//    Goal:
//    Create two threads. One prints even numbers, and the other prints odd numbers, in order (0, 1, 2, 3... up to n).
//    Use a lock or monitor to ensure alternate printing.
//🧠 Focus: Lock, wait-notify, thread coordination



    public static void main(String[] args) {

        EvenAndOdd evenAndOdd = new EvenAndOdd();


        Thread thread = new Thread(()->{
            try {
                evenAndOdd.printEven();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread1 = new Thread(()->{
            try {
                evenAndOdd.printOdd();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.start();
        thread1.start();

    }
}
