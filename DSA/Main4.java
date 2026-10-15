import java.util.Iterator;
import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Volvo");
        cars.add("Mazda");
        
        Iterator<String> iter = cars.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }

    
}
