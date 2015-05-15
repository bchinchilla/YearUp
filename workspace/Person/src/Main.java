
public class Main 
{
	public static void main(String [] args)
	{ 
		Person Chinchilla = new Person ("Brian", 20, "678-435-1608", "2300 Country Walk apt. 1021");
		System.out.println(Chinchilla.GetName());
		System.out.println(Chinchilla.GetAge());
		System.out.println(Chinchilla.GetPhoneNumber());
		System.out.println(Chinchilla.GetAddress()); 
		Chinchilla.GrowsOlder();
		System.out.println(Chinchilla.GetAge());
		
	}
}
