package com.jocile.example.colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//#endregion;

/**
 * List example
 */
public class ListExample {

  public static void main(String[] args) {
    List<String> names = new ArrayList<>();

    names.add("Carlos");
    names.add("Pedro");
    names.add("Juliana");
    names.add("Anderson");
    names.add("Maria");
    names.add("joão");

    linePrint();
    System.out.println(names);

    linePrint();
    System.out.println("Insert item Larissa in position 2 :");
    names.set(2, "Larissa");
    System.out.println(names);

    linePrint();
    System.out.println("Ordered list with " + names.size() + " items :");
    Collections.sort(names);
    System.out.println(names);

    linePrint();
    System.out.println("Remove itens list :");
    names.remove(5);
    System.out.println(names);
    names.remove("Larissa");
    System.out.println(names);

    linePrint();
    System.out.println("Return the element in the position 0: " + names.get(0));
    System.out.println(
      "Return the position of the element Anderson :" +
      names.indexOf("Anderson")
    );

    linePrint();
    System.out.println("Scrolling through the list :");
    for (String itemNames : names) {
      System.out.println(itemNames);
    }

    linePrint();
    System.out.println("Using iterator :");
    Iterator<String> iterator = names.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    linePrint();
  }

  /**
   * print the line ----
   */
  public static void linePrint() {
    System.out.println("-----------------------------------------------");
  }
}
