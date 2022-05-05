import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  
  Scanner sc = new Scanner(System.in);
  
  int n = sc.nextInt();
  
  int inverse = 0;
  int original_digit;
  int original_position=1;
  
  int inverted_digit;
  int inverted_position;
  
  while(n!=0)
  {
        original_digit=n%10;
       // original_position=1;
        
        inverted_digit=original_position;
        inverted_position=original_digit;
        
        inverse = inverse+inverted_digit* (int) Math.pow(10,inverted_position-1);
        
        original_position++;
        
        n=n/10;
        
  }
  
  System.out.println(inverse);
 }
}
