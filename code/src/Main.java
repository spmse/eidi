package src;

import java.util.Stack;

public class Main {
  /**
   * This class is for testing purposes.
   * All Implementations will be tested here.
   */
  public static void main(String[] args) {
    StackArray stack = new StackArray();
    stack.addToStack(1);
    stack.addToStack(3);
    stack.addToStack(3);
    stack.addToStack(7);
    System.out.println("\nThis is the current Stack: " + stack.showStack());

  }
}