package UserDefineCodes;

public class LaunchCLass2 {

	public static void main(String[] args) {
		
		MyClass2 r = new MyClass2();
		r.m1();
		r.m2(10,20);
		
		int result=r.m3();
		System.out.println("main:="+result);
		
		result=r.m4(10, 20);
		System.out.println("main:="+result);


	}

}
