package com.devonfw.java.newfeatures;

/**
 * Shows <a href="https://openjdk.java.net/jeps/355">JEP 355</a>: text blocks (multiline string literals)
 */
public class Java14TextBlock {

  public static void main(String[] args) {

    String text = """
        {
          "this": "is json"
        }
        """;

    System.out.println(text);
  }

}
