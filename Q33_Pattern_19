/*Constraints
1 <= n <= 10
Also, n is odd.
Sample Input
7
Sample Output
*	*	*		*	
		*		*	
*	*	*	*	*	
*		*			
*		*	*	*	    */
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     
    int n = scn.nextInt();
    
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
            // Conditions for Swastik
            // Part 1:
            if(i==1)
            {
                if(j==n || j<=(n/2)+1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            
            // Part 2:
            else if(i<=(n/2))
            {
                if(j==n || j==(n/2)+1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            
            // Part 3:
            else if(i==(n/2)+1)
            {
                System.out.print("*\t");
            }
            
            // Part 4:
            else if(i<n)
            {
                if(j==1 || j==(n/2)+1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            
            // Part 5:
            else
            {
                if(j==1 || j>=(n/2)+1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            
            //System.out.print("*\t");
        }
        System.out.println();
    }
 }
}
