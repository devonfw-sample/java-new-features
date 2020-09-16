package com.devonfw.java.newfeatures.java14;

/**
 * Shows new nested classes. They have been internally optimized, no more virtual methods and the only thing we can
 * easily show here is the new reflective access.
 */
public class Java11Nests {

  public static void main(String[] args) {

    for (Class<?> nestMember : Java11Nests.class.getNestMembers()) {
      System.out.println("Nest member: " + nestMember + " with host " + nestMember.getNestHost());
    }
  }

  public class ChildA {

    public class ChildA1 {

    }
  }

  public class ChildB {

  }

}
