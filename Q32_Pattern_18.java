/*Constraints
1 <= n <= 10
 Also, n is odd.
Sample Input
7
Sample Output
*	*	*	*	*	*	*	
	*				*	
		*		*	
			*	
		*	*	*	
	*	*	*	*	*	
*	*	*	*	*	*	*	  */

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
    
    int n = scn.nextInt();
    
    int stars = n;
    int spaces = 0;
    
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=spaces;j++)
        {
            System.out.print("\t");
        }
        
        for(int j=1;j<=stars;j++)
        {
            // Condition...
            if((i>1) && (i<=(n/2)) && (j>1) && (j<stars))
            {
                System.out.print("\t");
            }
            else
            {
                System.out.print("*\t");
            }
            
        }
        
        
        if(i<=(n/2))
        {
            stars = stars - 2;
            spaces = spaces + 1;
        }
        else
        {
            stars = stars + 2;
            spaces = spaces -1;
        }
        
        System.out.println();
        
    }
    

 }
}
