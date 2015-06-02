
public class Loops 
{
	
	public static void main(String [] args)
	{
	 int[] searchArray = {13, 8, 13, 2, 6, 44, 13};
	 int x = 13;
	 
	 Loops Check = new Loops();
	 Check.Search(searchArray, x);
	 Check.Search2(searchArray, x);
	}
	
	public void Search(int[] searchArray, int x)
	{
		for(int i = 0; i < searchArray.length; i++)
		{
			if( x == searchArray[i] )
			{
				System.out.println("I found the number you are looking for " + x);
				break;
			}
			else
			{
				System.out.println("I did not find the number you are looking for" );
			}
		}
	}
	
	public void Search2(int[] searchArray, int x)
	{
		int a = 0;
		int b = 0;
		while(a < searchArray.length)
		{
			if (x == searchArray[a])
			{
				b++;
			}
			a++;
		}
		System.out.println("I found the number you are looking for " + x);
		System.out.println("I found this number this many times: " + b);
	}
}