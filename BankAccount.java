//****************************************************//
//* Author:1717859                                   *//
//* Week:3                                           *//
//* Tutorial Task:2                                 *//
//* Description:Student                              *//
//*                                                  *//
//* Date: 14/02/2019                                 *//
//*                                                  *//
//*                                                  *//
//****************************************************//
public class BankAccount {
	
	private String name;
	private double balance;



	//constructor
	public BankAccount(String theName, double theBalance)
	{
		if(theBalance < 0 )
		{
			System.out.println("Error Balance invalid");
		}
		else
		{
			System.out.println("Balance ");
		}
	}
}//end class