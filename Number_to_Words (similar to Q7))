import java.util.*;
import java.lang.*;

public class Main
{
public static void main(String[] args) {


Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int no_of_digits = 0;
        int first_digit = 0;
        int temp = n;
       

        while (temp>0)
        {
            temp = temp/10;
            no_of_digits++;

        }
        System.out.println("Number of Digits is " + no_of_digits);
       
        int div = (int) Math.pow(10, no_of_digits-1);
       
        while(div>0)
        {
            first_digit = n/div;
           
            switch(first_digit)
            {
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                case 0:
                    System.out.print("Zero ");
            }
           
            n= n%div;
            
           
            div = div/10;
            no_of_digits--;
        }
       
}
}
