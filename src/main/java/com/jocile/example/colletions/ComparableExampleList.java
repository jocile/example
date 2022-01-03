package com.jocile.example.colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that uses ComparableExemple as an ordering rule.
 *
 * @see ComparableExample Comparable implementations
 */
public class ComparableExampleList {

  public static void main(String[] args) {
    List<ComparableExample> students = new ArrayList<>();

    students.add(new ComparableExample("Pedro", 19));
    students.add(new ComparableExample("Carlos", 23));
    students.add(new ComparableExample("Mariana", 21));
    students.add(new ComparableExample("João", 18));
    students.add(new ComparableExample("Thiago", 20));
    students.add(new ComparableExample("George", 22));
    students.add(new ComparableExample("Larissa", 21));

    System.out.println("-----------------------------------------------");
    System.out.println("List with insertion order: ");
    printstudentsList(students);

    System.out.println("List with natural number order by age: ");
    students.sort((first, second) -> first.getAge() - second.getAge());
    printstudentsList(students);

    System.out.println("List with reverse order of number by age: ");
    students.sort((first, second) -> second.getAge() - first.getAge());
    printstudentsList(students);

    System.out.println(
      "List with natural number order by age using method reference: "
    );
    students.sort(Comparator.comparingInt(ComparableExample::getAge));
    printstudentsList(students);

    System.out.println(
      "List with reverse order of number by age using method reference: "
    );
    students.sort(
      Comparator.comparingInt(ComparableExample::getAge).reversed()
    );
    printstudentsList(students);

    System.out.println(
      "List with natural order by age number using Collections methods and implementation of Comparable: "
    );
    Collections.sort(students);
    printstudentsList(students);
    // System.out.println(
    //   "List with natural number order by age using Comparator interface: "
    // );
    // Collections.sort(students, new ComparatorExample());
    // printstudentsList(students);
  }

  /**
   * Print the students List
   */
  private static void printstudentsList(List<ComparableExample> students) {
    System.out.println(students);
    System.out.println("-----------------------------------------------");
  }
}
