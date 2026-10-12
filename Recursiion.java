package com.methods;

public class Recursiion {
         
	   int k=1;
	public void m1() {
		System.out.println("hello");
		
		if(k<10) {
			k++;//2
		
		m1();//recursion
		}
	}

}
