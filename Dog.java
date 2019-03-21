
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
		System.out.println("Woof");
	}
	

}
