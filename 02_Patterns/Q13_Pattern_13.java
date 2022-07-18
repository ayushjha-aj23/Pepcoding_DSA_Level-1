/*Sample Input
5
Sample Output
1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1	*/

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //write your code here
        
        int n = scn.nextInt();
        
        for(int i=0;i<n;i++)
        {
            int iCj = 1;
            for(int j=0;j<=i;j++)
            {
                //System.out.print("#\t");
                
                // nCk = (n)!/(k)!*(n-k)!
                // nCn = nC0 = 1
                // nCk = nC(n-k)
                
                System.out.print(iCj + "\t");

                int iCj_plus_one = iCj * (i-j) / (j+1);
                iCj = iCj_plus_one;
                
            }
            
            System.out.println();
        }
    }
}
