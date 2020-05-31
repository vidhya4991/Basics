/*
ARMSTRONG NUMBER
-----------------
Armstrong number is when you have a number and it's cube of each and single digit in nuber is added must be equal to original number

LOGIC:
taking of it's reminder and  also qotient (this in loop) and adding to sum multiplying remainder for 3 time in while loop.
r=n%10;
            n=n/10;
            sum=sum+(r*r*r);


            **** sort out number of armstrong nmbers up to------------
 */

import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        int r, temp, sum=0;

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to check");
        int n=in.nextInt();
        temp=n;
        while(n!=0) {
            r=n%10;
            n=n/10;
            sum=sum+(r*r*r);
//            The above sum can also be written as loop continues
//            sum+=Math.pow(r, 3);
        }
        if (temp==sum) {
            System.out.println("Yes! armstrong");
        }
        else
        {
            System.out.println("Not a armstrong");
        }
    }
}


