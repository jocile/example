package com.jocile.example.colletions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * The set list exemple
 * this list does not guarantee the order of insertion,
 * add does not allow repeated values,
 * but is suitable for large amounts of data.
 */
public class SetExample {

  public static void main(String[] args) {
    linePrint();
    System.out.println(
      "The HashSet is not ordered and does not allow repeated values:"
    );
    Set<Double> studentGrade = new HashSet<>();
    studentGrade.add(5.8);
    studentGrade.add(9.3);
    studentGrade.add(6.5);
    studentGrade.add(10.0);
    studentGrade.add(5.4);
    studentGrade.add(7.3);
    studentGrade.add(3.8);
    studentGrade.add(4.0);
    System.out.println(studentGrade);

    linePrint();
    System.out.println("The LinkedHashSet keep order but slower:");
    LinkedHashSet<Integer> numberSequence = new LinkedHashSet<>();
    numberSequence.add(16);
    numberSequence.add(2);
    numberSequence.add(8);
    numberSequence.add(4);
    numberSequence.add(1);
    System.out.println(numberSequence);

    linePrint();
    System.out.println("Remove the number 4:");
    numberSequence.remove(4);
    System.out.println(numberSequence);

    linePrint();
    System.out.println("Scrolling through the list:");
    for (Integer itemNumber : numberSequence) {
      System.out.println(itemNumber);
    }

    System.out.println("Using iterator:");
    Iterator<Integer> iterator = numberSequence.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    linePrint();
    System.out.println("The TreeSet keeps order add can be reordered:");
    TreeSet<String> citiesTree = new TreeSet<>();
    citiesTree.add("Porto Alegre");
    citiesTree.add("Florianópolis");
    citiesTree.add("Curitiba");
    citiesTree.add("São Paulo");
    citiesTree.add("Rio de Janeiro");
    citiesTree.add("Belo Horizonte");
    System.out.println("The three list:" + citiesTree);

    System.out.print("The first element: ");
    System.out.println(citiesTree.first());

    System.out.print("The last element: ");
    System.out.println(citiesTree.last());

    System.out.print("The first element Florianópolis below: ");
    System.out.println(citiesTree.lower("Florianópolis"));

    System.out.print("The first element Florianópolis higher: ");
    System.out.println(citiesTree.higher("Florianópolis"));

    System.out.print("Remove the first element: ");
    System.out.println(citiesTree.pollFirst());

    System.out.println("The three list:" + citiesTree);

    System.out.print("Remove the last element: ");
    System.out.println(citiesTree.pollLast());

    System.out.println("The three list:" + citiesTree);

    System.out.println("Scrolling through the list:");
    for (String itemCities : citiesTree) {
      System.out.println(itemCities);
    }

    System.out.println("Using itarator:");
    Iterator<String> iteratorCities = citiesTree.iterator();
    while (iteratorCities.hasNext()) {
      System.out.println(iteratorCities.next());
    }
  }

  /**
   * print the line ----
   */
  public static void linePrint() {
    System.out.println("-----------------------------------------------");
  }
}
