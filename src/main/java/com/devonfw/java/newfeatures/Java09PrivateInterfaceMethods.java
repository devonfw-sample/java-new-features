package com.devonfw.java.newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Shows <a href="https://openjdk.java.net/jeps/213">JEP 213</a>: Milling Project Coin (private interface methods,
 * etc.)<br>
 * See Algebra.validate method.
 */
public class Java09PrivateInterfaceMethods {

  public static void main(String[] args) {

    Algebra<Double> algebra = new Algebra<Double>() {
      @Override
      public Double add(Double first, Double second) {

        return Double.valueOf(first.doubleValue() + second.doubleValue());
      }

      @Override
      public Double sub(Double first, Double second) {

        return Double.valueOf(first.doubleValue() - second.doubleValue());
      }
    };
    // 2 + 3 + 4 = 9
    System.out.println(algebra.add(Arrays.asList(Double.valueOf(2), Double.valueOf(3), Double.valueOf(4))));
  }

  public interface Algebra<T> {

    T add(T first, T second);

    default T add(List<T> values) {

      validate(values);
      T result = values.get(0);
      for (int i = 1; i < values.size(); i++) {
        result = add(result, values.get(i));
      }
      return result;
    }

    T sub(T first, T second);

    default T sub(List<T> values) {

      validate(values);
      T result = values.get(0);
      for (int i = 1; i < values.size(); i++) {
        result = sub(result, values.get(i));
      }
      return result;
    }

    private void validate(List<T> values) {

      Objects.requireNonNull(values, "values");
      if (values.isEmpty()) {
        throw new IllegalArgumentException("values must not be empty!");
      }
      if (values.size() == 1) {
        throw new IllegalArgumentException("values has to have more than one element!");
      }
    }

  }

}
