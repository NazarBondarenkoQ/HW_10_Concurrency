package main.java.httpserver;


public class Main {
    public static void main(String[] args) {
        HttpServerThread httpServerThread = new HttpServerThread();
        httpServerThread.start();
        httpRequest();
    }
    private static void httpRequest(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Server receives " + HttpMethods.DELETE + " request. On thread:"
                    + Thread.currentThread().getName() + "\n" +
                    "Server receives " + HttpMethods.PUT + " request. On thread: " + Thread.currentThread().getName());
        }
    }
}
