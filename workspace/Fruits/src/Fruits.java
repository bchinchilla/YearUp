
public class Fruits 
{

	public static void main(String[] args) 
	{
		 
		 String[] fruits = new String[3];
		 
			 fruits[0] = "Orange";
			 fruits[1] = "Apple";
			 fruits[2] = "Grape";
			 		 
			 int index = 0;
			 
			 while(index<fruits.length)
			 {
				 if(fruits[index]=="Apple")
				 {
					 System.out.println(fruits[index]); 
				 }
				 index++;
		
			 }
			 
			 for( int index2 = 0; index2<fruits.length; index2++)
			 {				 
				 System.out.println(fruits[index2]);
			 }
			 
		
	}

}	