package com.devonfw.java.newfeatures.java14;

import java.time.DayOfWeek;

/**
 * Shows new nice switch syntax.
 */
public class Java14Switch {

  public static void main(String[] args) {

    for (DayOfWeek weekday : DayOfWeek.values()) {
      System.out.println("isWeekday(" + weekday + ") = " + isWeekday(weekday));
    }
  }

  private static boolean isWeekday(DayOfWeek weekday) {

    return switch (weekday) {
      case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> true;
      case SATURDAY, SUNDAY -> false;
    };
  }

}
