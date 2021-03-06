
public class Banker implements ITaxPayer
{
	@Override
	public void PayTaxes(double taxRate) 
	{
		if (!m_donePayingTaxes)
		{
			double taxes = taxRate * GetIncome();
			double newIncome = GetIncome() - taxes;
			SetIncome(newIncome);
			m_donePayingTaxes = true;
		}
		else
		{
			System.out.println("Banker already paid taxes for this year");
		}
	}

	@Override
	public void FileTaxReturn() 
	{
		if (m_donePayingTaxes)
		{
			System.out.println("Banker has filed tax return");
		}

		else
		{
			System.out.println("Banker needs to taxes before filling return");
		}
	}

	public static void main(String[] args)
	{
		Banker blankfein = new Banker(5000000);
		blankfein.PayTaxes(.33);
		blankfein.FileTaxReturn();

		SchoolTeacher doblar = new SchoolTeacher(30000);
		doblar.PayTaxes(.23);
		doblar.FileTaxReturn();

		/*
	ITaxPayer taxPayer = doblar;
		taxPayer.PayTaxes(.23);
		taxPayer.FileTaxReturn();
		 */

		Scientist hawking = new Scientist(120000);
		hawking.PayTaxes(.28);
		hawking.FileTaxReturn();

		TaxAuditor tom = new TaxAuditor();
		tom.Audit(blankfein);
		tom.Audit(doblar);
		tom.Audit(hawking);

	}

	private double m_income;
	private boolean m_donePayingTaxes = false;

	public Banker(double income)
	{
		SetIncome(income);
	}	

	private void SetIncome(double income)
	{
		m_income = income;
	}

	public double GetIncome()
	{
		return m_income;
	}	
}
