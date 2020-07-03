package concurrency;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class Sync extends Thread {
    List<Integer> nums = new ArrayList<Integer>();

    Sync(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            int randInt = rand.nextInt(100);
            this.nums.add(randInt);
        }
        System.out.println(nums);
    }

    public static void main(String[] args) {
        // I was confused by the instructions, wasn't sure if they wanted it to be
        // runnable on this main or the other so I tried to make it runnable on both.
        // Sync syncThread = new Sync("sync thread");
        // syncThread.start();
        Thread.currentThread().run();
        // this prints out an empty list. write some code that will allow the data
        // generated in the syncThread to show up here. There is a brute force way and a
        // more sophisticated way. Either or will work, but strive for sophistication :)

    }

}