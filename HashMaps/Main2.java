package HashMaps;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {
        TreeMap<String, String> capitalCities = new TreeMap<String, String>();
            capitalCities.put("England", "London");
            capitalCities.put("India", "New Dehli");
            capitalCities.put("Austria", "Wien");
            capitalCities.put("Norway", "Oslo");
            capitalCities.put("Norway", "Oslo"); // Duplicate
            capitalCities.put("USA", "Washington DC");

            for(String i : capitalCities.keySet()){
                System.out.println(i + capitalCities.get(i));
            }
    }
    
}
