package main.java.fireDepartment;

public class Main {

    public static void main(String[] args) {

        Firefighter firefighter = new Firefighter("Jack");
        Firefighter firefighter1 = new Firefighter("Tom");
        Firefighter firefighter2 = new Firefighter("Cain");
        MyThread myThread = new MyThread();
        myThread.start();
        synchronized (myThread) {
            try {
                myThread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            firefighter.fightFire();
            firefighter1.fightFire();
            firefighter2.fightFire();
        }
    }
}
