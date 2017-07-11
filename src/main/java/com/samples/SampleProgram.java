package com.samples;

/**
 * Created by praveen on 7/10/17.
 */
public class SampleProgram {

  public static void main(String[] args) {
    System.out.println("Hi..!!");

    try {
      System.out.println("Inside try..!!");
      System.exit(0);
    } finally {
      System.out.println("Inside finally..!!");
    }
  }

}
