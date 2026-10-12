package first_project;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
//         int i;
//         for(i=10; i<=10; i++){
//         System.out.println("Hello");
//}
	
      //  int i;
        //for(i=10; i<=10; i=i+1) {
        //System.out.println("Hello");
        //}
		
		//nested for loop
		//int i,j,count=1;
		//for(i=1;i<=5;i++) {
			//for(j=1;j<=5;j++) {
				//System.out.println("Hello"+count);
				//count++;
		//	}
		//}
          
		
		Scanner scan=new Scanner(System.in);
		int i;
		for(i=1;i<=10;) {
			System.out.println("Hello");
			System.out.println("y-1/n-2");
			int choice=scan.nextInt();
			if(choice==2) {
				break;
			}

		}
	
	}

}
