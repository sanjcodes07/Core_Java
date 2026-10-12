package thiskey;

import java.util.Scanner;

public class Demo {
	
      public int bal=1010;
      
      //Accessor/getter
      public int access() {
    	  
    	  
    	 Scanner s = new Scanner(System.in);
    	 
    	  System.out.println("Enter Ur PIN");
    	  int pin=s.nextInt();
    	  if(pin==1999)
    		  return bal;
    	  else
    		  return 0;
      }
      
      //Mutator/setter
      public void mutator(int bal) {
    	this.bal=bal;
      }

	// public int getBal() {
		//  return bal;
	 // }

	 // public void setBal(int bal) {
		//  this.bal = bal;
	 // }
    	  
    	  
    	 
    	 
}
