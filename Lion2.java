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
public class Lion2 extends Animal2{
	private String lionName;
	
	public Lion2 (String theName) {
		
		lionName = theName;
		System.out.println("The Name of the Lion is " + lionName);
				
}
public void roar()
	{
		System.out.println("The lion is Roaring");
	}
	
	public void sleep()
	{
		System.out.println("The lion is Sleeping");
	}
	
	public void eat()
	{
		System.out.println("The lion is Eating");
	}
	public void move()
	{
		System.out.println("The lion is Sitting");
	}
} // end class	
