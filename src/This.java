/*
// this: Can be used to refer current class in instance variable
//this: Can be used to invoke in current class method
// this: can be used to recall the constructor
//this: to pass as an argument in the method
//this: to pass as argument in the constructor call
//this keyword can be used to return current class instance
 */




                                          //// this: Can be used to refer current class in instance variable//
/*public class This {
    public static void main(String[] args) {
        Employees e=new Employees();
        e.setempdetails(110, "Rahul", 4000);
//        e.setempdetails();
        e.displayempdetails();

    }
}*/
/*
Here if you see the arguments in class employees and instance variables inside class are same (empnumber, empname, empsalary) which is why
to differentiate them we are using this keyword.
In other words we can say if there is ambiguity between instance variables and parameters.

this keyword is not required below if we write as
empnumber=e;
empname=ename; etc and pass parameters e , ename in that constructor paranthesis.
 */

/*
class Employees{
    int empnumber;
    String empname;
    double empsalary;
    //    public void setempdetails(int eno, String ename, double esal){
    public void setempdetails(int empnumber, String empname, double empsalary){
//        empnumber=100;
//        empname="Raghu";
//        empsalary=5000;

        this.empnumber=empnumber;
        this.empname=empname;
        this.empsalary=empsalary;
//        empnumber=10;
//        empname="dean";
//        empsalary=1000;
    }
    public void displayempdetails() {
        System.out.println("Name is "+ empname);
        System.out.println("Number is "+ empnumber);
        System.out.println("Salary is "+ empsalary);
    }
}
*/



                                                        ////this: Can be used to invoke in current class method  (Optional we may use)//

/*
public class This {
    public static void main(String[] args) {
        Invoke i=new Invoke();
        i.get();

    }
}

class Invoke{
     void set() {
         System.out.println("Initial line");
    }
    void get() {
        System.out.println("Secondary line");
//        set();
        //Instead of just using set() here "this" keyword can be invoked in current class method.
        this.set();
    }
}
*/





                                                        //this: Can be used to recall the constructor (Maintains chain between constructors)//


/*public class This{
    public static void main(String[] args) {
        construct c=new construct(100, "ryan", 240, "21");
        c.get();

    }
}

    class construct {
        int sno;
        String sname;
        String sage;
        double sid;


        construct(int sno, String sname, double sid) {
            this.sno=sno;
            this.sname=sname;
            this.sid=sid;
        }
        construct(int sno, String sname, double sid, String sage) {
            this(sno,sname,sid); // Here we are reusing the constructor and chaining them
            this.sage=sage;
//            this(sno,sname,sid); // will show errorv metioning this line [Call to this() must be the first statement in constructor].
        }

        void get(){
            System.out.println("The number is "+ sno +"\nThe name is "+ sname +"\nThe id of student is "+ sid +"\nthe age is "+ sage);
        }
    }
    */



                                                //this: to pass as an argument in the method//


//this KW can aso be used to pass as argument in method, mainly used for event handling.

/*public class This{
    public static void main(String[] args) {
        argument a1=new argument();
        a1.b();

    }
}
    class argument {

    void a(argument obj) {
        System.out.println("This method passes");
    }
    void b() {
        a(this);
    }
        }*/



                                        //this: to pass as argument in the constructor call


//  GO THROUGH THIS- NOT QUITE UNDERSTOOD
// STILL IN PROGRESS

/*
public class This{
    int data=10;
    argument a
    public static void main(String[] args) {

    }
}
class argument{
argument obj;  //must invoke the argiment as instance variable for the constructor here unl;ike method in above example
    argument(argument obj){
        this.obj=obj;
    }

    void get(){
        System.out.println(obj.data);
    }

}
*/





                                    //this keyword can be used to return current class instance



//        IN PROGRESS-- NEED TO WORK

