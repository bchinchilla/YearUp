//import java.lang.Math;

public class ExceptionCentral 
{
	//THIS IS THE EXAMPLE CODE, MINE IS BELOW
	/*public static void main(String[] args)
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
		double sqroot = Math.sqrt(number);
		
		if(!(sqroot > 0))
		{
			throw new ArithmeticException();
		}
		return sqroot;
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
		catch(NullPointerException nullPtrEx)
		{
			System.out.println("array passed in is null");
			nullPtrEx.printStackTrace();
		}
	}*/
	
	
	//MY CODE IS BELOW
	public static void main(String []args)
	{
		ExceptionCentral Exception = new ExceptionCentral();
		Exception.Division(10, 0);
		Exception.NullString();
		
		try
		{
			Exception.Division(10, 0);
		}
		catch(ArithmeticException e)
		{
			System.err.println("ArithmeticException: " + e.getMessage());
		}
		
		try
		{
			Exception.NullString();
		}
		catch(NullPointerException e)
		{
			System.err.println("NullPointerException: " + e.getMessage());
		}
		
		try
		{
			Exception.Array(null);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
		}
	}
	
	int Division(int numerator, int denominator) throws ArithmeticException
	{
		numerator = 10;
		denominator = 0;
		
		int Result = numerator/denominator;
		return Result;
	}
	
	void NullString() throws NullPointerException
	{
		String S = null;
		System.out.println(S.toString());
	}
	
	void Array(int[] array)
	{
		try
		{
			for (int i = 0; i < 3; i++)
			{
				System.out.println(array[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
		}
	}
	
 }
