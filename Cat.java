
public class Cat extends Animal 
{

	//Declare Instance fields
			//for my subclass dog
			private String name;
			
			//sub class constructor
			
			public Cat(String theName)
			{
				name = theName;
				System.out.println("The name of the lion is:"+theName);
			}
			//subclass new method bark 
			//not inherited from the super
			public void Meow()
			{
				System.out.println("Meoow!");
			}
}
