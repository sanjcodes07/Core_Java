package first_project;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
          int num1,num2;
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter Num1: ");
          num1=sc.nextInt();
          System.out.print("Enter Num2: ");
          num2=sc.nextInt();
          
          System.out.println("press 1-add\npress2-sub\npress 3-multiply\npress 4-div");
          
          System.out.print("enter your choice: ");
          int choice=sc.nextInt();
          
          switch(choice) {
          case 1:
        	  System.out.println("output: "+(num1+num2));
        	  break;//jump control statement:break statement
          case 2:
        	  System.out.println("output: "+(num1+num2));
        	  break;

          case 3:
        	  System.out.println("output: "+(num1+num2));
        	  break;

          case 4:
        	  System.out.println("output: "+(num1+num2));
        	  break;

           default:
         	  System.out.println("output wrong");


        	  
          }

	}

}
