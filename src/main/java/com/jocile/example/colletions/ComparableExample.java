package com.jocile.example.colletions;

/**
 * This is a domain class that implements Comparable by defining an ordering rule.
 * For an outer class it is indicated to implement Comparator.
 *
 * @see ComparableExampleList implements this example list
 */
public class ComparableExample implements Comparable<ComparableExample> {
  private final String name;
  private final Integer age;

  public ComparableExample(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public Integer getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "ComparableExample [age=" + age + ", name=" + name + "]";
  }

  /**
   * This function implements the ordering rule,
   *  where the current object is compared to another object
   *  and the default result is negative or positive number.
   */
  @Override
  public int compareTo(ComparableExample o) {
    return this.getAge() - o.getAge();
  }
}
/** This outer class implements Compator by comparing the ordering rule
public class ComparatorExample implements Comparator<ComparableExample>{
  @Override
  public int compare(ComparableExample o1, ComparatorExamble o2) {
    return o2.getAge() - o1.getAge();
  }
}
 */
