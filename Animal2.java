//****************************************************//
//* Author:1717859                                   *//
//* Week:5                                           *//
//* Task:4B                                          *//
//* Description:A program that  instantiates abstract *//
//*             class dog, lion and cat which extend *//
//*              class animal                        *//
//*                                                   *//
//*Date: 15/03/2019                                   *//
//*                                                  *//
//*                                                  *//
//****************************************************//
public abstract class Animal2 {
	//Those are my declared and explicitly
		//initialized instance fields
		private boolean isAPet = true;
		public static String owner ="John";
		//superclass method sleep() which
		//is inherited to the subclass(es)
		public void sleep()
		{
			System.out.println("Sleeping");
		}
		//---------------------------------------//
		
		//Super class method eat(0Which
		//is inherited to the subclass
		public void  eat()
		{
			System.out.println("Eating");
		}
		//-------------------------------------//
		public void bark()

	      {

	           System.out.println("Woof!");

	      }
		//------------------------------------//
		
		public abstract void move();
		


}//end class
