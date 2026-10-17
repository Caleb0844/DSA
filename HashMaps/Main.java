package HashMaps;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        var capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Kenya", "Nairobi");
        capitalCities.put("Ukraine", "Kyiv");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");


      // System.out.println(capitalCities.get("England"));
       //capitalCities.remove("USA");
       //for(String city : capitalCities.values()){
        //System.out.println(city);

     //  }
     for(String pair : capitalCities.keySet()){
        System.out.println("Key: "+ pair + ", Value: " + capitalCities.get(pair));
     }
     // System.out.println(capitalCities);
     }
    
}
