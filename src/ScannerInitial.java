/*
WAP to accept rollno, name and marks in 3 subjects. Find total and average. Display rollno, name, total and average.
*/

//Need to have this package while having scanner class or else throws Error? "Cannot resolve symbol at line 11"


/*
NOTES:

        Methods of Scanner class
          ------------------------
        - nextInt() => used to read an int value
        - nextFloat() => used to read a float value
        - nextDouble() => used to read a double value
        - next() => used to read a String value without spaces
        - nextLine() => used to read a String value with spaces



        IMP NOTES:
        ----------
        Foe instance we have a program where we use
        nextInt()
        nextLine()
        nextInt()
        in following fashion like Int, string, Int etc as inputs from key board.
        At string place it will not take complete name with spaces even though we use nextLine(), bcoz



        Why does this issue occur?
This issue occurs because, when nextInt() method of Scanner class is used to read the age of the person, it returns the value 1 to the variable age, as expected.
But the cursor, after reading 1, remains just after it.

In this case, it will start reading just after 1. So the next line after 1 is just a new line, which is represented by ‘\n’ character. Hence the Father’s name is just ‘\n’.

abc
m
1_ // Cursor is here (Age here)
xyz (Father name)
pqr (Mother name)

So when the Father’s name is read using nextLine() method of Scanner class,
this method starts reading from the cursor’s current position.
In this case, it will start reading just after 1.
So the next line after 1 is just a new line, which is represented by ‘\n’ character.
Hence the Father’s name is just ‘\n’.

*/


import java.util.Scanner;


public class ScannerInitial {
//    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in); //Initializing scanner
//        System.out.println("Enter first roll number");
//        int a=in.nextInt();
//        in.nextLine();
//        System.out.println("Enter the name of "+a+" roll number");
//        String b=in.nextLine();
////        in.next();
//        System.out.println("Enter how many subjects you have");
//
//        int a1=in.nextInt();
//        System.out.println("Enter the gender");
//        char c1=in.next().charAt(0);
//
////        in.nextLine();
//        System.out.println("Enter the marks in 3 subjects");
//        double c=in.nextDouble();
//        double d=in.nextDouble();
//        double e=in.nextDouble();
//        double total=c+d+e;
//        double average= (total/a1);
//        System.out.println("These following results are of " +
//                "\nRoll number = "+a+" \nName = "+b+" \nGender = "+c1+" \nSubject 1 marks = "+c+" \nsubject 2 marks = "+d+" \nsubject 3 marks = "+e+" \nThe total = "+total+" \nThe Average = "+average);

        /*
Here written display output in single line to reduce lines of code.
 */



//    }
//}


/*

WAP to accept itemno,itemname,rate and quantity. Find price (rate*qty).
Display itemno,itemname and price

 */

/*
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the item number");
        int I1=in.nextInt();
        System.out.println("Enter a item name");
        String I2=in.nextLine();
//        in.nextLine();
//        String I2=in.next();
//        in.next();
//        in.next();
        in.nextLine();
        System.out.println("Enter rate for the item");
        int I3=in.nextInt();
        System.out.println("Enter the quantity");
        int I4=in.nextInt();
        long price=I3*I4;
        System.out.println("These are results of following item purchased "+" \nItem number = " +I1+ "\nItem name = "+I2+"\nprice = "+price);



    }

    }*/


    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        while(in.hasNext()){
           String a=in.nextLine();
            System.out.println(a);
        }


    }
    }


