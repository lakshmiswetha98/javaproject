package com.cts.training.lib;

public class ArrayImplementation
 {
	public void average(int n,int a[])
	{
		int k=0,c=0;
	System.out.println("the size of array is:n");
	System.out.println("the elements of an array is");
	for(int i=0;i<n;i++)
	System.out.println("the elements of an array is a["+i+"]"+a[i]);
	c++;
	for(int i=0;i<n;i++)
	{
		if(a[i]%5==0)
		{
			k=a[i]+k;
		}
	}
	System.out.print("The elements of an array is :"+(k/c));
	}
	public void position(int n,int a[])
	{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
		if(a[i]>a[j])
		  {
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
		  }
	    }
     }
	System.out.print("The minimum elements of an array is :" +a[0]);
	}
 }
