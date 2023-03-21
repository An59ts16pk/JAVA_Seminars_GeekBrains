package SemOOP_DZ_07ispr;

// Заставить работать. (помним про SOLID)
// Без if - else и без exeption.
/**
 * public class app {

  public static void main(String[] args) {
    new Innerapp(null).write();
  }
}

interface IInterface {
  void print();
}

class Innerapp {
  IInterface v;

  public Innerapp(IInterface v) {
    this.v = v;
  }

  void write() {
    v.print();
  }
}
 */

public class App {
    public static void main(String[] args) {

        new Innerapp(null).write();
    }
}
