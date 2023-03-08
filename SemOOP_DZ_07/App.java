package SemOOP_DZ_07;

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

import java.util.Optional;

// Вариант 2.

public class App {

  public static void main(String[] args) {
    new Innerapp(Optional.ofNullable(null)).write();
  }
}

interface IInterface {
  void print();
}

class Innerapp {
  Optional<Object> v;

  public Innerapp(Optional<Object> v) {
    this.v = v;
  }

  void write() {
    //v.print();
    System.out.print(v);
  }
}

// Вариант 1.

// public class App {

//   public static void main(String[] args) {
//     new Innerapp(null).write();
//   }
// }

// interface IInterface {
//   void print();
// }

// class Innerapp {
//   Optional<IInterface> v;

//   public Innerapp(IInterface v) {
//     this.v = Optional.ofNullable(v);
//   }

//   void write() {
//     //v.print();
//     System.out.print(v);
//   }
// }
