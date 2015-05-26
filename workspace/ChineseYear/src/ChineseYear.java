import java.util.Scanner;

public class ChineseYear 
{

	public static void main(String[] args) 
	{
		Scanner YearScanner = new Scanner(System.in);
		System.out.println("Enter A Year");
		int unknownYear = YearScanner.nextInt();
		
		ChineseYear YearOfAnimal = new ChineseYear();
		YearOfAnimal.EvaluateChineseYear(unknownYear);
		
		YearScanner.close();
	}
	
	public void EvaluateChineseYear(int unknownYear)
	{
		int s_knownYear = 1900;
		
		int yearDifference = unknownYear - s_knownYear;
		int remainder = yearDifference % 12;
		
		if (unknownYear >=1900)
		{
			switch(remainder)
			{
			case 0:
				System.out.println(unknownYear + " is the year of rat.");
				break;
			case 1:
				System.out.println(unknownYear + " is the year of ox.");
				break;
			case 2:
				System.out.println(unknownYear + " is the year of tiger.");
				break;
			case 3:
				System.out.println(unknownYear + " is the year of rabbit.");
				break;
			case 4:
				System.out.println(unknownYear + " is the year of dragon.");
				break;
			case 5:
				System.out.println(unknownYear + " is the year of snake.");
				break;
			case 6:
				System.out.println(unknownYear + " is the year of horse.");
				break;
			case 7:
				System.out.println(unknownYear + " is the year of sheep.");
				break;
			case 8:
				System.out.println(unknownYear + " is the year of monkey.");
				break;
			case 9:
				System.out.println(unknownYear + " is the year of rooster.");
				break;
			case 10:
				System.out.println(unknownYear + " is the year of dog.");
				break;
			case 11:
				System.out.println(unknownYear + " is the year of pig.");
				break;
			default:
				System.out.println("Error: This is not a valid year");
			}
		}

	}

}
