package Day12;

//  1.Class --> Logical Entity & No Physical Presence
class Animal {
    int legs;

    // Method
    void eat() {
        System.out.println("Eating......");
    }

}

// 3.Encapsulation
class Employee {
    private int empId; // private --> Access Modifer & it will access outside the class

    int getempId() {
        return empId;
    }

    void setempId(int id) {
        empId = id;
    }

}

// 4.Abstraction
abstract class Abstraction {
    // in this we can Only declare but can't implement in the class
    public abstract void method();

    void call() {
        System.out.println("Abstraction");
    }
}

interface interfaceAbstraction {
    // It Supports Multiple inheritance
    void method();

}

// 5.Inheritance
// Single & multi layer
class parent {
    // property
    int a = 10;
}

class child extends parent {

}

class grand extends child {

}

// Multiple Class
interface Swiming {
    void swim();
}

interface Flying {
    void fly();
}

class Bird implements Swiming, Flying {
    public void swim() {
        System.out.println("Bird is Swimming");
    }

    public void fly() {
        System.out.println("Bird is Flying");
    }
}


// 5.Polymorphism
// Run Time--> During the Run Time It decision
class A{
    void Show(){
        System.out.println("A");
    }
}
class B extends A{
    void  Show(){
        System.out.println("B");
    }
}
public class OOPS {
    /*
     * Oops pillars
     * 1.Class
     * 2.Objects
     * 3.Encapsulation --> Wrapping of a data in a Single unit ,it is like capsule
     * contaims variables,methods
     * 4.Abstraction --> Wrapping of a data in a Single unit but hiding the
     * background implementing details
     * 5.Inheritance--> one class (child/subclass) can acquire properties and
     * behaviors (fields and methods) of another class (parent/superclass).
     * (parent)super Class/Base Class-->(child)sub-Class/deriven class ==> One
     * layerF
     * 6.Polymorphism -->Poly=>many & morphism=>forms
     * 1.compile Time --> method overloadding
     * 2.run Time --> method over riding
     */

    public static void main(String[] args) {
        /*
         * 2.Objects --> Real World Entity
         * object Creation
         * className objectName = new Constractor
         */
        Animal cat = new Animal();
        cat.legs = 4;
        cat.eat();
        System.out.println(cat.legs);

        // Inheritance
        grand pintoGrand = new grand();
        System.out.println(pintoGrand.a);

        // 5.Polymorphism
        // compile Time-->Same method but diff Signature(logic)
        
        static int add(int a, int b) {
            return a + b;
        }
        
        static int add(float a, float b) {
            return (int) (a + b);
        }
    
}
