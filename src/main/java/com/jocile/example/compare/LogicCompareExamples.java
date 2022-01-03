package com.jocile.example.compare;

/**
 * examples of logical operators
 */
public class LogicCompareExamples {

  public static void main(String[] args) {
    compareInt(10, 20);
    compareFloat(14.5f, 3.5f);
    compareCharacter('x', 'y');
    compareStrings("Fulano", "Ciclano");
    compareBoolean(true, false);
  }

  /**
   * comparison examples with integers
   *
   * @param i1 int value
   * @param i2 int value
   */
  public static void compareInt(int i1, int i2) {
    linePrint();
    System.out.println("Integer comparison");
    System.out.print(i1 + " == " + i2 + " is ");
    System.out.println(i1 == i2);
    System.out.print(i1 + " != " + i2 + " is ");
    System.out.println(i1 != i2);
    System.out.print(i1 + " > " + i2 + " is ");
    System.out.println(i1 > i2);
    System.out.print(i1 + " <= " + i2 + " is ");
    System.out.println(i1 <= i2);
    linePrint();
  }

  /**
   * comparison examples with floating numbers
   *
   * @param f1 float value
   * @param f2 float value
   */
  public static void compareFloat(float f1, float f2) {
    System.out.println("Float comparison");
    System.out.print(f1 + " == " + f2 + " is ");
    System.out.println(f1 == f2);
    System.out.print(f1 + " != " + f2 + " is ");
    System.out.println(f1 != f2);
    System.out.print(f1 + " >= " + f2 + " is ");
    System.out.println(f1 >= f2);
    System.out.print(f1 + " < " + f2 + " is ");
    System.out.println(f1 < f2);
    linePrint();
  }

  /**
   * character comparison examples
   *
   * @param c1 character to compare
   * @param c2 character to compare
   */
  public static void compareCharacter(char c1, char c2) {
    System.out.println("Character comparison examples");
    System.out.print(c1 + " == " + c2 + " is ");
    System.out.println(c1 == c2);
    System.out.print(c1 + " != " + c2 + " is ");
    System.out.println(c1 != c2);
    System.out.print(c1 + " >= " + c2 + " is ");
    System.out.println(c1 >= c2);
    System.out.print(c1 + " < " + c2 + " is ");
    System.out.println(c1 < c2);
    linePrint();
  }

  /**
   * text comparison examples
   *
   * @param s1 text to compare
   * @param s2 text to compare
   */
  public static void compareStrings(String s1, String s2) {
    System.out.println("Strings comparison examples");
    System.out.print(s1 + " == " + s2 + " is ");
    System.out.println(s1 == s2);
    System.out.print(s1 + ".equals(" + s2 + ") is ");
    System.out.println(s1.equals(s2));
    System.out.print(s1 + " != " + s2 + " is ");
    System.out.println(s1 != s2);
    System.out.println(s1 + " >= " + s2 + " not possible ");
    // System.out.println(s1 >= s2);
    System.out.println(s1 + " < " + s2 + " not possible ");
    // System.out.println(s1 < s2);
    linePrint();
  }

  /**
   * logical comparison examples
   *
   * @param b1 logical value
   * @param b2 logical value
   */
  public static void compareBoolean(boolean b1, boolean b2) {
    System.out.println("Logical comparison examples");
    System.out.print(b1 + " == " + b2 + " is ");
    System.out.println(b1 == b2);
    System.out.print("!" + b1 + " is ");
    System.out.print(!b1);
    System.out.println(" this is a denial where the result is the opposite");
    System.out.println(b1 + " >= " + b2 + " not possible ");
    System.out.println(b1 + " < " + b2 + "  not possible ");
    System.out.print(b1 + " | " + b2 + " is ");
    System.out.print(b1 | b2);
    System.out.println(
      " this is a OR where if only one is true the result will be true"
    );
    System.out.print(b1 + " && " + b2 + " is ");
    System.out.print(b1 && b2);
    System.out.println(
      " this is a conjunction where if both are true the result is true"
    );
    System.out.print(b1 + " || " + b2 + " is ");
    System.out.print(b1 || b2);
    System.out.println(
      " this is a disjunction where if both are false the result is false"
    );
    System.out.print(b1 + " ^ " + b2 + " is ");
    System.out.print(b1 ^ b2);
    System.out.println(
      " this is an exclusive disjunction where if both are opposite the result is true"
    );
    linePrint();
  }

  /**
   * print the line ----
   */
  private static void linePrint() {
    System.out.println(
      "----------------------------------------------------------------"
    );
  }
}
