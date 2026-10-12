package UserDefineCodes;

public class MyClass2 {
	//NP Parameter NO Return
	
	public void m1() {
		System.out.println("My logic-1");
	}
     
	
	//Parameter NO Return
	
	public void m2(int a, int b) {
	 System.out.println("sum"+(a+b));	
	}
	
//int a, int b => parameters
//10,20=>arguments


//No Parameter Return

public int m3() {
	int a=10,b=20,c=a+b;
	return c;
}
  
// Parameter Return
  
public int m4(int a, int b) {
	return a+b;
}

	
}