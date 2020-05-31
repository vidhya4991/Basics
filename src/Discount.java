/*
4. WAP to accept itemnum,itemname,rate and quantity. Find price(rate*qty)
   	calculate discount as follows
	if (price >= 1000 and < 2000)
	   dis is 10% on price
	if (price >= 2000 and < 3000)
	   dis is 15% on price
	if (price >= 3000 and < 5000)
	   dis is 20% on price
	if (price >= 5000)
	   dis is 25% on price

	Calculate netprice (price-dis).
	Display itemnum,itemname,price,discount,netprice
 */
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.*;
public class Discount {


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter item number");
        int Ino=in.nextInt();
        in.nextLine();
        System.out.println("Enter item name");
        String Iname=in.nextLine();
        System.out.println("Enter rate");
        int rate=in.nextInt();
        System.out.println("Enter quantity");
        int quantity=in.nextInt();
        int Price=rate*quantity;
        int Discount10=Price*10/100;
        int Discount15=Price*15/100;
        int Discount20=Price*20/100;
        int Discount25=Price*25/100;
        int netprice=Price;
        int Netprice = 0;
        int Finalprice = 0;
        int Discount=0;
        int NoDiscount=0;
//        int netprice=(Price-Discount);
//        if (Price>=1000 && Price<2000)
//            System.out.println(Discount10);

//        System.out.println((Price>=1000 && Price<2000)?Discount10:((Price>=2000 && Price<3000)?Discount15:((Price>=3000 && Price<5000)?Discount20:((Price>=5000)?Discount25:"No Discount for below 1000 price"))));
        Discount=(Price>=1000 && Price<2000)?Discount10:((Price>=2000 && Price<3000)?Discount15:((Price>=3000 && Price<5000)?Discount20:((Price>=5000)?Discount25:NoDiscount)));
        System.out.println("The discount is :"+Discount);


        if(Price>=1000 && Price<2000){
            Netprice=(netprice-Discount10);
            Finalprice=Netprice;
        }
        else if (Price>=2000 && Price<3000){
            Netprice=netprice-Discount15;
            Finalprice=Netprice;
        }
        else if (Price>=3000 && Price<5000){
            Netprice=netprice-Discount20;
            Finalprice=Netprice;
        }
        else if (Price>=5000){
            Netprice=netprice-Discount25;
            Finalprice=Netprice;
        }
        else {
            Netprice=Price;
        }
        System.out.println("Item number :"+Ino);
        System.out.println("Item name :"+Iname);
        System.out.println("Price : "+Price);
        System.out.println("Netprice : "+Netprice);
        System.out.println("FinalPrice after Discount calculated is : "+Price+" - "+Discount+" = "+Finalprice);
    }
}


//REMARKS
/*
Good job! but try to reduce the lines of code!!
 */