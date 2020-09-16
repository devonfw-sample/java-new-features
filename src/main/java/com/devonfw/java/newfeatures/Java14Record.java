package com.devonfw.java.newfeatures;

import java.lang.reflect.RecordComponent;
import java.time.LocalDate;

/**
 * Shows <a href="https://openjdk.java.net/jeps/384">JEP 384</a>: records
 */
public class Java14Record {

  public static void main(String[] args) throws Exception {

    Person p1 = new Person("Peter", "Pan", LocalDate.of(1999, 12, 31));
    System.out.println(p1.firstName + " " + p1.lastName);
    System.out.println(p1);
    System.out.println("Is record: " + Person.class.isRecord());
    for (RecordComponent property : Person.class.getRecordComponents()) {
      System.out.println("Property " + property.getName() + " has type " + property.getType() + " and value "
          + property.getAccessor().invoke(p1));
    }
    Person p2 = new Person("Peter", "Pan", LocalDate.of(1999, 12, 31));
    System.out.println("p1.equals(p2):" + p1.equals(p2));
    Person p3 = new Person("John", "Doe", LocalDate.of(2000, 01, 01));
    System.out.println("p1.equals(p3):" + p1.equals(p3));
  }

  public record Person(String firstName, String lastName, LocalDate birthday) {

  }
}
