// Demonstrate Timer and TimerTask.

import java.util.Timer;
import java.util.TimerTask;

class MyTimerTask extends TimerTask {
    public void run() {
        System.out.println("Timer task executed.");
    }
}


class TTest {
    public static void main(String[] args) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();

    /* Set an initial delay of 1 second,
       then repeat every half second.
    */
        myTimer.schedule(myTask, 1000, 500);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException exc) {
        }

        myTimer.cancel();
    }
}
