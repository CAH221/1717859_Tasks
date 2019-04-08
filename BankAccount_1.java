//****************************************************//
//* Author:1717859                                   *//
//* Week:3                                           *//
//* Tutorial Task:2                                 *//
//* Description:Bank Account test                    *//
//*                                                  *//
//* Date: 14/02/2019                                 *//
//*                                                  *//
//*                                                  *//
//****************************************************//
public class BankAccount_1 {
	
	   private String name; // instance fields (class variables) 
	   private double balance; // instance variable 
	   

	   // Account constructor that receives two parameters  
	   
	   // write comments about why the instance fields need not to be static
	   
	   public BankAccount_1(String theName, double theBalance)
	   {
	      name = theName; // assign name to instance variable name
	      balance = theBalance;
          
	      // validate that the balance is greater than 0.0; if it's not,
	      // instance variable balance keeps its default initial value of 0.0
	      if (balance > 0.0) 
	      { // if the balance is valid
	    	  balance = theBalance; // assign it to instance variable balance
	      
	      }
	      else//Always use a default case for code stability
	      {
	    	  System.out.println("Invalid Balance");
	      }
	   }

	   // method that deposits (adds) only a valid amount to the balance
	   public void payIn(double depositAmount) 
	   {      
	      if (depositAmount > 0.0) 
	      { // if the depositAmount is valid
	         balance = balance + depositAmount; // add it to the balance 
	      }
	      else//Always use a default case for code stability
	      {
	    	  System.out.println("Invalid Balance");
	      }
	   }
	   // method returns the account balance
	   public double getBalance() 
	   {
	      return balance; 
	   } 

	   // method that sets the name
	   public void setName(String aName) 
	   {
	      name = aName; 
	   } 

	   // method that returns the name
	   public String getName() 
	   {
	      return name; 
	   } 
	}//End Class


