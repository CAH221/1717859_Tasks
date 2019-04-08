//****************************************************//
//* Author:1717859                                   *//
//* Week:1                                           *//
//* Task:1C                                          *//
//* Description:A program that inputs three numbers  *//
//*             Puts numbers in ascending order     *//
//*             calculates the sum                  *//
//*             then displays their average.         *//
//*                                                  *//
//* Date: 15/02/2019                                 *//
//*                                                  *//
//*                                                  *//
//****************************************************//

package Taskb;
import java.util.Scanner;
public class Task1C {

		public static void main(String args[])
		{
			 // Declaring the field Variables
			  int num1;
		      int num2;
		      int num3;
		      int sum;
		      double average =0;
		      int divider = 3;
		     
		      //Variables are initialized
		      num1= 0;
		      num2= 0;
		      num3= 0;
		      sum= 0;
		      
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
		      
		      //Calculates numbers entered by the user and displays them from smallest to largest
		      if(num1<num2 && num1<num3)
		      {
		         System.out.println(num1);
		         if(num2<num3){
		            System.out.println(num2);
		            System.out.println(num3);
		        }
		      else {
		            System.out.println(num3);
		            System.out.println(num2);
		        }
		      }
		      else if(num2<num1 && num2<num3)
		      {
		           System.out.println(num2);
		           if(num1<num3) {
		              System.out.println(num1);
		              System.out.println(num3);
		           }
		      else {
		           System.out.println(num3);
		           System.out.println(num1);
		         }
		      }
		      else
		      {
		            System.out.println(num3);
		            if(num1<num2) {
		                System.out.println(num1);
		                System.out.println(num2);
		             }
		      else {
		           System.out.println(num2);
		           System.out.println(num1);
		        }
		      }
		      		//Add Numbers then store total in sum
                    sum = num1 + num2 +num3;
		      //The divider is set to 3 so if not equal to zero then continue
		      if (divider !=0)
		      {   
		    	  //sum total / divider then stored in average
		    	  average = sum/divider;
		      }
		      else
		      {   
		    	  //Default case for code stability
		    	  System.out.println("System Error");
		      }
		      	     
		      //Displays Answer 
		      System.out.printf("The average is: " + average);
		      System.out.printf("%n");
		      System.out.printf("The sum is: " + sum );
		      	      
		}
	} //End Of Class


	
	
	

