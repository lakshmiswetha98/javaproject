 package client;
public class Patterns
  {
 public void Pattern1(int rows)
	 { 
	 int i,j;
	 for(i=1;i<=rows;i++)
	   {
		 int k=1;
		 for(j=1;j<=rows+i;j++)
		  {
			 if(j<(rows-i-1))
			 {
		  System.out.println("");
		   }
			 else
		    {
		  System.out.print(""++k);
		  if(j<rows-1)
		  {
		 System.out.println("");
		 k++;
	    }
		  else
		  {
			  System.out.prinln("");
		  }
		 }
		  }
	   }
	 }
public void Pattern2(int n)
{
	
}