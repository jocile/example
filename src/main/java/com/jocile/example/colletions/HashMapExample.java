package com.jocile.example.colletions;

import java.util.HashMap;
import java.util.Map;

/**
 * The typemap list example needed where
 *   it is need to correlate keys with values,
 *   where keys don't repeat,
 *   your impĺements are the hashmap, treemap and hashtable.
 */
public class HashMapExample {

  public static void main(String[] args) {
    Map<String, Integer> mundialChampions = new HashMap<>();
    mundialChampions.put("Brasil", 5);
    mundialChampions.put("Alemanha", 4);
    mundialChampions.put("Itália", 4);
    mundialChampions.put("Uruguay", 2);
    mundialChampions.put("Argentina", 2);
    mundialChampions.put("França", 2);
    mundialChampions.put("Inglaterra", 1);
    mundialChampions.put("Espanha", 1);

    System.out.println("-----------------------------------------------");
    printMapList(mundialChampions);
    System.out.println("Updates the value 6 to a key Brasil:");
    mundialChampions.put("Brasil", 6);
    printMapList(mundialChampions);

    System.out.print("Returns the value of a key Argentina: ");
    System.out.println(mundialChampions.get("Argentina"));
    System.out.print("Returns if there is a key França: ");
    System.out.println(mundialChampions.containsKey("França"));
    System.out.print("Returns if there is a value 6: ");
    System.out.println(mundialChampions.containsValue(6));
    System.out.println("Removes the key França:");
    mundialChampions.remove("França");
    printMapList(mundialChampions);

    System.out.println("Browse the map records:");
    for (Map.Entry<String, Integer> entry : mundialChampions.entrySet()) {
      System.out.println(entry.getKey() + "--" + entry.getValue());
    }
    System.out.println("Browse the map records:");
    for (String key : mundialChampions.keySet()) {
      System.out.println(key + "--" + mundialChampions.get(key));
    }

    System.out.println(
      "The list contains " + mundialChampions.size() + " items."
    );
    System.out.println("Clearing the list:");
    mundialChampions.clear();
    System.out.println(
      "The list contains " + mundialChampions.size() + " items."
    );
  }

  /**
   * print the map list ----
   */
  private static void printMapList(Map<String, Integer> mundialChampions) {
    System.out.println("The map list:");
    System.out.println(mundialChampions);
    System.out.println("-----------------------------------------------");
  }
}
