import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import static java.lang.Thread.sleep;

public class TimerThread implements Runnable{
    public static void main(String[] args) {
        TimerThread timerThread = new TimerThread();
        Thread thread = new Thread(timerThread);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
            try {
                sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
