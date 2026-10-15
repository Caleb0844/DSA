import java.util.HashSet;
public class Main2 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Benz");
        cars.add("BMW");//duplicate o duplictes are allowed
        cars.add("Volvo");
        System.out.println(cars); //prints BMW once since each element must be unique
    }
    
}
