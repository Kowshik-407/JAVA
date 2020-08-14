import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Price 1 : ");
    float a = sc.nextFloat();
    System.out.println("Price 2 : ");
    float b = sc.nextFloat();
    System.out.println("Price 3 : ");
    float c = sc.nextFloat();
    System.out.println("tax % : ");
    float taxPerc = sc.nextInt();
    float productPrice = a + b + c;
    float taxAmount = productPrice + (taxPerc / 100) * productPrice;
    System.out.println("Final  Amount : " + taxAmount);
   }
 }
