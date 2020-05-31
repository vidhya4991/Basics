/*
WAP to check whether the given age is major or minor
 */
import java.util.Scanner; //If not implemented shows error at line 7 (Scanner initialization that "Cannot resolve symbol"
public class ControlStatements {
    /*public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the person's age");
        int age=in.nextInt();
        if(age>=18)
            System.out.println("He/She is a major");
        else if(age<18)
            System.out.println("He/She is a minor");
    }
}*/

    //LEAP YEAR OR NOT
    /*public static void main(String[] args) {

        Scanner in=new Scanner(System.in); //we'll get error at thi sline if we do not jhave import util scanner package for this with error "Cannot resolve symbol"
        System.out.println("Enter a year to check leap year or not");
        int year=in.nextInt();
        if(year%4==0)
            System.out.println("Yes! This year is a leap year");
        else if(year%4!=0)
            System.out.println("No! This year isn't a leap year");
    }
    }*/

    //TERNARY OPERATOR MAJOR OR MINOR

    public static void main(String[] args) {
    /* Scanner in=new Scanner(System.in); //If not given java util package error"Cannot resolve symbol" will be shown
        System.out.println("Enter a age");
        int age=in.nextInt();
//        String message=(age>=18)?"Yes":"No";
//        System.out.println(message);

        System.out.println(age>=18?"Yes":"no");
    }
    }*/

        //LEAP YEAR with TERNARY OPERATOR

        /*Scanner in = new Scanner(System.in);
        System.out.println("Enter a Year you want!");
        int year = in.nextInt();
        System.out.println((year%4==0) ? "Yes! Leap year":"No! not a leap year");
    }
}*/

        //WAP to find biggest of three numbers using conditional operator

        /*Scanner in=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println((a>b)?(a>c?a:c):(b>c?b:c));
        *//*
        LOGIC
        First compare a (1st number) with all the other numbers if it is great then print that number,
        else check other 2 numbers (b&c) print whichever is greater of them two.
         *//*
    }
}*/

        //WAP to find biggest of three numbers using conditional operator

        Scanner in=new Scanner(System.in); //If not given the import util package we'll get error here"Cannot resolve the symbol"
        System.out.println("Enter 4 numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int d=in.nextInt();
        System.out.println((a>b && a>c && a>d)?a:((b>c && b>d)?b:(c>d?c:d)));


    }
}