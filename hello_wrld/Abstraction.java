package hello_wrld;
//Abstraction in Java is the process of hiding the implementation details and only showing the essential functionality or features to the user.
//focusing on what an object does rather than how it does it
abstract class Geeks {
 abstract void turnOn();
 abstract void turnOff();
}

//Concrete class implementing the abstract methods
class TVRemote extends Geeks {
 @Override
 void turnOn() {
     System.out.println("TV is turned ON.");
 }

 @Override
 void turnOff() {
     System.out.println("TV is turned OFF.");
 }
}

//Main class to demonstrate abstraction
public class Abstraction {
 public static void main(String[] args) {
     Geeks remote = new TVRemote();
     remote.turnOn();   
     remote.turnOff();  
 }
}//
/*1)creating a child class object using a parent class reference in Java. This concept is called as upcasting.
     
/when you do this, 
/2)you can ONLY access methods and variables that are declared in the parent class, even though the object is actually of the child class.
3)You cannot directly access fields or methods that are specific to the child class (i.e., those that are not present in the parent class)
using the parent class reference(need to use downcasting for it)
[[Downcasting should be done carefully. If you downcast a reference that doesn't actually point to an instance of the child class, you will get a ClassCastException.
To safely perform downcasting, it's a good practice to use the instanceof operator to check the type of the object before casting.]]
Downcasting allows you to cast the parent class reference back to the child class reference,
which then gives you access to the child class-specific methods and fields.
     
4)However, if the method is overridden in the child class which is happeneing here,
 Java will call the overridden method from the child class due to run-time polymorphism.    
    
5)note: abstract class ke direct objects nahi bana skte par indirectly subclass se bana skte object;
// Parent class
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
    
    // Dog-specific method
    public void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}

public class Main {
    public static void main(String[] args) {
        // Upcasting: Animal reference points to a Dog object
        Animal myAnimal = new Dog();  // Parent class reference, child class object
        
        // Calling the overridden method in Dog class
        myAnimal.sound();  // Outputs: Dog barks
        
        // Downcasting: Cast the Animal reference back to Dog reference
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal;  // Safe downcast
            myDog.fetch();  // Outputs: Dog is fetching the ball
        } else {
            System.out.println("The object is not a Dog.");
        }
    }
}

*/