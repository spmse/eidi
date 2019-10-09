package src;

public class StackArray {

  /*
  * Der Stack hier ist halt jetzt für Zahlen, weil es ja auch nur das Prinzip veranschaulichen
  * soll.
  */
  private int[] stack;

  void addToStack(int element) {
     // Check obs überhaupt schon n Stack gibt, falls nicht legen wir den Stack in form eines
    // Arrays an und speichern den wert da rein.
    if(this.stack == null) {
      this.stack = new int[]{element};
    } else {
      // Stack bekommt n neues Element. Dafuer muss das array groesser werden. Zuerst speichern
      // wir unseren jetzigen Stack in nem temporaeren array, dann vergroessern wir den
      // urspruenglichen stack um 1 und fuegen alles nacheinander ein.
      int[] tmpStack = this.stack;
      this.stack = new int[this.stack.length+1];
      this.stack[0] = element;
      // Wir starten hier bei 1, weil das die zweite stelle im array is.
      for(int i = 1; i < this.stack.length; i++) {
        this.stack[i] = tmpStack[i-1];
      }
    }
    System.out.printf("Added the value: %d to the Stack\n", element);
  }

  int getFromStack() {
    if(!(this.stack==null)) {
      return this.stack[0];
    } else {
      System.err.println("Error:\nNo such Stack to get element from.");
      return -1111111111;
    }
  }

  public void removeItem() {
    if(this.stack.length == 0) {
      System.out.println("No such stack to remove item from.");
      return;
    }
    int[] tmpStack = this.stack;
    this.stack = new int[this.stack.length-1];
    for(int i = 0; i < this.stack.length; i++) {
      this.stack[i] = tmpStack[i+1];
    }
    System.out.printf("Removed the value: %d from the Stack\n", tmpStack[0]);
  }

  String showStack() {
    StringBuilder stack = new StringBuilder();
    for(int x = 0; x < this.stack.length; x++) {
      stack.append(this.stack[x]).append(", ");
    }
    return stack.toString().replace(", ", "\n");
  }
}
