/*
ANONYMOUS ARRAYS:
These are the arrays which do not have any name, these arrays are for instant ad single time use only
These anonymous arrays can be created and initialized in single line
 */

// SAMPLE ANONYMOUS TEST ARRAY


import java.util.*;
/*public class Arraystartersthree {
//    static int anonym(int n[]) {  // If we keep int as retun thwn we need to have return statement in method if not shows error
    static void anonym(int n[]) {
        for (int x : n) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        anonym(new int[]{7,10, 3, 22});
    }
}*/

// SAMPLE 2 ANONYMOUS TEST ARRAY

    /*public class Arraystartersthree {
        static void arraytotal(int n[]){
            int sum=0;
            for(int x:n){
                sum=sum+x;
            }
            System.out.println("The total is "+ sum);
        }
        public static void main(String[] args) {
            arraytotal(new int[]{10, 5, 5});
        }
    }*/


//    RETURNING ARRAY FROM THE METHOD

/* LATER */



// MULTIDIMENSIONAL ARRAYS (ARRAY OF ARRAYS)
//-> Elements in form of rows and columns
//syntax: datatype[][] arrayname   (or)   datatype arrayname[][]  (or) datatype[] arrayname[]
//int [3][3] //Error bcoz we cannot give size without using "new" operator here during declaration.
//In java memory allocation is different as in above we will have n[0], n[1], n[2] and each n[0] will have 3 and n[1] will have [3] and so.
//In java we can create non-recatangular arrays like:

//n[0]=new int[3];
//n[1]=new int[4];
//n[2]=new int[5];
//Thre dimensional would be like below are mostly used in gaming applications only
//int[][][]  = new int[2][3][4];


