package ArrayList1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teams = new ArrayList<String>();
        teams.add("ManCity");
        teams.add("Arsenal");
        teams.add("ManUnited");
        teams.add("Chelsea");

        teams.add(0, "Chelsea");
        teams.set(1, "Champions");
        System.out.println(teams.size());
    }
}
