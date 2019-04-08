//****************************************************//
//* Author:1717859                                   *//
//* Week:5                                           *//
//* Task:4A                                          *//
//* Description:A program Dog extends animal         *//
//*                                                  *//
//*                                                  *//
//*                                                   *//
//*Date: 15/03/2019                                   *//
//*                                                  *//
//*                                                  *//
//****************************************************//
public class Dog extends Animal 
{
	//Declare Instance fields
	//for my subclass dog
	private String name;
	private static String dogOwner;
	//sub class constructor
	
	public Dog(String theName)
	{
		name = theName;
		System.out.println("The name of the dog is:"+theName);
		
		dogOwner = super.owner;
		
		System.out.println("The owner is:"+dogOwner);
	}
	//subclass new method bark 
	//not inherited from the super
	public void bark()
	{
		System.out.println("The dog");
	}
	

}//end class
