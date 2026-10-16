package LinkeList;
import java.util.Collections;
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
            numbers.add(33);
            numbers.add(15);
            numbers.add(20);
            numbers.add(34);
            numbers.add(8);
            numbers.add(12);
            //Sort 
            Collections.sort(numbers);
            for(int num : numbers){
                System.out.println(num);
            }
            //Reverse sort
            Collections.sort(numbers, Collections.reverseOrder());
            for(int num : numbers){
                System.out.println(num);
            }

    }
    
}
