//****************************************************//
//* Author:1717859                                   *//
//* Week:5                                           *//
//* Task:4B                                          *//
//* Description:A program that  instantiates object  *//
//*             dog, lion and cat which extend the   *//
//*              class animal2                        *//
//*                                                   *//
//*Date: 15/03/2019                                   *//
//*                                                  *//
//*                                                  *//
//****************************************************//
public class Cat2 extends Animal2
{

	        //Declare Instance fields
			//for my subclass Cat
			private String name;
			
			//sub class constructor
			
			public Cat2(String theName)
			{
				name = theName;
				System.out.println("The name of the Cat is:"+theName);
			}
			//subclass new method Meoow 
			//not inherited from the super
			public void Meow()
			{  
				
				System.out.println("Meoow!");
			}
			
			public void move()
			{
				System.out.println("Running");
			}
}//end class
