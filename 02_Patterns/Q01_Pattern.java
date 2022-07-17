/*Input
5
Output
*
* *
* * *
* * * *
* * * * *  */

// Program Starts here 

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = 0; i<n; i++)
        {
            for(int j = 1; j<=i+1; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
