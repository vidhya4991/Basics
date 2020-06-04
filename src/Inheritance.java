/*
NOTES on INHERITANCE
General def:  when a object acquires all the properties and behaviors of parent object, it's called inheritance.
Technical:     Creating a new class from existing class is called inheritance

"Extends" is a KW to create new class from existing class.

eg:
  class Road{  // called as  "Base class/super class"
  ...
  ...
  }
  class Vehicle extends Road{   // Derived class / sub class / child class
  {
  ...
  ...
  This class "Vehicle" is an extension of class road, we can access code of class "Road" from class "vehicle"
  ....
  ...
  }


  Advantage of inheritance
  Reusability of code as we can use the already existing code in super class/Base class

  5-types of Inheritance
  ----------------------
  1) single inheritance: One class(sub class)B to another class (base class/super class)A.
  2) Multilevel Inheritance:  One class C to another class B  to another class A.
  3) Hierarchal inheritance:  Both classes to on sincle class like B & C to A, but, b and c are still seperate.
  4) Multiple inheritance:  One class extends to both sub classes like C to A & B, but A & B are still different classes with each other.
  5) Hybrid Inheritance: It is combination of all inheritances.

  ***  JAVA DOESN'T SUPPORT MULTIPLE INHERITANCE & HYBRID INHERITANCE DUE TO AMBIGUITY   ******* ALSO DOESN'T SUPPORT POINTERS
  ***  IN JAVA A CLASS CAN EXTEND TO ONLY ONE CLASS

  ** Inheritance always must be IS-A relationship, which means it must be meaningful extension like

  IS-A RELATIONSIP
  ----------------
  eg:
  Vehicle (car, bike)   Car extends Vehicle (car is a vehicle)
  color (red, blue)     red extends color    (red is a vehicle)

  class color{
  }
  class red extends color{  (must be read Is a Relation ship)
  }

  HAS-A RELATIONSHIP
  ------------------
  class employee{
  a;   //Datamember
  }
  class Department{
  employee (a);  //accessing datamember of another class this relationship is HAS-A relationship (dept has a employee)
  }


  Simple way if class extends then it is using "IS-A Relationship".




 */

//Practically Inheritance we see below   (Simple Inheritance, Polymorphism in Inheritance, Constructors in Inheritance)


/*
SiMpLe InHeRiTaNcE program
 */
class Base{
    int a;
    int b;
    void abc(int a, int b){
        this.a=a;     // As we have same data memebers and arguments we are using "this" KW.
        this.b=b;     // As we have same data memebers and arguments we are using "this" KW.
    }
    void display(){
        System.out.println("a = "+ a +" b = "+ b);
    }
}
class Derived extends Base{  // IS-A RELATIONSHIP in Iheritance is being used here
    int c;
    void xxx(int c){
        this.c=c;  //As we have same data members and arguments we are using "this" KW.
    }
    void displayI(){
        System.out.println("C = "+c);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        //creating an object
        Base b1=new Base();   //a=0, b=0 //whenever a object is created, a new memory is allocated for the data member
        //calling method
        b1.abc(12, 13); //a=12, b=13
        //displaying object
        b1.display();  //Output prints" a=12, b=13"

        // As derive class/ sub class can access data members in base/su[per class Here we are doing that
        // It access only data memebers not their assigned values while adding in th calling method.


        Derived d=new Derived();
        d.abc(1, 3); //a=1, b=3// From Derived/Sub class you can also access methods in Base/super class
        d.display();  //a=1, b=3

        //Creating an object
        Derived d1=new Derived();//a=0, b=0, c=0 //As Derived class extends to base class,
        // it can access data members of both derived and base class but not the object data of base class.
        d1.xxx(31);
        d1.display();//a=0, b=0
        d1.displayI();//a=0, b=0, c=31




    }
}
