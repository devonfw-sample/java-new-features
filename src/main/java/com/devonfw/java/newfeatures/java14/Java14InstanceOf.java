package com.devonfw.java.newfeatures.java14;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Shows <a href="https://openjdk.java.net/jeps/305">JEP 305</a>: instanceof with pattern matching
 */
public class Java14InstanceOf {

  public static void main(String[] args) {

    Vector<String> vector = new Vector<>();
    vector.add("one");
    vector.add("two");
    vector.add("three");
    System.out.println(invoke(vector.elements()));
    System.out.println(invoke(vector.iterator()));
  }

  public static String invoke(Object o) {

    StringBuilder sb = new StringBuilder();
    if (o instanceof Enumeration<?> e) {
      // var e = (Enumeration<?>) o;
      while (e.hasMoreElements()) {
        if (sb.length() > 0) {
          sb.append(',');
        }
        sb.append(e.nextElement());
      }
    } else if (o instanceof Iterator<?> i) {
      // var i = (Iterator<?>) o;
      while (i.hasNext()) {
        if (sb.length() > 0) {
          sb.append(',');
        }
        sb.append(i.next());
      }
    }
    return sb.toString();
  }

  public static class Foo {
    public String foo() {

      return "foo";
    }
  }

  public static class Bar {
    public String bar() {

      return "bar";
    }
  }

}
