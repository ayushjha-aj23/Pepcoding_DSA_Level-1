import java.util.*;
import java.io.*;
    
    public class Main{
    
    public static void main(String[] args) throws IOException {
      // write your code here  
      
      Scanner sc = new Scanner(System.in);
      
      int original_num1 = sc.nextInt();
      int original_num2 = sc.nextInt();
      
      //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //int original_num1 = Integer.parseInt(br.readLine());
      //int original_num2 = Integer.parseInt(br.readLine());
      
      int GCD, LCM;
      
      int num1 = original_num1;
      int num2 = original_num2; 
      
      while(num1%num2 != 0)
      {
        int rem = num1%num2;
        num1=num2;
        num2=rem;
      }
      
      GCD = num2;
      
      LCM = (original_num1*original_num2)/GCD;
      
      System.out.println(GCD);
      System.out.println(LCM);
     }
    }
