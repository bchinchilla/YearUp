
public class ReverseString 
{

	public static void main(String[] args) 
	{
		String originalString = "hello";
		System.out.println(originalString);
		
		String reversedString = ReverseInPlace(originalString);
		System.out.println("The reverse of hello is: ");
		System.out.println(reversedString);
		
		String reversedString2 = ReverseOutOfPlace(originalString);
		System.out.println(reversedString2);
	}
	
	public static String ReverseInPlace(String originalString)
	{
		String reversedString = null;
		//hello becomes olleh
		
		if (originalString != null)
		{
			char[] originalStringCharacters = originalString.toCharArray();
			
			for (int i = 0, j = originalStringCharacters.length - 1; i < originalStringCharacters.length/2; i++, j--)
			{
				char temp = originalStringCharacters[j];
				originalStringCharacters[j] = originalStringCharacters[i];
				originalStringCharacters[i] = temp;
			}
			
			reversedString = new String(originalStringCharacters);
		}
		
		return reversedString;
	}
	
	public static String ReverseOutOfPlace(String originalString)
	{
		String reversedString = null;
		
		if (originalString != null)
		{
			char[] originalStringCharacters = originalString.toCharArray();
			char[] reversedStringCharacters = new char[originalStringCharacters.length];
			
			for (int i = 0, j = originalStringCharacters.length -1 ; i < originalStringCharacters.length; i++, j--)
			{
				reversedStringCharacters[j] = originalStringCharacters[i];
			}
			
			reversedString = new String(reversedStringCharacters);
		}
		
		return reversedString;
	}

}
