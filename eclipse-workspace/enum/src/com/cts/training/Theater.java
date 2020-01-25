package com.cts.training;

public enum Theater 
 {
 SILVER,
 GOLD,
 PLATINUM;
 public  int getcost()
   {
	 if(this == SILVER)
	 return 100;
	 if(this == GOLD)
		 return 200;
	 if(this == PLATINUM)
		 return 300;
	 return 0;
   }
}
 
