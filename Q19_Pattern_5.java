/*Sample Input
5
Sample Output
		*	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*	   
Also there is an assumption that n is always odd number */
		
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();
    
        int space = n/2;
        int star = 1;
        
        for(int i =1; i<=n; i++)
        {
            //System.out.println(space + ", " + star);
            
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
                space--;
                star = star + 2;
            }
            else if (i>(n/2))
            {
                space++;
                star = star - 2;
            }
            
            
            System.out.println();
        }
        

    }
}
