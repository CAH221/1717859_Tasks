
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
		//subclass new method bark 
		//not inherited from the super
		public void roar()
		{
			System.out.println("Roooooooar!");
		}
}
