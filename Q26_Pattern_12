/*Sample Input
5
Sample Output
0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377	

Fibonacci Series */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();
        int num_1 = 0;
        int num_2 = 1;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num_1 + "\t");
                
                int num_3 = num_1 + num_2;
                
                num_1 = num_2;
                num_2 = num_3;
                
            }
            
            System.out.println();
        }

    }
}
