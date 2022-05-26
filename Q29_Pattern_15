/*Sample Input
5
Sample Output
		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	*/

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();
        
        int spaces = n/2;
        int stars = 1;
        int x = 1;
        
        for(int i=1;i<=n;i++)
        {
            //System.out.println(spaces + ", " + stars);
            
            for(int j=1;j<=spaces;j++)
            {
                System.out.print("\t");
            }
            
            int col_x= x;
            for(int j=1;j<=stars;j++)
            {
                System.out.print(col_x+"\t");
                //x++;
                if(j<= stars/2)
                    col_x++;
                else
                    col_x--;
            }
            
            if(i<=(n/2))
            {
                spaces--;
                stars = stars + 2;
                x++;
            }
            else
            {
                spaces++;
                stars = stars - 2;
                x--;
            }
            
            //x++;
            System.out.println();
        }

    }
}
