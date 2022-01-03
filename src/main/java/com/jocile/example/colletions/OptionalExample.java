package com.jocile.example.colletions;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class OptionalExample {

  public static void main(String[] args) {
    Optional<String> optionalString = Optional.of("present value");

    linePrint();
    System.out.print("Present value is: ");
    optionalString.ifPresentOrElse(
      System.out::println,
      () -> System.out.println("is not present")
    );
    // optionalString.ifPresentOrElse((value) -> System.out.println(value), () -> System.out.println("is not present"));

    System.out.print("The optional present value using conditional: ");
    if (optionalString.isPresent()) {
      String value = optionalString.get();
      System.out.println(value);
    }

    System.out.print("The optional present value using map: ");
    optionalString
      .map(value -> value.concat("****"))
      .ifPresent(System.out::println);

    linePrint();
    System.out.print("Value that is not present: ");
    Optional<String> optionalNull = Optional.ofNullable(null);
    optionalNull.ifPresentOrElse(
      System.out::println,
      () -> System.out.println("Null = is not present")
    );

    System.out.print("Optional value that is not present: ");
    Optional<String> optionalEmpty = Optional.empty();
    optionalEmpty.ifPresentOrElse(
      System.out::println,
      () -> System.out.println("Empty = is not present")
    );
    System.out.print("Is the optional value empty? ");
    System.out.println(optionalEmpty.isEmpty());
    System.out.print("Is the optional value present? ");
    System.out.println(optionalEmpty.isPresent());

    linePrint();
    System.out.print("Optional integer value is present: ");
    OptionalInt.of(12).ifPresent(System.out::println);

    System.out.print("Optional decimal value is present: ");
    OptionalDouble.of(55.2).ifPresent(System.out::println);

    System.out.print("Optional long value is present: ");
    OptionalLong.of(23L).ifPresent(System.out::println);

    linePrint();
    System.out.print("Optional value that throws an exception: ");
    System.out.println(optionalEmpty.orElseThrow(IllegalStateException::new));
    // Optional<String> optionalNullError = Optional.of(null);
    // optionalNullError.ifPresentOrElse(
    //   System.out::println,
    //   () -> System.out.println("Error = is not present")
    // );
  }

  /**
   * print the line ----
   */
  public static void linePrint() {
    System.out.println("-----------------------------------------------");
  }
}
