import java.util.Scanner;

//General way
/*
public class Fibonacci {
    public static void main(String[] args) {
        */
/*int n1=1;
        int n2=1;
        int n3;*//*

        int n1, n2, n3, Count;
        n1=1;
        n2=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter numbers in fobonacci you want to pass");
        Count=in.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        for(int i=2;i<=Count;i++)
        {

            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }

    }
}
*/

//Using Recursion
//LOGIC:
//1  1  2  3   5   8
//return first 2 values as 1, To get value of 3rd number the very prior  2 numbers needed to be added
//here
//        2=(2-1)+(2-1)
//        3=(3-2)+(3-1)
//        .....

public class Fibonacci {
    public static void main(String[] args) {
//        int result=0;
        for(int i=1;i<=10;i++){
            //calling Fiborecur() method here
            int result=Fiborecur(i);
            System.out.println(result);
        }
    }
    static int Fiborecur(int pos){
        if((pos==1) || (pos==2)){
            return 1;
        }
        else
        {
            //calling same method in itself Fiborecur()
           return Fiborecur(pos-1) + Fiborecur(pos-2);
        }

    }

}



