
public class SchoolTeacher implements ITaxPayer
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
			System.out.println("School teacher has filed tax return");
		}
		
		else
		{
			System.out.println("School teacher needs to taxes before filling return");
		}
	}
	
	private double m_income;
	private boolean m_donePayingTaxes = false;
	
	public SchoolTeacher(double income)
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
