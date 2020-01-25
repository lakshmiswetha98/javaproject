package swapping;

import java.util.Scanner;

public class swap {
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("before swapping:"+a + +b);
		c=a;
		a=b;
		b=c;
		System.out.println("after swapping:"+a + +b);
	}

}
