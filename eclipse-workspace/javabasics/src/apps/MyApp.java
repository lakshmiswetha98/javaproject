package apps;

public class MyApp  
 {
	public static void main(String args[])
	{
    	int num=2496,rev=0;
	     while(num!=0)
	     {	 
		  int digit=num%10;
        	rev=rev*10+digit;
	          num/=10;
	     }
	 System.out.println(rev);
    }
 }
