import javax.print.attribute.standard.NumberUpSupported;
import javax.security.auth.login.LoginContext;
import java.util.*;

/*






ARRAY:
-------

An array is collection of elements of similar datatypes which can be stored in continuos memory allocations.

Representation of array (syntax)
--------------------------------
datatype[] arrayname;
or
datatype arrayname[];

eg:
int[] n;
or
int n[];

but if,
int n[5] //this will be error. Array size cannot be mentioned here
//Memory allocation for reference datatypes is during runtime using "new" operator (Similar to object creation), Here array is reference data type.

Array size allowcated as
//int[] n=new int[5];
//datatype[] arrayname=new datatype[size]

Array elements are accessed by indexes which starts from "0"
n(0) means 1
n(1) means 2

Here
int n[5]= n[0], n[1], n[2], n[3], n[4]

Instaed of givining array = new etc. we can also initialize value directly to array (which is called array initialization)
int n[]={1, 2, 32, 56, 11};

//To know the size of array we use length member for array.
Length menber can be as sout("array length = "+ n.length); //which give output as : array length = 5
Array length starts from 1 but indexes are from "0".



 */


//Sample of declaration, initializing and traversing
public class Arraystarters {
    /*public static void main(String[] args) {
        int n[]=new int[5];  //declaration
        //Initialization
        n[0]=1;
        n[1]=2;
        n[2]=3;
        n[3]=4;
        n[4]=5;
        //traverse of array
        for(int i=0;i<n.length;i++) //here "i" is like index, values are 1, 2, 3, 4, 5 and address for them are 100, 104 (4bytes) for reach int value
            //Here why are we not writing i<=n.length bcoz,
            // "i" index here max is 4 and n.length max is 5 then obviously iwill never be equal to n.length which is why no need of i<=n.length
        System.out.println(n[i]);*/
//        System.out.println(n[0]);
//        System.out.println(n[1]);
//        System.out.println(n[2]);
//        System.out.println(n[3]);
//        System.out.println(n[4]);
//    }
//}
//Declaring, initializing and traversing all together in sample program

/*    public static void main(String[] args) {
//        int []n=new int[4];
        int[] n={12,7,87,14};
        for(int i=0;i<n.length;i++) //Here i are indexes and 12, 7, 87, 14 are values
            System.out.println(n[i]);

    }
    }*/

    /*public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("The size of array is");
        int size=in.nextInt();
        int[] n=new int[size];
        System.out.println("Enter values in array");
        *//*for(int i=0;i<n.length;i++){
            n[i]=in.nextInt();
        }
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }*//*

//        or/or/or/or/or

        for(int i=0;i<n.length;i++)
            n[i]=in.nextInt();
        System.out.println("Values in array are");
        for(int i=0;i<n.length;i++)
            System.out.println(n[i]);



    }
}
*/


    //Enhanced for loop
//    we can also print array using enhanced for loop (future we can use for collections, but only for arrays and collections)
//    syntax:
//        for(data_type variable:arrayname){
//            body of loop
//                }

//    NOTE: FOR storing values in an array we need to go for tradtional for loop only again, once array is created only then we use
//            enhanced for loop (Literally for traversing/printing array elements)
//      Here is an example


   /* public static void main(String[] args) {
        //for not decalaring values we use
//        int[] n=new int[5];

        //for declaring an array withg values on to indexes
        int n[]={12, 32,15,16};
        System.out.println("The values in array are");

        //enchanced for loop instead of tradational for loop we are using here

//        for(int x:n){
//            System.out.println(x);
//        }

        //or/or/or/or/or

        for (int x:n)
            System.out.println(x);


    }
    }*/



//    NOTE: FOR loop without { } will access only one statement in it
//            for ex: for
//            i=i+n; //only this statement is run
//            n=n-1;
//
//            which is why better use for{} when making multiple statements
//    LOGIC FOR SUM OF Numbers
//      sum=0;
//      sum=sum+n;

    //SUM of Numbers in an array
    /*public static void main(String[] args) {

        int[] n=new int[4];
        Scanner in=new Scanner(System.in);
        System.out.println("Numbers");
//        n[3]=in.nextInt();
        int sum=0;
        for(int i=0;i<n.length;i++){
            n[3]=in.nextInt();
            sum=sum+n[3];
        }
        System.out.println(sum);



    }
    }
*/

   /* public static void main(String[] args) {
        int[] n={1, 2, 3, 4};
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum=sum+n[i];
        }
        System.out.println(sum);
    }
}
*/

   //Note:
    //SUM OF numbers in an array given by user

    /*public static void main(String[] args) {
        int sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=in.nextInt();
        //declaring size of array here
        int[] n=new int[size];
        System.out.println("enter values");
        for(int i=0;i<n.length;i++){
            n[i]=in.nextInt();
            sum=sum+n[i];
        }

        System.out.println("The total is "+ sum);


    }
    }*/

    //SUM OF ARRAYS WITH ENHANCED FOR LOOP

    /*public static void main(String[] args) {
        int sum=0;
        int[] n={1,2,3,4};
        for (int x:n) {
            sum=sum+x;
        }
        System.out.println(sum);

    }
    }*/





    //SEARCHING A NUMBER IN A GIVEN ARRAY

//    LOGIC
    //Givingthe value we need to check with all values and see if it matches then we can mentio it is found
    // Can use boolean values and if boolean = true then we found our number

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=in.nextInt();
        int[] n=new int[size];
        System.out.println("Enter "+ size +" values of array");
        for (int i=0;i<n.length;i++) {
            n[i] = in.nextInt();
        }
        System.out.println("Enter the number you want to search");
            int key = in.nextInt();
        boolean flag=false;
            for (int i = 0; i < n.length; i++) {
                if (key == n[i]) {
                    flag = true;
                }
            }
        if(flag)
        {
            System.out.println(flag);
            System.out.println("found");
        }
        else
        {
            System.out.println(flag);
            System.out.println("Not found");
        }



    }
    }


//    DISADVANTAGE OF ARRAYS:
//    size limit---
//   The only disdvantage of array is we can have fixed sized of elements in ana array, The size doesn;t grow at Runtime,
//   To solve tihs we have collections in Java
