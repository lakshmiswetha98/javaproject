package evenodd;

import java.util.Scanner;

public class Name {
	public static void main(String args[])
	{
		String name;
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name:");
		name=sc.nextLine();
		if(!name.matches("^[a-zA-Z]*$"))
		System.out.println("Invalid name");
		System.out.println("Enter the age:");
		age=sc.nextInt();
	    
		System.out.println("Hello, my name is:"+name+ " , "+ "My age is :"+age);
		
	}
}
