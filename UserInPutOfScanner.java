package first_project;

import java.util.Scanner;

public class UserInPutOfScanner {

	public static void main(String[] args) {
		
          Scanner scan = new Scanner(System.in);//Now u can use Scanner class through scan var
          
          System.out.print("Enter a byte value: ");
          byte v1=scan.nextByte();
          System.out.println(v1);
          
          short v2=scan.nextShort();
          int v3=scan.nextInt();
          long v4=scan.nextLong();
          
          float v5=scan.nextFloat();
          double v6=scan.nextDouble();
          
          char v7=scan.next().charAt(0);
          boolean v8=scan.nextBoolean();
	}

}
//Scanner : need to import-> java.util.Scanner;
//System: Automatically java.lang.System
//String: Auuomatically java.lang.String