package HashSet;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        HashSet<Integer> myNums = new HashSet<Integer>();
        myNums.add(2);
        myNums.add(12);
        myNums.add(9);
        myNums.add(7);
        myNums.add(23);

       // System.out.println(myNums.contains(7));
       for(int i = 0; i<10; i++){
        if(myNums.contains(i)){
            System.out.println(i + " was foud in the set");

        }else{
           System.out.println(i+" was not found in the set");
       }

       }
    }
}
