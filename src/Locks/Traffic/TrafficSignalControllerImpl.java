package Locks.Traffic;

public class TrafficSignalControllerImpl {

    private boolean isNorthOn = true;
    private int i = 0;

    public synchronized void northSouth() throws InterruptedException {
        while (i <= 10) {
            while (!isNorthOn) {
                wait();
            }

            System.out.println("NS traffic is GREEN\nNS traffic is going...");
            Thread.sleep(500);

            isNorthOn = false; // switch to EW next
            i++;
            notifyAll();
        }
    }

    public synchronized void eastWest() throws InterruptedException {
        while (i <= 10) {
            while (isNorthOn) {
                wait();
            }

            System.out.println("EW traffic is GREEN\nEW traffic is going...");
            Thread.sleep(500);

            isNorthOn = true;
            i++;
            notifyAll();
        }
    }
}

