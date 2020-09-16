package com.devonfw.java.newfeatures;

import java.util.Map;
import java.util.Set;

/**
 * Shows <a href="https://openjdk.java.net/jeps/269">JEP 269</a>: Convenience Factory Methods for Collections
 */
public class Java09CollectionFactoryMethods {

  public static void main(String[] args) {

    for (Class<?> nestMember : Java09CollectionFactoryMethods.class.getNestMembers()) {
      Set<String> set = Set.of("a", "b", "c");
      System.out.println(set);
      Map<String, Integer> map = Map.of("one", 1, "two", 2);
      System.out.println(map);
    }
  }

}
