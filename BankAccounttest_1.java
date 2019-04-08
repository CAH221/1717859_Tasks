//****************************************************//
//* Author:1717859                                  *//
//* Week:3                                          *//
//* Tutorial Task 2                                 *//
//* Description:Display and read in balance          *//
//*read in details                                   *//
//* Date: 14/02/2019                                 *//
//*                                                  *//
//*                                                  *//
//****************************************************//

import java.util.Scanner;
public class BankAccounttest_1 
{
	  private static BankAccount_1 account1 = new BankAccount_1("", 0.0);
	  private static BankAccount_1 account2 = new BankAccount_1("", 0.0); 
	 
	   
	
		
		   public static void main(String args[])
		   {
			  // display initial balance of each object			  
		      System.out.printf("%s balance: £%.2f%n",
		         account1.getName(), account1.getBalance()); 
		      System.out.printf("%s balance: £%.2f%n%n",
		         account2.getName(), account2.getBalance()); 
		      
		   } 
		} //End Class


