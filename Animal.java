//****************************************************//
//* Author:1717859                                   *//
//* Week:5                                           *//
//* Task:4A                                          *//
//* Description:A program that  Animal superclass   *//
//*             which has the following variables   *//
//*             and two Methods                      *//
//*                                                   *//
//*Date: 15/03/2019                                   *//
//*                                                  *//
//*                                                  *//
//****************************************************//

public class Animal {
	//Those are my declared and explictly 
	//in1itialized instance filds
	private boolean isAPet = true;
	public static String owner ="John";
	//superclass method sleep() which
	//is inherited to the subclass(es)
	public void sleep()
	{
		System.out.println("Sleeping");
	}
	//---------------------------------------//
	
	//Super class method eat(Which
	//is inherited to the subclass
	public void  eat()
	{
		System.out.println("Eating");
	}

}//end class
