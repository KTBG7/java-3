package concurrency;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class TeamTC1 implements Runnable {
    List<String> team = new ArrayList<String>();
    List<String> colors = new ArrayList<>();
    Random rand = new Random();
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public void team() {
        this.team.add("Dylan");
        this.team.add("George");
        this.team.add("Jeramie");
        this.team.add("John");
        this.team.add("Katherine");
        this.team.add("Kevin");
        this.team.add("Nancy");
        this.team.add("Sabitha");
        this.team.add("Victor");
        this.team.add("Jesicca");
        this.team.add("Matthew");
        this.team.add("Vani");
        this.team.add("Norita");
        this.team.add("Vimala");
        this.colors.add(ANSI_WHITE);
        this.colors.add(ANSI_BLACK);
        this.colors.add(ANSI_RED);
        this.colors.add(ANSI_GREEN);
        this.colors.add(ANSI_YELLOW);
        this.colors.add(ANSI_BLUE);
        this.colors.add(ANSI_PURPLE);
        this.colors.add(ANSI_CYAN);

        for (int i = 0; i < team.size(); i++) {
            System.out.println(colors.get(rand.nextInt(8)) + team.get(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(team);

        /*
         * for (String s : team) { System.out.println(s); try { Thread.sleep(1000); }
         * catch (InterruptedException e) { e.printStackTrace(); } }
         * System.out.println(team);
         */
    }

    @Override
    public void run() {
        team();
    }

    // This thread should be created by implementing the Runnable interface, NOT by
    // extending the Thread class. In the run method of this thread, print out the
    // name of each student in your TA group, (starting with your TA). There should
    // be a pause of 1 second before each name is printed to the console.The name
    // should then be pushed to the team List After all the names have been pushed
    // to this List, print out the entire list of all the students in your TA group.
    // Don't forget your TA as well! All of these steps should be done whenever the
    // thread is started. (i.e. it can be done directly in the run()method of the
    // thread itself). Kick off the thread in the Main class of the concurrency
    // package.
}