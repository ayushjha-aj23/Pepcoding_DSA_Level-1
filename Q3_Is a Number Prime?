Scanner scn = new Scanner(System.in);
      
      // write ur code here
      int t = scn.nextInt();
      
      while(t>0)
      {
          int n = scn.nextInt();
          int count =0;
       
            // Method 1: Worst Case--- for (int i=1;i<=n;i++) if count = 2 then prime otherwise not
            // Method 2: for(int i=2; i*i <=n; i++) if count = 0 then prime otherwise not
            // Method 3: Best Case--- for(int i=2; i*i <=n; i++) then break to come outside the loop as we have count atleast 1 
            
           for(int i=2; i*i <=n; i++)
           {
               if(n%i==0)
               count++;
               break;
           }
       
           if(count==0)
            System.out.println("prime");
           else
            System.out.println("not prime");
              
        t--;
      }
