package LinkeList;
import java.util.Collections;
import java.util.ArrayList;
//sorting
public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

       // Collections.sort(cars);//SOrt
        //sort reverse order
        Collections.sort(cars, Collections.reverseOrder());
        for(String car : cars){
            System.out.println(car);
        }
        
    }
}
