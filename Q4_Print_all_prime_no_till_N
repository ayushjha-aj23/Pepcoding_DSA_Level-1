import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        
        Scanner sc = new Scanner(System.in);
	
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int j=start; j<=end; j++)
		{
	        int count=0;
	        
    	    for (int i=2;i*i<=j;i++)
    	    {
    	        if(j%i==0)
    	            count++;
    	    }
    	    if(count == 0 && j!=1)
    	        System.out.println(j);
		}

    }
}
