package concurrency;

public class Main {

    public static void main(String[] args) {
        Reasoning reason = new Reasoning();
        reason.start();
        TeamTC1 dylan = new TeamTC1();
        Thread SemicolonTC1 = new Thread(dylan);
        SemicolonTC1.start();
        Sync syncThread2 = new Sync("sync thread");
        syncThread2.start();
        // run all of your threads from this main class.
    }
}