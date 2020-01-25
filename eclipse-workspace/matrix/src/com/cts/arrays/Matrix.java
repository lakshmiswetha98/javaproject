package com.cts.arrays;

import java.util.Scanner;

public class Matrix
  {
public int arr[][];
public byte rows,cols;
public void initMatrix()
	   {
Scanner sc= new Scanner(System.in);
System.out.println("Enter no of rows:");
rows=sc.nextByte();
System.out.println("Enter no of columns:");
cols=sc.nextByte();
arr=new int[rows][cols];
for(byte i=0;i<rows;i++){
	System.out.println("Enter element for row-"+(i+1)+":");
	for(byte j=0;j<cols;j++){
	System.out.println("Enter element for column-"+(j+1)+":");
	arr[i][j]=sc.nextInt();
	    }
	}
	}
	public void display(){
	for(byte i=0;i<this.rows;i++){
	for(byte j=0;j<cols;j++){
	System.out.print(arr[i][j]+"");
	}
	System.out.println();
	}
	}
	public boolean isUnit(){
	for(byte i=0;i<rows;i++){
	for(byte j=0;j<cols;j++){
	if(arr[i][j]!=1){
	return false;
	}
	}
	}
	return true;
	}
	public void rowAddition(){
	int sum;
	for(byte i=0;i<rows;i++){
	sum=0;
	for(byte j=0;j<cols;j++){
	sum+= arr[i][j];
	}
	System.out.println(sum);
	}
	}

	Matrix matrix=new Matrix();
	matrix.init Matrix();
	Scanner sc=new Scanner(System.in);
	System.out.println("1.Display Matrix\n 2.Checkunitmatrixornot\n 3.findrowadditions\n Pleasechoose:");
	ch=sc.nextByte();
	if(ch==1||ch==2||ch==3){
	switch(ch){
	case1:matrix.display();
	break;
	case2:boolean b=matrix.isUnit();
	System.out.println("Given matrix isunit matrix:"+b);
	break;
	case3:matrix.rowAddition();
	break;
	}
	}
	else
	System.out.println("Choose a valid operation!!!");
}
                                                                             