package ThreadExecutionPause;

public class TrafficSignal {

    public static class Red extends Thread{

        @Override
        public void run() {
            System.out.println("Red Signal "+"Please stop");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Red Signal Completed");
        }
    }

    public static class Green extends Thread{

        @Override
        public void run() {
            System.out.println("Green Signal "+"Please continue your driving");
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Green Signal Completed");
        }
    }



    public static void main(String[] args) throws InterruptedException {

        Red red = new Red();
        Green green = new Green();
        System.out.println("no signal");
        red.start();
        red.join();
        green.start();
        green.join();
        System.out.println("completed");



    }
}
