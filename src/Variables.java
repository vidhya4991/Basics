/*
NOTES for Variables
Refer: https://www.geeksforgeeks.org/variables-in-java/
* Local variable
Local variable is the variable which is defined inside method or block, it can be used with in method or block.
Local variables cannot have default variables.
Local variable cannot be defined with Static Keyword
Initialization of local variable is mandatory
 */


/*Instance Variable
Instance variable is inside class and outside method
They can have default values
Instance variables are created when objects are created and destroyed when objects are destroyed

 */
/*
STATIC VARIABLE
If we access the static variable like Instance variable (through an object), the compiler will show the warning message and it won’t halt the program. The compiler will replace the object name to class name automatically.
 */
 /*
If we access the static variable without the class name, Compiler will automatically append the class name.
In case we have multiple objects as in the above program, each object will have its own copies of instance variables. It is clear from the above output that each object will have its own copy of instance variable.

Q: How do we access instance variable?
Ans: By creating an object
Syntax for creating an object
class_name objectname=new class_name();

To initialize value for that instance variable in that object
objectname.instance_variable_name=value_you_want_to_give;

*StatiVariables

Static KW
Only one static variable is needed even though how many objects we create
If we access static variable like instance variable (like creating an object), there is no need to create object,
we can simple access static variable by syntax
class_name.static_variable_name;  (value can also be given here)

/*
WAP to demonstrate your understanding on both instance and static variables,
For example group of employers and their wages (crete and display)
 */



//Demo for instance variable with objects
//public class Variables {
    /*int marksinSocial;
    int marksinSocial;
    int marksinSocial;
//    public static void main(String[] args) */
//    {

//    }
//
//}

/*

EXAMPLE FOR LOCAL VARIABLE
-> Here Time is local variable as it is defined with in a block or method
-> we can access local variable only with in the block.
-> Local variable must be initialized & mandatory, if not it shows error at line 76 shows error variable might not been initialized
-> we cannot access line 73 as variable time is local variable and we are accessing it out of it.
-> local variables can be accessed through statements like sop in below.


 */

        /*public class Variables{
            public void Localvariable(){
                int time=1;
                time=time+5;

            }
            public static void main(String[] args) {
                System.out.println(time);
            }

        }*/

//import com.sun.jdi.LocalVariable;

/*
EXAMPLE FOR INSTANCE VARIABLE
-> Initialization of Instance variable is not mandatory, but default value is "0".
-> Instance variable is declred in side class and outside unlike it doesn't use STATIC keyword
-> we can use access specifiers for instance variables but not for local, if we do not use any access specifier "Default" access specidier is used.
-> Instance variables can be accessed only by creating objects.
-> Each object must need to have it's own copy of instance variable as below Marks 1 object and Marks 2 object have their own instance variable copies.


 */
//    public class Variables{
//    int Markssub1;
//    int Markssub2;
//    int Markssub3;
////class MarksDemo {
//    public static void main(String[] args) {
//        Variables Marks1 = new Variables();
//        Marks1.Markssub1 = 40;
//        Marks1.Markssub2 = 30;
//        Marks1.Markssub3 = 20;
//
//        Variables Marks2 = new Variables();
//        Marks2.Markssub1 = 35;
//        Marks2.Markssub2 = 16;
//        Marks2.Markssub3 = 54;
//
//        System.out.println("Initial marks");
//        System.out.println(Marks1.Markssub1);
//        System.out.println(Marks1.Markssub2);
//        System.out.println(Marks1.Markssub3);
//
//        System.out.println("Supplemental marks");
//        System.out.println(Marks2.Markssub1);
//        System.out.println(Marks2.Markssub2);
//        System.out.println(Marks2.Markssub3);
//
//    }
////}
//}


/*
STATIC VARIABLE
--> These variables are similar to Instance variables Except we use "static" keyword for these variables, within class outside method/block/constructor
--> No need of initialization for static variables is needed default value is 0.
--> we can have only one static variables irrespective of how many objects we create.
--> To access static variables, we need not create an object of that class, we can simply access the variable as
      "   class_name.variable_name;  "
--> As static variable is common in all objects the changes reflect on all objects.



 */


public class Variables{
    static int Markssub1;
    static int Markssub2;
    public static void main(String[] args) {
        Variables.Markssub1=89;
        System.out.println(Markssub1+Markssub2);
    }
}


/*
INSTANCE vs STATIC

--> Each object have it's own instance variable, while objects accessing static variables have only one copy.
--> changes made in instance variable using one object will not reflect on other objects as each obj's has it's own instance variables
--> while for static it will reflect on other obj's as staatic variables are common to all obj's
--> Accesing instance variables by creating objects etc, for static variables directly can be accessed using class name.
 */
