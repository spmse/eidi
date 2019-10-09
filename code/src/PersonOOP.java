package src;

public class PersonOOP {

  // wir reduzieren mal auf das wesentliche
  private int age;
  private String name;
  private String lastName;
  private String gender;

  public PersonOOP(int alter, String vorname, String nachname, String geschlecht) {
    // this is die referenz auf das objekt PersonOOP
    this.age = alter;
    this.name = vorname;
    this.lastName = nachname;
    this.gender = geschlecht;
    printSomeStaticStuff("[INFO from constructur in PersonOOP.java]:\n"
        + "Created new Person called: " + this.name + this.lastName
        + " , aged: " + this.age);
  }

  /**
   * das is jetzt mal n beispiel fuer ne objektmethode. du brauchst dafuer halt ein objekt. Wenn du
   * ne methode Static machst, dann kannst du die ohne eine Instanz aufrufen.
   *
   * @return "Hello"
   */
  String sayHello() {
    return " [" + this.name + "] Hello";
  }

  static String printSomeStaticStuff(String stuff) {
    return stuff;
  }

  void say(String s) {
    System.out.println(" [" + this.name + "] " + s);
  }
}