// EXAMPLE OF MULTIDIMENSIONAL ARRAY TO PRINT A 3X3 MATRIX

        public class Arraystartersthree {
            /*public static void main(String[] args) {

                Scanner in=new Scanner(System.in);
                //Declaring an array (multi-dimensional)
                int[][] n=new int[3][3];
                System.out.println("Enter 9 values");
                //Initializing array values on to indices
                for(int i=0;i<n.length;i++) {
                    for (int j = 0; j < n[i].length; j++) {
                        n[i][j] = in.nextInt();
                    }
                }


                //Traversing or print array values from indexes
                System.out.println("Given matrix 3x3 is");
                for (int i=0;i<n.length;i++){

                        for (int j = 0; j < n[i].length; j++)
//                        System.out.println(n[i][j]+" ");
                            System.out.print(n[i][j] + " ");
                            System.out.println();*/ //After loop is done next loop prints in new line
            //Why does two sout statements doen't execute in for loop?
            //Ans: the for loop is not maintained {  } for the statemnts which means it access only the first statement in for loop remember.
//                    Notes:
//                    Difference b/n
//                    System.out.print();-->   This keeps cursor in same line, which prints result continuosly/
//                    System.out.println();--> This throws cursor to next line after printong desired result.


//                }
//
//            }
//        }



            /*public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                int[][] n = new int[3][3];
                System.out.println("Enter 9 values ");
                for(int i=0;i<n.length;i++)
        for(int j=0;j<n[i].length;j++)
        n[i][j] = in.nextInt();
        System.out.println("Given 3x3 matrix");
        for(int i=0;i<n.length;i++)
        {
        for(int j=0;j<n[i].length;j++)
        System.out.print(n[i][j]+" ");
        System.out.println();
        }
        }
        }*/



            /*public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
                System.out.println("Enter size of array");
                int size=in.nextInt();
                //Declaring array
                int[][] n=new int[size][size];
                //Initializing values in to array
                System.out.println("Enter "+ size +" X "+ size +" values");
                for(int i=0;i<n.length;i++){
                    for (int j=0;j<n[i].length;j++){
                        n[i][j]=in.nextInt();
                    }
                }
                //traversing or printing the array elements
                System.out.println("The elements are");
                for (int i=0;i<n.length;i++){
                    for(int j=0;j<n[i].length;j++)
                        System.out.print(n[i][j] +" ");
                    System.out.println();

                }
            }
        }*/


            //Labelled break to come out of outer loops & Labelled continue is to continue in outer loops.
// After label we can have only loops statements (like while, for) no other statements allowed.


//EXAMPLE PROGRAM FOR LABELLED BREAK AND CONTINUE (WAP to find a number in matrix 3X3)


            /*public static void main(String[] args) {
                Scanner in=new Scanner(System.in);
                System.out.println("Enter the size of array");
                int size=in.nextInt();
                //Declaring an array
                int[][] n=new int[size][size];
                System.out.println("Enter "+ size +" X "+ size +" values");
                //Initializing values in an array
                for (int i=0;i<n.length;i++){
                    for (int j=0;j<n[i].length;j++){
                        n[i][j]=in.nextInt();
                    }
                }

                //Traversing or printing values of an array

                for(int i=0;i<n.length;i++){
                    for (int j=0;j<n[i].length;j++)
                        System.out.print(n[i][j]+" ");
                        System.out.println();
                }
                //searching a value in a array is similar to search ing a value in given numbers i.e by noolean flag
                System.out.println("Enter a value to search");
                int key=in.nextInt();
                boolean flag=false;
                for(int i=0;i<n.length;i++){
                    for (int j=0;j<n[i].length;j++){
                        if(key==n[i][j]){
                            flag=true;
                            break;
                        }
                    }
                }

                    if (flag){
                        System.out.println("Found");
                    }
                    else{
                        System.out.println("Not found");
                    }
            }
        }
*/
            // PASSING AN ARRAY IN TO A METHOD
            //we can pass array in method and reuse same logic, check below (wap to find min number in given array)

            //In Single dimensional
            /*static void min(int[] n) {  //why did we not used static int min() here instead of static void main() ? (you know the answer)
                int min = n[0];
                for (int i = 0; i < n.length; i++) {
                    if (min > n[i]) {
                        n[i] = min;
                    }
                }
                System.out.println(min);
            }
            public static void main(String[] args) {
                int[] n={24, 72, 32, 11, 22};
                min(n);
            }
            }
*/

            //In Multidiemnsioanl
            /*static void min(int n[][]){
                int min=n[0][0];

                for (int i=0;i<n.length;i++){
                    for(int j=0;j<n[i].length;j++){
                        if (min>n[i][j]) {
                            n[i][j]=min;
                        }
                    }
                }
                System.out.println(min);
            }
            public static void main(String[] args) {
                //Declaring array and initializng a 2X3
                int n[][]={{11, 34, 21},{42, 25, 27}};
                min(n);
            }
        }
*/


            // Java supports the feature of an anonymous array, so you don't need to declare the array while passing an array to the method.
    // which means you can declare in main method and the logic in other method.

//  [Passing array to a method  amd  Retrning array from method both are different]
//Passing an array to a method means declaring array in main() and using logic in another method and accessing that method from main()
//while returning array from method is vice versa, declaring an array and its values by using return in normal method and all the initialization does in main().



//            Returning Array from the Method (example)


            //method which returns array values
            /*static int[] smaple(){  //Must be clared retun int here as int[]
                return new int[]{1, 2, 6, 77, 21};
            }
            public static void main(String[] args) {
                //calling the array which return values through method here
                int n[]=smaple();


                //Traversing or Printing array values with for and for each loops
                //Tradational for loop
//                for(int i=0;i<n.length;i++){
//                    System.out.println(n[i]);
//                }


                //For each loop
                for(int x:n){
                    System.out.println(x);
                }
            }
            }*/


            // Jagged array is like, If we are creating odd number of columns in a 2D array, it is known as a jagged array

            //An array is an object on java, To obtain class name of array we use getName(), (must use getClass() before that)
            // Also the class name depends on arraytype the classname would be different for int amd double.

            //Class name of java array


            /*public static void main(String[] args) {
                //Declaring and initializing ana array
//                int n[]={10,29,11, 78};  //Class name "[I"
                double n[]={10,29,11, 78}; //Class name  "[D"

                //getting class name of java array
                Class c=n.getClass();
                String name=c.getName();
                System.out.println(name);



            }
            }
*/


            //  COPYING AN ARRAY
            // Copying an array from one to another is doen through arraycopy()

//            Syntax of arraycopy method

//            public static void arraycopy(
//                    Object src, int srcPos,Object dest, int destPos, int length
//            )

//            ELOVERATION OF SYNTAX:
//            object source, sourec position, object destination, destination position, length up to where you want (and must not exceed destined postion value)




           /* public static void main(String[] args) {
                //Declaring an array (source)
                char[] Original={'f','e','i','l','v','a','c','c','i','n','e','i','u','h'};

                //Declaring an arry (destination)
                char[] modified=new char[8];
                System.arraycopy(Original, 4, modified, 0, 7);  // length is like array length starts from 1, don't get confused with indices n[0]
                System.out.println(String.valueOf(modified));
            }
            }
            */



            //CLONING OF AN ARRAY
//            If we clone the single dimensional array, instaed of duplicating/make copies it imports/copy actual value. (Deep copy)
//            But for multidimensional array it copies the references. (Shallow copy)

            /*public static void main(String[] args) {
                //Declaring and initializing a single dimensional array
                int n[]={10, 23, 21, 32};
                System.out.println("The original values");
                //Traversing / printing vlues of array declared above by tradational for loop
                *//*for (int i=0;i<n.length;i++){
                    System.out.println(n[i]);
                }*//*

                //Traversong / printing vlues of array declared above by for each enchanced loop
                for (int x:n) {
                    System.out.println(x);
                }

                int n1[]=n.clone();
                System.out.println("The cloned values of array are");
                //Traversing or printing array with tradational for loop
                *//*for (int i=0;i<n1.length;i++){
                    System.out.println(n1);
                }*//*
                //Traversing or printing array with enhanced for each loop
                for (int x:n1) {
                    System.out.println(x);
                }

                System.out.println(n==n1);

            }
            }*/



//   CLONING OF MULTIDIMENSIONAL ARRAY


//            public static void main(String[] args) {
//                System.out.println("The original values are");
//                //Declaring and assigning an array
//                int n[][]={{10, 20},{10,12}};
                //Traversing/printing an array values(tradational for loop)
//                for (int i=0;i<n.length;i++){
//                for (int j=0;j<n[i].length;j++){
//                    System.out.println(n[i][j]);
//                }
//                }
                //Traversing / print array with enhanced for loop (for each)  //Enhanced for loop is different than regular one
                /*for(int[] x:n) {
                    for (int x1 : x) {
                        System.out.println(x1);
                    }
                }


                System.out.println("The cloned values are");
                int[][] n1=n.clone();*/
//                for (int i=0;i<n.length;i++) {
//                    for (int j = 0; j < n[i].length; j++) {
//                        System.out.println(n1[i][j]);
//                    }
//                }


                //Traversing with enhanced for loop
                /*for(int[] x:n1)
                {
                    for (int x2 : x)
                    {
                        System.out.println(x2);
                    }
                }
                System.out.println("Are they equal");
                System.out.println(n==n1);

            }
            }
*/

            /*public static void main(String[] args) {
                //Declaring array which need to be added

                int[][] n={{5,3,7},{5,7,3}};
                int[][] n1={{5,7,3},{5,3,7}};


//                /Declaring c to store value of a and b
                int n3[][]=new int[2][3];

                //Traversing/printing an array and adding logic to it

                for(int i=0;i<n.length;i++){
                    for(int j=0;j<n[i].length;j++) {
                        n3[i][j] = n[i][j] + n1[i][j];
                        System.out.print(n3[i][j] + " ");

                    }
                    System.out.println("The addition of "+ n[i] + " and "+ n1[i]);
                    System.out.println();

                }
*//*
check the print statement to print that matrix A + Matrix B = Matrix C as sout
 *//*
            }
            }*/


            //MULTIPLICATION OF MATRICES

/*
            public static void main(String[] args) {
                //Declaration of arrays
                int n[][]={{1,1,1},{2,2,2},{3,3,3}};
                int n1[][]={{1,1,1},{2,2,2},{3,3,3}};

                int n3[][]=new int[3][3];

                //Printing the values and adding logic

                for(int i=0;i<n.length;i++){
                    for (int j=0;j<n[i].length;j++){
                        n3[i][j]=0;
                        for(int k=0;k<n1[i].length;k++){
                            n3[i][j]+=n[i][k]*n1[k][j];
                        }
                        //End of K loop
                        System.out.print(n3[i][j] +" ");
                    }
                    //End of J loop
                    System.out.println();
                }

            }
            }*/


            static void solve(double meal_cost, int tip_percent, int tax_percent) {
                double tip;
                double tax;
                double totalcost;
                tip=(meal_cost*tip_percent)/100;
                tax=(meal_cost*tax_percent)/100;
                totalcost= (meal_cost + tax + tip);
                System.out.println(Math.round(totalcost));
            }

            private static final Scanner scanner = new Scanner(System.in);

            public static void main(String[] args) {
                double meal_cost = scanner.nextDouble();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                int tip_percent = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                int tax_percent = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");




                solve(meal_cost, tip_percent, tax_percent);

                scanner.close();
            }
        }
