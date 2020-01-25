package pattern;
import java.util.*;
 class pyramid  
{
	 
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	int a,j,k,n;
	n=sc.nextInt();
	a=n;
   for(int i=1;i<=n;i++,a--)
   {
	 for(int sp=a-1;sp>0;sp--) 
	 {
	  System.out.print(" ");
	 }
	 for(j=1;j<=i;j++)
	 {
	  System.out.print(j);
	 }
	 for(k=j-2;k>0;k--)
	 {
	  System.out.print(k);
	 }
	 System.out.println();
   }
}
}
