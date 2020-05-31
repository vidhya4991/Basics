/*
NOTES ON STATIC
---------------

Static keyword mainly used for memory management, can be used in blocks, methods, variables and nested class.

 Java Static variable
 Generally a variable is made static if we want to refer common property to all objects (like which is not unique)
 The static variable will get the memory only once, at the time of class loading.
 (unlike instance variable gets memory at time of object creation, and each object will have it's copy of instance variable).



//STATIC block: static block is something where we can use this to initialize static data member.
        executed before main method amd at time of class loading.


 For example given below each college has like some students but all of them are from same college(not unique)
 then we can use static variable here for memory efficiency.



Here below clg is common property for all objects if we make it static then it will get memory only once, at the time of class loading

 */


/*public class Static {
    int a;
    String n;
    static String clg = "SRM";

    //Constructor
    Static(int id, String name) {
        a = id;
        n = name;
    }

    void display() {
        System.out.println("The id is " + a + "\nThe name is " + n + "\nThe college is " + clg);
    }

    public static void main(String[] args) {
        //Creating object
        Static s=new Static(2, "John");
        Static s1=new Static(1, "Travolta");

        //we can also change here value of clg for all obj's with just:
//        Static.clg="Lord";

        //Displaying object
        s.display();
        s1.display();

    }
}*/



//TO check this how static and instance variables will get memory we can check in this Counter program below:

/*
        public class Static{

//            instance variable

            int count=0; //will get memory each time when instance is created and each object will have own copy of instance variable below
            //As count always becomes back to '0' when each object is created. we can see that in constructor block

            //Constructor
            Static(){
//                System.out.println("The initial is "+count);
                count++;
                System.out.println("The count is "+ count);
            }

            public static void main(String[] args) {
                //Creating objects
                Static s=new Static();// after becoming 1 here it goes back to instance variable =0 before creating an another object.
                Static s1=new Static();
                Static s3=new Static();
                Static s4=new Static();

                //For Displaying objects
                //we can display if we have a method and then we can call the methods to disply object, for now as t is statement we are using constructor

            }

        }
*/


        //The same counter was made as static

/*        public class Static{
            //Made variable as static
            static int count=0;//will get memory only once and changes if any object changes,
            // the value it retails it's value (uses that value as latest).

            Static(){
                System.out.println("The initial count is "+count);
                count++;
                System.out.println("The final count is "+count);
            }

            public static void main(String[] args) {
                Static s=new Static();
                Static s1=new Static();
                Static s2=new Static();
                Static s3=new Static();
                Static s4=new Static();
            }


        }*/


        //Just checking above programs also with displaying objects, i.e with method

//1. with instance variable
        /*public class Static{
            //instance variable
            int count=0;// will get memory each time instance is created, each object will have own copy of instance variable
            Static(int a){
                a=count;
                //To check memory allocated every time instance is created
                System.out.println(a);
                count++;
    }
     void display(){
         System.out.println("The final count is "+count);
     }

    public static void main(String[] args) {
        //Creating objects
        Static s=new Static(2);
        Static s1=new Static(3);
        Static s2=new Static(4);

        //Displaying objects
        s.display();
        s1.display();
        s2.display();
    }
}*/


        //with static KW

public class Static{
    //Made variable as static
      int count=0;//will get memory only once,
    // if the value is changed by object then it reatins it's value (use that latest value as count)

    Static(int a){
        count=a;
        System.out.println("The initial count is "+a);
        count++;
        System.out.println("The second count is "+a);
    }
     void dispaly(){
        System.out.println("the final count "+ count);

    }

    public static void main(String[] args) {
        //creating objects
        Static s=new Static(2);
        Static s1=new Static(3);
        Static s2=new Static(3);
        Static s3=new Static(4);
        Static s4=new Static(5);
        //displaying objects
        s.dispaly();
        s1.dispaly();
        s2.dispaly();
        s3.dispaly();
        s4.dispaly();
    }


}





/*
STATIC METHOD
--------------

A static method belongs to the class rather than the object of a class.
A static method can be invoked without the need for creating an instance of a class.
A static method can access static data member and can change the value of it.


 RESTRICTIONS ON STATIC METHOD
 ------------------------------

 Static method cannot use non-static data member or call non-static method directly
 "this" and "use" cannot be used in static context.

 */

// checking how static method accessing a static data member and changing it's value


        /*public class Static{

            //instance variables
             int a=0;
            String s;

            //static variable
            static String clg="IIT";


            //A static method can change value of a static data member
            static void change(){
                clg="IIM mains";
            }

            //constructor (parameterized construtor)
            Static(int id, String name){
                a=id;
                s=name;
//                System.out.println("The roll no "+ a +"\nThe name is "+ s +"\nThe clg is "+ clg);
            }

            void display(){
                System.out.println("The roll no "+ a +"\nThe name is "+ s +"\nThe clg is "+ clg);
            }

            public static void main(String[] args) {

                //calling chjange method (where we are accessing static member and changing it's value through static method
                Static.change();

                //Creating objects
                Static s3 = new Static(1, "Joe");
                Static s1 = new Static(2, "Beck");

                //Displaying objects
                s3.display();
                s1.display();

            }



        }*/