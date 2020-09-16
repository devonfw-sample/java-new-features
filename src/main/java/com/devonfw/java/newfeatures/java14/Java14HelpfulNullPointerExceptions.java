package com.devonfw.java.newfeatures.java14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * Shows <a href="https://openjdk.java.net/jeps/358">JEP 358</a>: Helpful NullPointerExceptions<br>
 * You need to run this with JVM option "-XX:+ShowCodeDetailsInExceptionMessages"
 */
public class Java14HelpfulNullPointerExceptions {

  public static void main(String[] args) {

    List<Supplier<String>> list = new ArrayList<>();
    list.add(() -> null);
    System.out.println(list.get(0).get().length());
  }

}
