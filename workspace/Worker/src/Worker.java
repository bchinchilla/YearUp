
public class Worker 
{
	protected String m_work = "I do any kind of work";
	
	void DoWork()
	{
		System.out.println(m_work);
	}
	
	public static void main(String[] args)
	{
		Worker Rosalina = new Worker();
		System.out.println("Rosalina says: ");
		Rosalina.DoWork();
		
		Doctor DrMario = new Doctor();
		DrMario.DoWork();
		
		Surgeon Shiek = new Surgeon();
		Shiek.DoWork();
		
		Lawyer Marth = new Lawyer();
		Marth.DoWork();
		
		Programmer Lucas = new Programmer();
		Lucas.DoWork();
		
		WebProgrammer Ness = new WebProgrammer();
		Ness.DoWork();
	}
}
