package concurrency;

class Reasoning extends Thread {
    // set up this class so it can become a valid thread.

    public void distinguish() {
        System.out.println(
                "A process is referred as the program in execution while a thread is a part of a process. A process is made up of a subset of threads.");
        System.out.println(
                "If you invoke the run before the start command, it will run the main thread instead of its own because it wasn't initialized/ started.");
        // print to the console the difference between a thread and a process
        // print out you think will happen if you invoke the run() method of a thread as
        // opposed to the start() method of a thread.
    }

    @Override
    public void run() {
        distinguish();
    }
}
