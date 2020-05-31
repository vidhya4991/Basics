//WAP to find 1st, 2nd biggest, 1st and 2nd smallest in REGULAR and in ARRAY format

//REGULAR WAY


/*import java.util.*;

public class Arraystarterstwo {*/
    /*public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the limit");
        int a=in.nextInt();
        System.out.println("Enter numbers you want to check");
        int Big=0;
        //checking big number of following
        for(int i=0;i<a;i++){
            int current=in.nextInt();
            if(current>Big){
                Big=current;
            }
        }
        System.out.println("Yes it is big "+ Big);

    }
}*/


//Pro: In regular way to compare and find which is largest and smalled we can also use this Math.max and Math.min methods as follows:

    /*public static void main(String[] args) {
        int x, y;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a first number");
        int a=in.nextInt();
        System.out.println("Enter a second number");
        int b=in.nextInt();
        System.out.println("Enter a third number");
        int c=in.nextInt();
        System.out.println("Enter a fourth number");
        int d=in.nextInt();
        x=Math.min(a, Math.min(b, Math.min(c, d)));
        y=Math.max(a, Math.max(b, Math.max(c, d)));
        System.out.println("The small is "+ x);
        System.out.println("The large is "+ y);
    }
    }*/














//General 1st highest and smallest number by using array


import java.util.*;

public class Arraystarterstwo {
    /*public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = in.nextInt();
        //declaring an array
        int n[] = new int[size];
        System.out.println("The " + size + " values in array are");
        //assigning values in array
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }

        //LOGIC
        int Big = n[0];
        int Small=n[0];
        for (int i = 0; i < n.length; i++) {
            if (n[i] > Big) {
                Big = n[i];

            }
            else if (n[i]<Small) {
                Small = n[i];

            }


        }
        System.out.println("The big number is " + Big);
        System.out.println("The small number is " + Small);

    }
}*/


    // General first and 2nd highest and last smallest & penultimate smallest number in array

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=in.nextInt();
        //array initialization
        int[] n=new int[size];

        System.out.println("Enter values in array");


        //assigning values in to array size
        for(int i=0;i<n.length;i++) {
            n[i] = in.nextInt();
        }

        int Big=n[0];
        int TwoBig=n[0];
        int Small=n[0];
        int TwoSmall=n[0];

        for(int i=0;i<n.length;i++){
            if(n[i]>Big){
                TwoBig = Big;
                Big=n[i];
            }
            else if(n[i]>TwoBig){
                TwoBig=n[i];
            }

            //Note to Vidhya: This logic you worked well.
            else if(n[i]<TwoBig){
                TwoSmall=Small;
                Small=n[i];
            }
            else if(n[i]<TwoSmall){
                TwoSmall=n[i];
            }
        }


        System.out.println("The 1st big number is "+ Big);
        System.out.println("The 2nd big number is "+ TwoBig);
        System.out.println("The last Small number is "+ Small);
        System.out.println("The Last but one small number is "+ TwoSmall);
    }

}*/


//OR ELSE IN AN EASY WAY WE CAN USE FOLLOWING METHODS AND DO THE SAME PROGRAM OF FINDING LARGEST AND SMALLEST


// Arrays.toString() -->   This method is used to return string representation of contents specified in an array, and these elements enclosed in "[]"
// Arrays.sort(Arr)  -->   This is a method generally used to sort the array in ascending order(small no's to Big)

//Check this below.
/*    public static void main(String[] args) {
        int[] n={12, 19, 30, 9, 6, 10};
        //Sorting arrays in ascending order with this method
//        Arrays.sort(n);
        //Printing those sorted arrays in string format with Arrays.toString()
        System.out.println(Arrays.toString(n));
    }
    }*/

//  To find smallest, largest, 2nd smallest , 2nd largest of given numbers in an array.

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=in.nextInt();
        //declaring an array
        int[] n=new int[size];
        //Initializing an array
        System.out.println("The numbers in array are ");
        for(int i=0;i<n.length;i++){
            n[i]=in.nextInt();
        }
        //Using Arrays.sort() and Arrays.toString() for this program
        Arrays.sort(n);
        System.out.println("The sorted array looks like "+ Arrays.toString(n));
        System.out.println("The smallest number is "+ n[0]);
        System.out.println("The 2nd smallest number is "+ n[1]);
        System.out.println("The Biggest number is "+ n[size-1]);
        System.out.println("The 2nd Biggest number is "+ n[size-2]);
    }
    }