//****************************************************//
//* Author:1717859                                   *//
//* Week:5                                           *//
//* Task:4A                                          *//
//* Description:A program Cat extends animal         *//
//*                                                  *//
//*                                                  *//
//*                                                   *//
//*Date: 15/03/2019                                   *//
//*                                                  *//
//*                                                  *//
//****************************************************//
public class Cat extends Animal
{

	//Declare Instance fields
			//for my subclass dog
			private String name;
			
			//sub class constructor
			
			public Cat(String theName)
			{
				name = theName;
				System.out.println("The name of the Cat is:"+theName);
			}
			//subclass new method bark 
			//not inherited from the super
			public void Meow()
			{
				System.out.println("Meoow!");
			}
			
			
}
