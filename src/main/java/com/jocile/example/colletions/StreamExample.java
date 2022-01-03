package com.jocile.example.colletions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a list to manipulate data from another list
 */
public class StreamExample {

  public static void main(String[] args) {
    List<String> studants = new ArrayList<>();
    studants.add("Pedro");
    studants.add("Thayse");
    studants.add("Marcelo");
    studants.add("Carla");
    studants.add("Juliana");
    studants.add("Thiago");
    studants.add("Rafael");

    linePrint();
    System.out.println("The list is: " + studants);
    System.out.println(
      "The count of stream list elements is: " + studants.stream().count()
    );

    System.out.println(
      "The element with the highest number of letters is: " +
      studants.stream().max(Comparator.comparingInt(String::length))
    );

    System.out.println(
      "The element with the smallest number of letters is: " +
      studants.stream().min(Comparator.comparingInt(String::length))
    );

    System.out.println(
      "The elements that contain the letter R are: " +
      studants
        .stream()
        .filter(
          ComparableExample -> ComparableExample.toLowerCase().contains("r")
        )
        .collect(Collectors.toList())
    );

    linePrint();
    System.out.println(
      "New collection with concatenated names and the number of letters: "
    );
    System.out.println(
      studants
        .stream()
        .map(
          ComparableExample ->
            ComparableExample
              .concat(" - ")
              .concat(String.valueOf(ComparableExample.length()))
        )
        .collect(Collectors.toList())
    );

    System.out.println(
      "The first three elements are: " +
      studants.stream().limit(3).collect(Collectors.toList())
    );

    linePrint();
    System.out.println("The list with an action for each element: ");
    System.out.println(
      studants.stream().peek(System.out::println).collect(Collectors.toList())
    );

    linePrint();
    System.out.println(
      "Show each element with an action, but without returning the list: "
    );
    studants.stream().forEach(System.out::println);

    linePrint();
    System.out.println(
      "Does the list have all elements with the letter W? " +
      studants.stream().allMatch(element -> element.contains("W"))
    );

    System.out.println(
      "Does the list have any elements with lowercase a? " +
      studants.stream().anyMatch(element -> element.contains("a"))
    );

    System.out.println(
      "Does the list not have any elements with lowercase a? " +
      studants.stream().noneMatch(element -> element.contains("a"))
    );

    System.out.print("If the first element exists it is: ");
    studants.stream().findFirst().ifPresent(System.out::println);

    linePrint();
    System.out.println(
      "Linked operations: " +
      "elements with the size and group elements with the letter r"
    );
    System.out.println(
      studants
        .stream()
        .peek(System.out::println)
        .map(
          ComparableExample ->
            ComparableExample
              .concat(" - ")
              .concat(String.valueOf(ComparableExample.length()))
        )
        .peek(System.out::println)
        .filter(
          ComparableExample -> ComparableExample.toLowerCase().contains("r")
        )
        // .collect(Collectors.toList())
        // .collect((Collectors.joining(", ")))
        // .collect(Collectors.toSet())
        .collect(
          Collectors.groupingBy(
            ComparableExample ->
              ComparableExample.substring(ComparableExample.indexOf("-") + 1)
          )
        )
    );
  }

  /**
   * print the line ----
   */
  public static void linePrint() {
    System.out.println("-----------------------------------------------");
  }
}
