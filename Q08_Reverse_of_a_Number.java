import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
      Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int num = n;
	    int rev=0;
	    int rem=0;
	    
	    while (num!=0)
	    {
	        rem = num%10;
	        
	        System.out.println(rem);
	        //rev = (rev*10)+rem;
	        num=num/10;
	    }
	    //System.out.println("Reverse of a inputted number is " + rev);

     
    }
   }
