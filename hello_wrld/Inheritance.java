package hello_wrld;
//The extends keyword is used for inheritance
//creating new classes based on existing ones. A class that 
//inherits from another class can reuse the methods and fields of that class. In addition,
//you can add new fields and methods to your current class as well
//ADV: Code reusability &method overriding
//types:simple, multilevel, heirarchical, multiple(via interfaces), and hybrid
//eg: Hierarchical  inheritance

class A {
 public void print_A() { System.out.println("Class A"); }
}

class B extends A {
 public void print_B() { System.out.println("Class B"); }
}

class C extends A {
 public void print_C() { System.out.println("Class C"); }
}

class D extends A {
 public void print_D() { System.out.println("Class D"); }
}

//Driver Class
public class Inheritance {
 public static void main(String[] args)
 {
     B obj_B = new B();
     obj_B.print_A();
     obj_B.print_B();

     C obj_C = new C();
     obj_C.print_A();
     obj_C.print_C();

     D obj_D = new D();
     obj_D.print_A();
     obj_D.print_D();
 }
}
/* interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
     public void myMethod() { //necessary to declare implemented methods as public 
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class main {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}*/

