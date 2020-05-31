

//public class HackerRankPractice {


import java.io.*;
import java.util.*;

//    public class HackerRankPractice {
//        private int age;  //instance variable


//        yearPasses() should increase the  instance variable by .
//        amIOld() should perform the following conditional actions:
//        If , print You are young..
//        If  and , print You are a teenager..
//        Otherwise, print You are old..

       /* public HackerRankPractice(int initialAge) { //parameterized constructor
            // Add some more code to run some checks on initialAge
            if (initialAge>=0) {
                age=initialAge;
            }
            else if (initialAge<0){
                age=0;
                System.out.println("Age is not valid, setting age to 0. setting age to 0.");

            }
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            if (age<13) {
                System.out.println("You are young.");
            }
            else if((age>=13) && (age<18)) {
                System.out.println("You are a teenager.");
            }
//            else if(age>18) {
            else {
                System.out.println("You are old.");
            }
        }

        public void yearPasses() {
            // Increment this person's age.
            age++;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int age = sc.nextInt();
                HackerRankPractice p = new HackerRankPractice(age);
                p.amIOld();
                for (int j = 0; j < 3; j++) {
                    p.yearPasses();
                }
                p.amIOld();
                System.out.println();
            }
            sc.close();
        }
    }*/




public class HackerRankPractice {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        while(n>0)
        {
            String str=in.nextLine();
            StringBuilder evenstr=new StringBuilder();
            StringBuilder oddstr=new StringBuilder();




            char arr[]=str.toCharArray();

            for (int i=0;i<str.length();i++)
            {
                if(i%2==0)
                {
                    evenstr.append(arr[i]);
                }
                else
                {
                    oddstr.append(arr[i]);
                }
            }
            evenstr.append(" ");
            evenstr.append(oddstr);
            System.out.println(evenstr);
            n--;
        }
    }

    }