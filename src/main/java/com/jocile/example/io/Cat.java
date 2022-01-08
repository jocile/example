package com.jocile.example.io;

import java.io.Serializable;

/**
 * This class is used in the object serialization example.
 *
 * @see ObjectIoExample
 */
public class Cat implements Serializable {
  private static final long serialVersionUID = 1L;
  private String name;
  private Integer age;
  private String color;
  private boolean castrated;
  private transient boolean purrs; // optionally cat sound while sleeping

  /**
   * Construct the instance using the specified attributes
   *
   * @param name
   * @param age
   * @param color
   * @param castrated
   * @param purrs optional cat sound while sleeping
   */
  public Cat(
    String name,
    Integer age,
    String color,
    boolean castrated,
    boolean purrs
  ) {
    this.name = name;
    this.age = age;
    this.color = color;
    this.castrated = castrated;
    this.purrs = purrs;
  }

  public Cat() {}

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public String getColor() {
    return color;
  }

  public boolean isCastrated() {
    return castrated;
  }

  public boolean isPurrs() {
    return purrs;
  }

  @Override
  public String toString() {
    return (
      "Cat [age=" +
      age +
      ", castrated=" +
      castrated +
      ", color=" +
      color +
      ", name=" +
      name +
      ", purrs=" +
      purrs +
      "]"
    );
  }
}
