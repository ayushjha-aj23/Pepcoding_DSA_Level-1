import java.util.*;
import java.lang.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     
     Scanner sc = new Scanner(System.in);
     
     int n = sc.nextInt();
     int k = sc.nextInt();
     
     int temp = n;
     int no_of_digits = 0;
     
     while (temp!=0)
     {
        temp = temp/10;
        no_of_digits++;
        
     }
     
     k = k%no_of_digits;
     
     if(k<0)
     {
        k = k + no_of_digits;
     }
     
     
     
     //System.out.println(no_of_digits);
     //System.out.println(no_of_digits-k);
     
     int divisor = (int) Math.pow(10,k);
     
     int multiplier = (int) Math.pow(10,no_of_digits-k);
     
     int quotient = n/divisor;
     int remainder = n%divisor;
     
     n = (remainder*multiplier)+quotient;
     
     System.out.println(n);
     
    }
   }
