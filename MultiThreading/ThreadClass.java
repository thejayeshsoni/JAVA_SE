class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        setPriority(Thread.MIN_PRIORITY + 3);
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        MyThread t = new MyThread("My Thread 1");

        System.out.println("ID : " + t.getId());

        System.out.println("NAME : " + t.getName());

        System.out.println("PRIORITY : " + t.getPriority());
        /*
         * --> To change the state of this thread from NEW to RUNNABLE we have to use
         * "t.start()" method.
         */
        System.out.println("STATE : " + t.getState());

        System.out.println("ALIVE : " + t.isAlive());
    }
}