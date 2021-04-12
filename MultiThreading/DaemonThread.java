class DThread1 extends Thread {
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i++);
        }
    }
}

public class DaemonThread {
    public static void main(String[] args) {
        DThread1 dt = new DThread1();
        dt.setDaemon(true);
        dt.start();
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
    }
}
