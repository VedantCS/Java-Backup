package hello_wrld;
class Person { void role() {
					System.out.println("I am a person.");
 }
}
class Father extends Person {
void role() {
     System.out.println("I am a father.");
 }
}
public class Polymorphism {
 public static void main(String[] args) {
   
     // Creating a reference of type Person 
     // but initializing it with Father class object
     Person p = new Father();
     
     // Calling the role method. It calls the 
     // overridden version in Father class
     p.role();  
 }
}
/*Method overloading in Java is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding.
allows different methods to have the same name, but different signatures where the signature can differ by 
the number of input parameters or type of input parameters.
//Java program to demonstrate working of method
//overloading in Java

public class Sum {

 public int sum(int x, int y) { return (x + y); }


 public int sum(int x, int y, int z)
 {
     return (x + y + z);
 }


 public double sum(double x, double y)
 {
     return (x + y);
 }
public static void main(String args[])
 {
     Sum s = new Sum();
     System.out.println(s.sum(10, 20));
     System.out.println(s.sum(10, 20, 30));
     System.out.println(s.sum(10.5, 20.5));
 }
}

-----------overriding=run time polymorphism aka late binding
// Example of Overriding in Java
class Animal {
    // Base class
    void move() { System.out.println(
      "Animal is moving."); }
    void eat() { System.out.println(
      "Animal is eating."); }
}

class Dog extends Animal {
    @Override void move()
    { // move method from Base class is overridden in this
      // method
        System.out.println("Dog is running.");
    }
    void bark() { System.out.println("Dog is barking."); }
}

public class Geeks {
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.move(); // Output: Dog is running.
        d.eat(); // Output: Animal is eating.
        d.bark(); // Output: Dog is barking.
    }
}
*/
