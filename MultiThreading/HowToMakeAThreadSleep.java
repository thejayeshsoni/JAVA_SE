class My extends Thread {
    public My(String name) {
        super(name);
    }

    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i++);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class HowToMakeAThreadSleep {
    public static void main(String[] args) {
        My t = new My("My Thread 1");
        t.start();
        t.interrupt();
    }
}
