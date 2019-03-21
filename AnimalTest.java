
public class AnimalTest 
{

	//initiate the objects of the subclass dog 
	//Lion and cat of the superclass
   private static Dog myDog = new Dog("Lucky");
   private static Lion myLion = new Lion("LionKing");
   private static Cat myCat = new Cat("Lucky");
   
   
   
	public static void main(String[] args)
	{
		//test my instansieted subclass objects
		//test the sound check method bark and sleep
		myDog.bark();
		myDog.sleep();
		
	}
}
