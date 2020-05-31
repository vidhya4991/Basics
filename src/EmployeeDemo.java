/*
Here we are demonstarting how we assigning value i  method and calling the method.
Here datamemebers are in class Employee with empnumber, wmpname, empsalary

It's not a good practice to write details of all unique employers (which can be called as hardcoded data)
Instead, we can give values directly when creating and displaying objects.
At the same time we must need to pass parameers of them in method we are using (here it is setempdetails())


 */



public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setempdetails(110, "Rahul", 4000);
//        e.setempdetails();
        e.displayempdetails();

    }
}
class Employee{
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

//"this" key word used when datamembers and parameters in method are of same name we will use "this" kw.
//this KW is used to differentiate datamenbers and arguments/params of method are same.
//this refers to current object.
//Q:whenever we create object of class, what values will be of datamemebrs of class (Ans: default) and


//MAJOR DIFF B/N CONSTRUCTOR AND METHOD BY EXAMPLE

//Until we call the method the values are not assigned to datamembers
//But, with constructor just by creating object itself we can give values to datamenbers, instead of getting null values or calling the method.

//Then why can't we use constructor over method

//Constructor majorly used for initializations only, not any calculations like method, as it also does not have any return type (not even void).