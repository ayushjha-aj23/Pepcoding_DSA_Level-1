import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = a;
		boolean bool = false;
		
		if(b>=max)
		    max = b;
		
		if(c>=max)
		    max = c;
		
		if(max==a)
		    bool = (b*b + c*c == a*a);
		else if(max==b)
		    bool = (a*a + c*c == b*b);
		else if(max==c)
		    bool = (a*a + b*b == c*c);
        System.out.println(bool);
	}
}
