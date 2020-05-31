/*
NOTES
-----
Palindrome is when you have same values at same position even though when you reverse the original is called palindrome.
(A sequence that reads same in both forward and backward)
we need to break down if we are checking a palindrome for number by lookig the 3 numbers from last by their remainders and quotient.

FOR STRING
we need to compare oroginal string and reverse string



MINI NOTE:

while checking palindrome for numbers better use "==" in if conditions, while for strings "==" is best used.




 */
import java.util.*;
public class Palindrome {
/*    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to check");
        int n=in.nextInt();
        int r;
        int sum=0;
        int temp=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=(sum*10)+r;
        }
        if (temp==sum) {
            System.out.println("yes! palindrome");
        }
        else if (temp!=sum) {
            System.out.println("No! not palindrome");
        }
    }
}*/


    //    STRING

    /*public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enetr a string to check");
        String a=in.nextLine();
        String reverse="";
//        String Original=a;
        for(int i=a.length()-1;i>=0;i--)
        {
            reverse=reverse+a.charAt(i);
        }
        System.out.println(reverse);
        if(a.equals(reverse)){
            System.out.println("Yes! palindrome string");
        }
        else {
            System.out.println("No! not a palindrome");
        }

    }
}*/


    ///     USING STRING BUFFER AND STRING REVERSE METHOD
    /*
    NOTES

    Instead of using for loop for the logic we can use StringBuffer simple to reduce code

    StringBuffer syntax is used to reverse the string simple way
    syntax:
    StringBuffer S=new StringBuffer
    to find vreverse for above StringBuffer we use
    S.reverse()

    To maintain If else condition with strinbg buffer
    we need to store reverse value in sepearte "String" and  need to compare both of them to check the condition in if else
     */

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string youb want to check");
        //Here instead of creating a String for the original value given by userwe are invoking it (in.nextLine()) directly in to String Buffer
        StringBuffer S=new StringBuffer(in.nextLine());
        //Just for checking
        System.out.println("Original " +S);
        System.out.println("Reverse " +S.reverse());
        //Here we are making a string reverse by S.reverse() and moving it to String 'reverse' by to.String() method
        String reverse=S.reverse().toString();
        if(S.equals(reverse)) {
            System.out.println("Yes! it's a pali");
        }
        else {
            System.out.println("No! it's not pali");
        }
    }
}


