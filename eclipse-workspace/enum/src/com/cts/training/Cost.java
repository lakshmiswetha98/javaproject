package com.cts.training;

public class Cost {
   public static void main(String args[])
   {
	 Theater silver=Theater.SILVER;
	 Theater gold=Theater.GOLD;
	 Theater platinum=Theater.PLATINUM;
	 System.out.println("The cost for silver is:" +Theater.SILVER.getcost());
	 System.out.println("The cost for gold is:" +Theater.GOLD.getcost());
	 System.out.println("The cost for platinum is:" +Theater.PLATINUM.getcost());
  
    }
}
