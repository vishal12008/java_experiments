class Printer {
    public synchronized void printDocument(String name) {
        System.out.println(name + " is printing the document.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(name + ": Printing operation finished.");
    }
}

class UserThread extends Thread {
    Printer printer;

    UserThread(Printer printer, String name) {
        super(name);
        this.printer = printer;
    }

    public void run() {
        System.out.println(getName() + " started.");
        printer.printDocument(getName());
        System.out.println(getName() + " terminated.");
    }
}

public class ThreadLifecycleDemo {
    public static void main(String[] args) {
        Printer printer = new Printer();

        UserThread t1 = new UserThread(printer, "Thread-1");
        UserThread t2 = new UserThread(printer, "Thread-2");

        System.out.println("Initial state: " + t1.getState());
        System.out.println("Initial state: " + t2.getState());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Final state of Thread-1: " + t1.getState());
        System.out.println("Final state of Thread-2: " + t2.getState());

        System.out.println("Synchronization prevents deadlock.");
    }
}