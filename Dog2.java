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
public class Dog2 extends Animal2
{

	        //Declare Instance fields
			//for my subclass Dog2
			private String name;
			
			//sub class constructor
			
			public Dog2(String theName)
			{
				name = theName;
				System.out.println("The name of the dog is:"+theName);
			}
			//subclass new method bark 
			//not inherited from the super
			public void Bark()
			{
				System.out.println("Woof!");
			}
			public void sleep()
			{
				System.out.println("The Dog is Sleeping");
			}
			
			public void move()
			{
				System.out.println("Running");
			}
}//end Class
