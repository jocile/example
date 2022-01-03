package com.jocile.example.colletions;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * The Treemap list example needed where
 *   it is need to correlate keys with values, where
 *   keys do not repeat and is ordered on each insert.
 */
public class TreeMapExample {

  public static void main(String[] args) {
    TreeMap<String, String> treeCapitals = new TreeMap<>();
    treeCapitals.put("RS", "Porto Alegre");
    treeCapitals.put("SC", "Florianópolis");
    treeCapitals.put("PR", "Curitiba");
    treeCapitals.put("SP", "São Paulo");
    treeCapitals.put("RJ", "Rio de Janeiro");
    treeCapitals.put("MG", "Belo Horizonte");

    System.out.println("-----------------------------------------------");
    printMapList(treeCapitals);
    System.out.println(
      "The first capital key at the top of the tree is: " +
      treeCapitals.firstKey()
    );
    System.out.println(
      "The first capital at the top of the tree is: " +
      treeCapitals.firstEntry().getKey() +
      " - " +
      treeCapitals.firstEntry().getValue()
    );
    System.out.println(
      "The last capital key at the end of the tree is: " +
      treeCapitals.lastKey()
    );
    System.out.println(
      "The last capital at the end of the tree is: " +
      treeCapitals.lastEntry().getKey() +
      " - " +
      treeCapitals.lastEntry().getValue()
    );
    System.out.println(
      "The first capital key under the key SC is: " +
      treeCapitals.lowerKey("SC")
    );
    System.out.println(
      "The first capital under of the key SC is: " +
      treeCapitals.lowerEntry("SC").getKey() +
      " - " +
      treeCapitals.lowerEntry("SC").getValue()
    );
    System.out.println(
      "The first capital key above the key SC is: " +
      treeCapitals.higherKey("SC")
    );
    System.out.println(
      "The first capital above of the key SC is: " +
      treeCapitals.higherEntry("SC").getKey() +
      " - " +
      treeCapitals.higherEntry("SC").getValue()
    );

    printMapList(treeCapitals);
    System.out.println(
      "Return removing the first capital at the top of the tree: " +
      treeCapitals.firstEntry().getKey() +
      " - " +
      treeCapitals.pollFirstEntry().getValue()
    );
    System.out.println(
      "Return removing the last capital at the end of the tree: " +
      treeCapitals.lastEntry().getKey() +
      " - " +
      treeCapitals.pollLastEntry().getValue()
    );
    printMapList(treeCapitals);

    System.out.println("Browse the treemap records keys:");
    Iterator<String> iterator = treeCapitals.keySet().iterator();

    while (iterator.hasNext()) {
      String key = iterator.next();
      System.out.println(key + " - " + treeCapitals.get(key));
    }
    System.out.println("Browse the treemap records keys:");
    for (String capital : treeCapitals.keySet()) {
      System.out.println(capital + " -- " + treeCapitals.get(capital));
    }
    System.out.println("Browse the treemap records keys:");
    for (Map.Entry<String, String> capital : treeCapitals.entrySet()) {
      System.out.println(capital.getKey() + " --- " + capital.getValue());
    }
    System.out.println("The list contains " + treeCapitals.size() + " items.");
    System.out.println("Clearing the list:");
    treeCapitals.clear();
    System.out.println("The list contains " + treeCapitals.size() + " items.");
  }

  /**
   * print the map list ----
   */
  private static void printMapList(Map<String, String> treeCapitals) {
    System.out.println("The map list:");
    System.out.println(treeCapitals);
    System.out.println("-----------------------------------------------");
  }
}
