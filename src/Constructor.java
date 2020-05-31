/*
CONSTRUCTORS
-------------

constructor is similar to method majorly used to initialize an object
Rules:
constructor must be named same as class name
constructor must have no explicit return type
constructor cannot be (asfs) abstract, static, final, synchronized.
 */



//NOTES on CONSTRUCTOR
/* Every time an object is created using the new() keyword, at least one constructor is called.
/* It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.



TYPES OF CONSTRUCTOR:
* Default constructor (no-arg constructor)
* parameterized constructor
 //Purpose of default constructor is to invoke default value based on the type shown in example 2

 Syntax:
 <class name>(){}



 */


//Example 1 (Default constructor-no arg constructor)
import java.util.*;
/*
public class Constructor {
    //creating constructor
    public Constructor(){
        System.out.println("checking default constructor here");
    }

    public static void main(String[] args) {
        //calling default constructor here
        Constructor c1=new Constructor();
    }
}
*/


//Example 2 (Compiler automatically invoking default constructor-if ut's not given in code)

/*
    public class Constructor {
        byte b;
        String s;
         void Trial(){
            System.out.println("Default value for byte is "+ b +"\nDefault value for String is "+s);
        }

        public static void main(String[] args) {
            //creating objects
            Constructor C=new Constructor();
            Constructor C1=new Constructor();
            //displaying objects
            C.Trial();
            C1.Trial();
        }

    }
*/


//    NOTE:
//BASICALLY what i observed is if we can create constructor and create objects no need to write display object code like [objectname.methodname], instead we can also write
//print statement in constructor to get objects displayed.


//EXAMPLE of parameterized constructor

/*        public class Constructor{
            int a;
            String s;
            Constructor(int id, String name){

                //This block of initialization doesn't work as we are using method for our statement,
                // which is why initialization is given outside constructor.
//                int a=id;
//                String s=name;

                //Out side constructor defined objects can be accessed in constructor
                a=id;
                s=name;

                //with this statement the details can be displayed instead of writing display object code.
//                System.out.println("the id is "+ a +"\n the string is "+ s);
            }
            void display(){
                System.out.println("the id is "+ a +"\nthe string is "+ s);
            }

            public static void main(String[] args) {
                //Creating objects
                Constructor c=new Constructor(23, "Alfred");
                Constructor c1=new Constructor(21, "james");
                //Display values of object
                c.display();
                c1.display();

            }
        }*/






/*
Difference between method and constructor

Method can have any name but constructor must have the class name only.
Always a default constructor is invoked in compiler but it doesn't happen for method.
Constructor must not have return type, but method must have return type(ex: static int(), here int is return type)
Constructor is to intialize state of object, Method is expose behavior of object.



 */


//POINT ON CONSTRUCTOR
// If a class contains parameterized constructor and created a object and haven't passed any parameters while creating object, it throws a compile time error.
//To overcome this we need to add a line of default constructor in the program





//              CONSTRUCTOR OVERLOADING
//Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.
//        They are arranged in a way that each constructor performs a different task.
//        They are differentiated by the compiler by the number of parameters in the list and their types.

//                  Example of CONSTRUCTOR-OVERLOADING

public class Constructor {
    int sage;
    String sname;
    double sid;
    public static void main(String[] args) {

        Constructor c=new Constructor(100, "Rambo", 234);
        Constructor c1=new Constructor(102, "Archie");
        c1.display();
        c.display();

    }


    // Two - argument constructor
    Constructor(int sa, String sn) {
        sage=sa;
        sname=sn;
    }

    // Three - argument constructor
    Constructor(int sa, String sn, double si) {
        sage=sa;
        sname=sn;
        sid=si;
    }

    void display() {
//        System.out.println("The age is "+ sage +"\nThe name is"+ sname +"\nThe id is"+ sid);
//        System.out.println(sage +" "+ sname +" "+ sid);
        System.out.println(sage +" "+ sname);
    }


}



//NEED TO COVER CONCEPTS OF  using constructors with keywords, java copy constructor etc.