package ArrayList1;
import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    Collections.sort(cars);
    for(String car : cars){
        System.out.println(car);
    }
}
}
