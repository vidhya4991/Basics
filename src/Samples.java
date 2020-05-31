//odd  even and prime numbers


import java.util.Scanner;

public class Samples {
    /*public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a=in.nextInt();
        if (a%2==0)
        {
            System.out.println(a +" is a even number");
        }
        else
            System.out.println(a +" is a odd number");

    }
}*/



    /*public static void main(String[] args) {
    for(int n=1;n<=100;n++)
        if (n%2==0)
        {
            System.out.println(n +" is a even number");
        }
        else
            System.out.println(n +" is a odd number");

    }
    }*/


/*    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a limit number you want to check");
        int i=in.nextInt();
        for(int n=1;n<=i;n++)
            if (n%2==0)
            {
                System.out.println(n +" is a even number");
            }
            else
                System.out.println(n +" is a odd number");
    }

    }*/

   /* public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit you want to find");
        int i=in.nextInt();
        for(int n=1;n<=i;n++) {
            if (n % 2 == 0)
                System.out.println(n + " is an even number");

            else if (n % 2==1)
                System.out.println(n +" is an odd number");
        }
    }
    }*/

/*    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int temp=0;
        for(int i=2;i<=n-1;i++)

        {

            if(n%i==0)
            {

                temp = temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("is a prime");
            System.out.println(temp);
        }
        else
        {
            System.out.println(" is not a prime");
            System.out.println(temp);

        }
    }
    }*/

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a limit");
        int n=in.nextInt();
        int temp=0;  //If you mention temp inside for loop here at i then no need to make temp value as '0';
        for(int i=1;i<=n;i++)
        {

            for(int j=2;j<i-1;j++)
            {
                if(i%j==0)
                {
                    temp=temp+1;
                }
            }
            if(temp==0) {
                System.out.println(i + " is a prime numeber");
//                System.out.println(temp);
            }
            else {
//                temp=0;

                System.out.println(i + " is NOT a prime number");
//                System.out.println(temp);
            }
        }
    }
    }
