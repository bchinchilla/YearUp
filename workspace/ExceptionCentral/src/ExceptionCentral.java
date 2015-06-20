import java.lang.Math;

public class ExceptionCentral 
{
	public static void main(String[] args)
	{
		ExceptionCentral exceptionCentral = new ExceptionCentral();
		
		try
		{
			exceptionCentral.Divide(50, 0);
		}
		catch(Exception ex)
		{
			System.out.println("could not do the division");
		}
		
		//exceptionCentral.PrintSomething(null);
		int[] array = {1,2,3};
		exceptionCentral.PrintArrayValues(array);
		
		double a = Math.sqrt(-50);
		System.out.println(a);
		
	}
	
	int Divide(int number, int divisor) throws ArithmeticException
	{
		int qoutient = number/divisor;
		return qoutient;
	}
	
	double SquareRoot(double number) throws ArithmeticException
	{
		
		return number;
	}
	
	void PrintSomething(String someString) throws NullPointerException
	{
		String smallString = someString.toLowerCase();
		System.out.println(smallString);
	}
	
	void PrintArrayValues(int[] array)
	{
		try 
		{
			for (int i = 0; i < 10; i++)
			{
				System.out.println(array[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexEx)
		{
			System.out.println("array passed in did not have 10 slots");
			System.out.println(arrayIndexEx);
			//arrayIndexEx.printStackTrace();
		}
	}
	
 }
