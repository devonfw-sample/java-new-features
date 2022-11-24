package com.devonfw.java.newfeatures;

/**
 * {@snippet class = "com.devonfw.java.newfeatures.Java18ExampleJavaDoc" region = "example"}
 */
public class Java18ExampleJavaDoc {

  /**
   * Highlighting based on regex:
   * {@snippet :
   * if (v.isPresent()) {
   *   System.out.println("Hello, World!");      // @highlight regex = '".*"'
   * }
   * }
   */
  public static void exampleCode() {

    // @start region = example
    String foo = "bar";
    // comment
    assert foo.equals("bar");
    // @end region = example
  }

}
