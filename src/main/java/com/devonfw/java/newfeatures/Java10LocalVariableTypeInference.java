package com.devonfw.java.newfeatures;

import java.util.ArrayList;

/**
 * Shows <a href="https://openjdk.java.net/jeps/286">JEP 286</a>: Local-Variable Type Inference
 */
public class Java10LocalVariableTypeInference {

  public static void main(String[] args) {

    var list = new ArrayList<String>(); // infers ArrayList<String>
    var stream = list.stream(); // infers Stream<String>
    System.out.println(stream.getClass().getName());
  }

}
