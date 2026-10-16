package ArrayList1;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Volvo");
        cars.add("Mazda");

        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }



        }
    }
