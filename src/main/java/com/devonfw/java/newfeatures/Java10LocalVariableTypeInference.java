package com.devonfw.java.newfeatures;

import java.util.ArrayList;

/**
 * Shows <a href="https://openjdk.java.net/jeps/286">JEP 286</a>: Local-Variable Type Inference
 */
public class Java10LocalVariableTypeInference {

  public static void main(String[] args) {

    var list = new ArrayList<String>(); // infers ArrayList<String>
    var stream = list.stream(); // infers Stream<String>
    var flag = true;
    var number = (byte) 0;
    System.out.println(stream.getClass().getName());
    System.out.println(flag);
    System.out.println(number);
  }

}
