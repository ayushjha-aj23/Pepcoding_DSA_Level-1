/*Sample Input
5
Sample Output
		*	
	*		*	
*				*	
	*		*	
		*	  */
    
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     
    int n = scn.nextInt();
     
    int outer_space = n/2;
    int inner_space = -1;
     
    for(int i=1;i<=n;i++)
    {
        //System.out.print(outer_space + ", " + inner_space);
        
        // Outer Spaces
        for(int j=1;j<=outer_space;j++)
        {
            System.out.print("\t");
            
        }
        
        // First Star
        System.out.print("*\t");
        
        // Innner Spaces
        for(int j=1;j<=inner_space;j++)
        {
            System.out.print("\t");
            
        }
        
        // Second Star
        if(i>1 && i<n)
        {System.out.print("*\t");}


        
        if(i<=n/2)
        {
            outer_space--;
            inner_space += 2;
        }
        else
        {
            outer_space++;
            inner_space -= 2;
        }
        
        System.out.println();
    }

 }
}
