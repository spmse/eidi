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
    System.out.println("\nThis is the current Stack:\n" + stack.showStack());
    System.out.println("First element from Stack: " + stack.getFromStack());
    stack.removeItem();
    System.out.println("\nThis is the current Stack:\n" + stack.showStack());
    stack.removeItem();
    System.out.println("\nThis is the current Stack:\n" + stack.showStack());
    stack.removeItem();
    System.out.println("\nThis is the current Stack:\n" + stack.showStack());
    stack.removeItem();
    System.out.println("\nThis is the current Stack:\n" + stack.showStack());
    stack.removeItem();
    System.out.println("\nThis is the current Stack:\n" + stack.showStack());
    stack.addToStack(4);
    stack.addToStack(3);
    stack.addToStack(2);
    stack.addToStack(1);
    System.out.println(stack.showStack());

    // OOP Personenbeispiel
    System.out.println("###\n### NEW STUFF\n###\n");
    System.out.println(PersonOOP.printSomeStaticStuff("\nLORUM IPSUM BLINDTEXT.\n Hier gibts "
        + "keine Instanz einer PersonOOP."));
    PersonOOP sp = new PersonOOP(25,"s.p.","meier","m");
    System.out.println(PersonOOP.printSomeStaticStuff("There we go, jetzt gibts eine instanz "
        + "aber ich kann die methode ohne die benutzen."));
    PersonOOP bella = new PersonOOP(20,"isabella","vogg","f");
    System.out.println(sp.sayHello());
    System.out.println(bella.sayHello());
    sp.say("omfg informatics so awesome, but y tho java");
    bella.say("freak");

  }
}
