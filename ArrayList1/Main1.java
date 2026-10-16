package ArrayList1;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Volvo");
        cars.add("Mazda");


        for (String car : cars) {
            System.out.println(car);
        }
    }
}