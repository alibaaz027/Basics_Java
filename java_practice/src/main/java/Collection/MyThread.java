package Collection;

class MyThread extends Thread {
    public void run() {
        System.out.println("Number: " + 1);
        try {
            Thread.sleep(100); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Number: " + 2);
        try {
            Thread.sleep(100); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Number: " + 3);
        try {
            Thread.sleep(100); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Number: " + 4);
        try {
            Thread.sleep(100); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Number: " + 5);
        try {
            Thread.sleep(100); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Create and start a thread
        MyThread myThread = new MyThread();
        myThread.start();

        // Main thread continues its own work
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Alphabet: " + c);
            try {
                Thread.sleep(150); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main thread exiting.");
    }
}
