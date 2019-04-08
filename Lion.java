//****************************************************//
//* Author:1717859                                   *//
//* Week:5                                           *//
//* Task:4A                                          *//
//* Description:A program Lion extends animal         *//
//*                                                  *//
//*                                                  *//
//*                                                   *//
//*Date: 15/03/2019                                   *//
//*                                                  *//
//*                                                  *//
//****************************************************//
public class Lion extends Animal {

	//Declare Instance fields
		//for my subclass dog
		private String name;
		private static String lionOwner;
		
		//sub class constructor
		
		public Lion(String theName)
		{
			name = theName;
			System.out.println("The name of the lion is:"+theName);
			
			lionOwner = super.owner;
			System.out.println("The name of the lion is:"+lionOwner);
		}
		//subclass new method Roar 
		//not inherited from the super
		public void roar()
		{
			System.out.println("Roooooooar!");
		}
}
