package concurrency;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

class TeamTC1 implements Runnable {
    List<String> team = new ArrayList<String>();
    List<String> colors = new ArrayList<>();
    Random rand = new Random();

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
        this.colors.add("red");
        this.colors.add("purple");
        this.colors.add("blue");
        this.colors.add("light blue");
        this.colors.add("orange");
        this.colors.add("green");
        this.colors.add("violet");
        this.colors.add("pink");
        this.colors.add("hot pink");
        this.colors.add("black");
        this.colors.add("white");
        this.colors.add("brown");
        this.colors.add("turquoise");
        this.colors.add("crimson red");

        for (int i = 0; i < team.size(); i++) {
            System.out.println(team.get(i));
            System.out.println(colors.get(rand.nextInt(14)));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(team);
        }

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