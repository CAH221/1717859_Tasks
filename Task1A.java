//****************************************************//
//* Author:1717859                                   *//
//* Week:1                                           *//
//* Task:1A                                          *//
//* Description:A program that inputs two numbers    *//
//*             then displays their sum.			 *//
//*                                                  *//
//* Date: 14/02/2019                                 *//
//*                                                  *//
//*                                                  *//
//****************************************************//
package task1;
import java.util.Scanner; //program uses class scanner
public class Task1A {
    //Main method begins execution of java application
	public static void main(String args[]) {
    	  //declare variables
		  int a;
	      int b;
	      int sum;
	         
	     //declare and initialize variables
	      a=0;
	      b=0;
	      sum=0;

	      //prompt
	      System.out.println("Enter two integers");
	      //Create Scanner to obtain input from the command window.
	      Scanner in = new Scanner(System.in);
	      
	      //read first number from user
	      a= in.nextInt();
	      //read second number from user
	      b = in.nextInt();
	      //add numbers then store total in sum
	      sum = a + b;
	      //display sum
	      System.out.printf("Sum: "+sum);
	      
	}//end Method Main
}//end Class Task1A
