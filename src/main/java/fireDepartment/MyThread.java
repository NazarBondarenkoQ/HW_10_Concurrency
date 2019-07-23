package main.java.fireDepartment;

public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        synchronized (this) {
            System.out.println("!!!Alarm is ringing!!!");
            notifyAll();
        }
    }
}
