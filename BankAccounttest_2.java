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

import javax.swing.*;

public class BankAccounttest_2 
{
	  private static BankAccount_1 account1; //= new BankAccount_1("Will Street", 500);
	  private static BankAccount_1 account2; //= new BankAccount_1("John Blue", 5.96); 
	  private static BankAccount_1 account3; // = new BankAccount_1("Adam Smith", 1.0); 
	
	  private static JFrame myFrame;
	  
	  private static String account1_Name;
	  private static double account1_Balance;
	  private static String account2_Name;
	  private static double account2_Balance;
	  private static String account3_Name;
	  private static double account3_Balance;
	  /*
	   * javax.swing and methods showMessageDialog, and showInputDialog of the class
JOptionPane for inputting the names and balances, and for displaying the output of your
class BankAccountTest.
	   */
		
		   public static void main(String args[])
		   {
			   
			   account1_Name = JOptionPane.showInputDialog(myFrame, "Please, enter the account name: ");			   
			   
			   account1_Balance = Double.parseDouble(JOptionPane.showInputDialog(myFrame, "Please, enter the initial account balance: "));
			   
			   account1 = new BankAccount_1(account1_Name, account1_Balance);
			   
			  // display initial balance of each object			  
		      JOptionPane.showMessageDialog(myFrame, "The account name is:  " + account1.getName() + " and the balance of the account is:£" + account1.getBalance());
		      
			   account2_Name = JOptionPane.showInputDialog(myFrame, "Please, enter the account name: ");			   
			   
			   account2_Balance = Double.parseDouble(JOptionPane.showInputDialog(myFrame, "Please, enter the initial account balance: "));
			   
			   account2 = new BankAccount_1(account2_Name, account2_Balance);
			   
			  // display initial balance of each object			  
		      JOptionPane.showMessageDialog(myFrame, "The account name is:  " + account2.getName() + " and the balance of the account is:£" + account2.getBalance());
			   
		      account3_Name = JOptionPane.showInputDialog(myFrame, "Please, enter the account name: ");			   
			   
			   account3_Balance = Double.parseDouble(JOptionPane.showInputDialog(myFrame, "Please, enter the initial account balance: "));
			   
			   account3 = new BankAccount_1(account3_Name, account3_Balance);
			   
			  // display initial balance of each object			  
		      JOptionPane.showMessageDialog(myFrame, "The account name is:  " + account3.getName() + " and the balance of the account is:£" + account3.getBalance());
			   
		      
		   } 
		 
	
	
		
		} //End Class


