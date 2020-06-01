/*
NOTES ON STATIC KW
------------------
-> Static Kw can be used for variable (datamembers), method, innerclass.
-> Static Kw cannot be used for local variable
-> Static Kw cannot be used in top level class.
-> Static Kw can be used for inner class.

Top level class: The meaning of top level class is Outer class

Eg: Static Kw cannot be used
class A{}
class B{}
class C{}

Eg: Static Kw can be used
class A{
    static class G{}
}
class B{}
class C{}

-> Static members directly accessed with class name without creating objects unlike instance variable, Objects can also access static members
(Refer topic "Instance vs Static" in Variables.java)

-> Static variable acts as global variable within the class, which means all objects of the class can share static variable memory.

-> Static method can only access other static members directly.


*/



//-> Static method can only access other static members directly.
//                        OR
//      Inside static method you cannot use non-static variables.

//      Eg1:


/*public class StaticKeyword {
    int m;
    static int n;
    void xxx(){
        m=30;
        n=20;
    }
    static void yyy(){
//        m=10;  //Error: Non-static field cannot be referenced from a static context error.
        n=12;
    }
}*/

//-> Static variable acts as global variable within the class, which means all objects of the class can share static variable memory.
//                                    OR
// Once static variable allocated memory, then all objects shared the memory of static variable.

//Eg1:

/*
class Statick{
    int m;  //instance variable
    static int n; //static variable
    void xxx() {
        m=10;
        n=30;
    }
    static void yyy(){   //static method
//        m=20; //Error: static methods can access only variables which are static.
        n=15;
    }
    void result(){
        System.out.println("m = "+ m +" n ="+ n);
    }

        }
public class StaticKeyword {
    public static void main(String[] args) {
        //object creation
        //Instance variable gets memory allocation when object is created.
//        Statick s1=new Statick();
//        s1.xxx();
//        s1.result(); //m=10, n=30

        //2nd object creation
        //The value of static variable here doesn't change as static variables allocates memory only once,
//        If object tries to change value of static variable it retains it's value.
        //new object creation
//        Statick s2=new Statick();
//        s2.result(); //m=0, n=30



        //static variables can directly accessed & modified with class name
        // ,(no need of creating objects directly we can modify value like eg: classname.staticvariable=newvalue)
//        while instance variable can be accessed by creating objects only eg: create object and (objectname.variablename=newvalue)

//        Statick.n=11;
//        s1.result();
//        s1.m=12;
//        s1.result();




        //TEST
        Statick s1=new Statick();
        s1.xxx();
        s1.result();//10, 30
        s1.yyy();
        s1.result();// 10, 15

        Statick s2=new Statick();
        s2.result();//0, 15



    }
}
*/




//************Important
/*
Instance variable gets memory allocation at the time of object creation, each object will have copy of instance variable (which means initial or default value)
But,
For static variable, it is different, it will get memory only once and
if any object tries to change the value of the static variable, it will retain its value.


Static variable memory allocation is just once, while for instance variable memory allocates each time when object is created.
 */



//COUNTER program without static variable

/*class Statickeys{
    int count;
    void xxx(){
        count++;
    }
    void display(){
        System.out.println(count);
    }
}

public class StaticKeyword{
    public static void main(String[] args) {
        Statickeys s1=new Statickeys();
        s1.xxx();
        s1.display();
        Statickeys s2=new Statickeys();
        s2.display();
    }
}*/


//Counter program with static variable

class Staticsample{
     static int n; //
    void xxx(){   // If this method is static and the variable is non-static in it it throws error,
//            Static methods can only access other static variables or static members directly
        n++;
    }
     void yyy(){
        System.out.println(n);
    }

        }

        public class StaticKeyword{
public static void main(String[]args){
    //Objectcreation
    Staticsample s1=new Staticsample();
    //calling a xxx()
    s1.xxx();
    //Displaying object
    s1.yyy(); //1
    Staticsample s2=new Staticsample();
    s1.xxx(); // 2
    s2.xxx(); // 3
    s2.yyy(); // 3

        }
        }


        //ToDo
        // STATIC METHODS-> learn more about this at javatpoint



