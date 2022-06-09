/*Sample Input
7
Sample Output
1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1	*/

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here
     
    int n = scn.nextInt();
    int stars = 1;
    int spaces = 2*n-1-2;
    
    
    //System.out.println(n);
     
    for(int i=1;i<=n;i++)
    {
        int value = 1;
        for(int j=1;j<=stars;j++)
        {
            //System.out.print("*\t");
            //System.out.print("1\t");
            System.out.print(value + "\t");
            value++;
        }
        
        for(int j=1;j<=spaces;j++)
        {
            System.out.print("\t");
        }
        
        if(i==n)
        {
            stars--;
            value--;
        }
        
        for(int j=1;j<=stars;j++)
        {
            //System.out.print("*\t");
            //System.out.print("1\t");
            value--;
            System.out.print(value + "\t");
            
        }
        
        stars = stars + 1;
        spaces = spaces - 2;
        //value++;
        System.out.println();
        
    }

 }
}
