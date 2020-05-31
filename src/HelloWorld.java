/*
import java.util.Scanner;
                            //Tryout program

public class HelloWorld {
*/
/*    public static void main(String[] args) {
        System.out.println("This is the welcome program. 'HELLO WORLD 1'");
    }
}*//*


                            //WAP to find given number is odd/even

*/
/*
                    public static void main(String[] args) {
                        Scanner in=new Scanner(System.in);
                        System.out.println("Hey Dude! give the number you want to check");
                        int n=in.nextInt();
                        if(n%2==0)
                        {
                            System.out.println(n +" is a even number");
                        }
                        else
                        {
                            System.out.println("Sorry Buddy!! "+ n + " is odd number");
                        }
        }
}*//*

                            //WAP to find even numbers up to 100
*/
/*
            public static void main(String[] args)
            {
                    Scanner in=new Scanner(System.in);
                    System.out.println("Hey Dude! Up to which numbers you want to check whether numbers are even");
                    int n=in.nextInt();
                    for(int i=2;i<=n;i++)
                        if (i % 2 == 0) {
                                 System.out.println(i +" is a even number");
                        }
                    else {
                                 System.out.println("Sorry Buddy!! "+ i + " is odd number");
                        }
            }
}*//*


                            //WAP to find even numbers up to 100 and their sum
               */
/* public static void main(String[] args)
                {
                    Scanner in=new Scanner(System.in);
                    System.out.println("Hey Dude! Up to which numbers you want to check whether numbers are even");
                    int n=in.nextInt();
                    int sumodd=0, sum =0;
                    for(int i=2;i<=n;i++)
                    if (i % 2 == 0) {
                    System.out.println(i +" is a even number");

                    sum=sum+i;

                }
                    else {
                            System.out.println("Sorry Buddy!! "+ i + " is odd number");
                            sumodd=sumodd+i;
                }
                    System.out.println("Total sum of even numbers is "+ sum);
                    System.out.println("Total sum of odd numbers is "+ sumodd);
                }
}*//*



//Incrememnt and Decrement;
//               public static void main(String[] args){
//               int a=10;
////               a=a+1;
//                   a+=1;
////                   a+=2;
////                   a++;
//                   System.out.println(++a);
////               System.out.println(a++);
////                   System.out.println(a);
////
////                   System.out.println(++a);
////                   System.out.println(a);
////               System.out.println(++a);
//               }
//}


//TERNARY operator
//int a;
//    int b;
    public static void main(String[] args) {


//        a=10;

    }
    }

*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HelloWorld {

    //Write your code here
    static int B;
    static int H;
    static boolean flag = true;
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
            //return;
        }else{
            //System.out.println(H);
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class
