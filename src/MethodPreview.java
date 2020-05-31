/*
A method is collection of statements that perform specific task and return result.

Declaration of method will have six components
Modifier, return type (data type), parameter list,


public int max(int x, int y)
Here,
public is modifier
int is return type
max method name
int x, int y in braces are parameters
Method signature: method name + parameters (max(int x, int y)

Method can be called in 3 cases
* when it completes all statements in method
* when it reaches a return statement
* throws an exception


When a parameter is passed to the method, it is called an argument.

 */

/*
public class MethodPreview {
    public static int addition(int a, int b){
//        a=2;
//        b=3;
                int c=a+b;
                return c;
    }

    public static void main(String[] args) {
        int c=addition(2, 3);

        System.out.println(c);
    }
}
*/

//-----------------------------------------------------------------

/*
Example 1:
Calling a method which has a statement

OBJECTIVE:
Here we are Having a main method to run the program [main method: psvm()],
We are creating an another regular method[public static void Initial()] and initializing a statement in it.
In the main method we are calling the regular method which has statement in it and execute.

Errors:
If main method is static and general method is non-static we get error

/*
Non-static method Initial() cannot be referred from a static context.
*/


//public class MethodPreview {
//    public static void main(String[] args) {
//        Initial();
////        we can call a method multiple time here as below
//        Initial();
//    }
//    private static void Initial() {
//        System.out.println("Calling this method!");
//    }
//}

///As mentione dmethod can be called in three ways
//1) when the statement needs to be excuted and for this we can have the return type as void
//2) we call the method with data passed in it(parameters)
//3) calling method to return the data
//Also aliases are single methods called in various types
//EXAMPLE
public class MethodPreview {
    public static void main(String[] args) {
        //calling method again and again for atatement
        Initial();
        Initial();
        //calling method with params
        Passingparams("Guillermo");
        //calling method for return type
        int c=Callingreturnmethod();
        System.out.println(c);
        //calling method with both data and return type
//        int result=Callingreturnanddata(4);





        //alias
        int result=Callingreturnanddata(c);
        System.out.println(result);

        //alias
//        int result=Callingreturnanddata(Callingreturnmethod());
//        System.out.println(Callingreturnanddata(Callingreturnmethod()));
        //alias
//        int result=Callingreturnanddata(Callingreturnmethod());
//        System.out.println(Callingreturnanddata(Callingreturnmethod()));
        //alias
//        System.out.println(Callingreturnanddata(Callingreturnmethod()));
    }




    //method calling to complete statements in method
    static void Initial() {
        System.out.println("Calling this method!");
    }
    //method for return type of given value
    static void Passingparams (String name){
        System.out.println("what's up "+name);
    }
    //method to call when parameters given in method
    static int Callingreturnmethod (){
        return 4;
    }

    //method can return value and also can take the data
    static int Callingreturnanddata(int vlue){
        return vlue * vlue;
    }
}
