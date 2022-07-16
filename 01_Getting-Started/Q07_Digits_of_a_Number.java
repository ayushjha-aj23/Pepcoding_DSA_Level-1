import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      
      Scanner sc = new Scanner(System.in);
		
	int n = sc.nextInt();
	int temp = n;
		
	int count_no_digits = 0;
	int rem;
	int first_digit;
	
    while(temp>0)
	{
	    temp = temp/10;
	    count_no_digits++;
	}
	int div = (int)(Math.pow(10,count_no_digits-1));
	while(div>0)
	{
	    first_digit = n/div;
	    System.out.println(first_digit);
	    rem = n%div;
	    n = rem;
	    div = div/10;;
	}

      
     }
    }
