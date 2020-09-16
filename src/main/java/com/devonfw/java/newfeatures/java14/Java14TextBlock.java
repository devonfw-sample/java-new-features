package com.devonfw.java.newfeatures.java14;

/**
 * Shows JEP 355: text blocks (multiline string literals)
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
