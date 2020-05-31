/*
FACTORIAL
In general way we use logic fact*i which revolves arround loop 1*1, 1*2, 2*3, 6*4, 24*5 ......

RECURSION:
----------
here we are using logic

n*(n-1)
but it will execute only once as it is conditioned like that
if th method i scalled itself(recursiion) here then it would repeat until 1;


 */


import java.util.*;
public class Factorial {
    /*public static void main(String[] args) {
        int fact=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to find it's factorial");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
//            System.out.println(fact);
        }
        System.out.println(fact);
    }
}*/


//
    //Recursion without user intervention
    /*public static void main(String[] args) {
        System.out.println(Fact(5));
    }
         static int Fact(int n) {
            if(n==1){
                return 1;
            }
            else
            {
                System.out.println(n);
                return n*(Fact(n-1));

            }



    }
    }*/

    //RECURSION     with user inetervention

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
//        int n=in.nextInt();
        int un=in.nextInt();
        //we are storing the output in result and then printing, or also instead of 'n' which is in bothe methods,
        // we can even change variable like un (usernumber)
//        int result=facto(n);
        int result=facto(un);
        //we are printing the values directly here
//        System.out.println((facto(n)));
        System.out.println(result);
    }
    static int facto(int n) {
        if (n == 1) {
            return 1;
            //if we return '0' here then finally it will show 0, bcoz here we are mentioning fact(1) as '0'
        } else {
            return n * facto(n - 1);
        }
    }
}