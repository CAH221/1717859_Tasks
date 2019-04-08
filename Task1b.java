//****************************************************//
//* Author:1717859                                   *//
//* Week:1                                           *//
//* Task:1B                                          *//
//* Description:A program that inputs three numbers  *//
//*             calculates the average               *//
//*             then displays their sum.             *//
//*                                                  *//
//* Date: 15/02/2019                                 *//
//*                                                  *//
//*                                                  *//
//****************************************************//
package Taskb;
import java.util.Scanner;//program uses class scanner
public class Task1b {
	    //Main method begins execution of java application
		public static void main(String args[]) {
		
			 // Declaring the field Variables
			  int num1;
		      int num2;
		      int num3;
		      int sum;
		      double average;
		      int dividor = 3;
		     
		      //Variables are intialized 
		      
		      num1= 0;
		      num2= 0;
		      num3= 0;
		      sum= 0;
		      average = 0.0;
		      
		      //Reads Users input
		      Scanner in = new Scanner(System.in);
		     
		      //Asks for the first number, user enters
		      System.out.println("Enter a integer");
		      //Displays number the moves to second number 
		      num1 = in.nextInt();
		      
		      //Asks for the second number to be entered 
		      System.out.println("Enter a integer");
		      //Displays second number 
		      num2 = in.nextInt();
		      
		      //Asks for the third number to be entered 
		      System.out.println("Enter a integer");
		      //Displays second number 
		      num3 = in.nextInt();
		      
		      //Calculates the given numbers 
		      sum = num1 + num2 +num3;
		      
		      if (dividor !=0)
		      {
		    	  average = sum/dividor;
		      }
		      else
		      {
		    	  System.out.println("System Error");
		      }
		      	     
		      //Displays Answer 
		      System.out.printf("The average is: " + average);
		      System.out.printf("%n");
		      System.out.printf("The sum is: " + sum );
		      
		      
		}
	} //End Of Class
	
	
	


