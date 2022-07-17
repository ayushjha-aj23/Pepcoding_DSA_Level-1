/*Sample Input
5
Sample Output
*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*	  */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();
    
    int space = 1;
    int star = n/2 + 1;
    
    for(int i =1; i<=n; i++)
    {
        //System.out.println(star + ", " + space + ", " + star);
        
        // for stars
        for(int j = 1; j<=star; j++)
        {
            System.out.print("*\t");
        }
        
        // for spaces
        for(int j = 1; j<=space; j++)
        {
            System.out.print("\t");
        }
        
        // for stars
        for(int j = 1; j<=star; j++)
        {
            System.out.print("*\t");
        }
        
        
        
        if(i<=(n/2))
        {
            star--;
            space = space + 2;
        }
        else if (i>(n/2))
        {
            star++;
            space = space - 2;
        }
        
        
        System.out.println();
    }
    
    }
}
