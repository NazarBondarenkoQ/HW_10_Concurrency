package main.java.httpserver;

public class HttpServerThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Server receives " + HttpMethods.GET + " request. On thread: "
                    + Thread.currentThread() + "\n" +
                    "Server receives " + HttpMethods.POST + " request. On thread: " + Thread.currentThread());
        }
    }
}
