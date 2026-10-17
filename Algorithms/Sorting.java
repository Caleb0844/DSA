package Algorithms;
import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(42);
        nums.add(55);
        nums.add(14);
        nums.add(2);
        nums.add(67);
        nums.add(45);
        nums.add(29);

       /*for(int num : nums){
        System.out.println(num);
       }*/
       // System.out.println(nums);

       Collections.sort(nums, Collections.reverseOrder()); //sort and in reverse sort
       System.out.println(nums);
    }
    
}
