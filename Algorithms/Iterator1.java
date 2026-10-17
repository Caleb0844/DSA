package Algorithms;

import java.util.*;

public class Iterator1 {
  public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<>();
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");

    Iterator<String> it = colors.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}