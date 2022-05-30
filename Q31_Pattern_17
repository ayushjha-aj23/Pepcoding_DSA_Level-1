/*Constraints
1 <= n <= 10
 Also, n is odd.
Sample Input
5
Sample Output
		*	
		*	*	
*	*	*	*	*	
		*	*	
		*	      */
    
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        int stars = 1;
        int spaces = n/2;
        
        for(int i=1;i<=n;i++)
        {
            if((i<=(n/2)))
            {
                //For Spaces
                for(int j=1;j<=spaces;j++)
                {
                    System.out.print("\t");
                }
                
                // For Stars
                for(int j=1;j<=stars;j++)
                {
                    System.out.print("*\t");
                }
                
                stars++;
            }
            
            else if(i==(n/2)+1)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print("*\t");
                }
            }
            
            else if (i>(n/2)+1)
            {
                
                //For Spaces
                for(int j=1;j<=spaces;j++)
                {
                    System.out.print("\t");
                }
                
                stars--;
                // For Stars
                for(int j=1;j<=stars;j++)
                {
                    System.out.print("*\t");
                }
                
            }
            
            System.out.println();
        }
    }
}
