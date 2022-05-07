import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//int temp = n;
		
		for(int prime=2; prime*prime <=n; prime++)
		{
		    while(n%prime==0)
		    {
		        n = n/prime;
		        System.out.print(prime + " ");
		    }
		}
		if(n != 1)
		{
		    System.out.println(n);
		}
	}
}
