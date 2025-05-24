package Locks.Traffic;

public class TrafficSignalController {
    public static void main(String[] args) {
        TrafficSignalControllerImpl trafficSignalController = new TrafficSignalControllerImpl();
        Thread thread = new Thread(()->{
            try {
                trafficSignalController.northSouth();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread1 = new Thread(()->{
            try {
                trafficSignalController.eastWest();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        thread.start();
        thread1.start();
    }
}
