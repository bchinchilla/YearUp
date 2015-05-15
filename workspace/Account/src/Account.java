
public class Account 
	{
		private int m_accountId = -1;
		private String m_accountName;
		private int m_customerId = -1;
		private double m_amount = 0.0;

		public Account(int accountId, String accountName, int customerId)
		{
			SetAccountId(accountId);
			SetAccountName(accountName);
			SetCustomerId(customerId);
		}

		public int GetAccountId()
		{
			return m_accountId;
		}

		private void SetAccountId(int accountId)
		{
			m_accountId = accountId;
		}
  
		public String GetAccountName()
		{
			return m_accountName;
		}

		private void SetAccountName(String accountName)
		{
			m_accountName = accountName;
		}
		public double GetAmmount()
		{
			return m_amount;
		}
		
		private void SetAmount(double amount)
		{
			m_amount = amount;
		}
		
		private  void UpdateAmount(double newAmount)
		{
			SetAmount(newAmount);
		}
		
		private void SetCustomerId(int customerId)
		{
			m_customerId = customerId;
		}

		public int GetCustomerId()
		{
			return m_customerId;
		}
		
		public void UpdateAmountSecurely(double newAmount, String password)
		{
			if (password != null) //always do a null check
			{
				if (password.equals("admin"))
				{
					UpdateAmount(newAmount);
	System.out.println("Updated amount in account id " + m_accountId + " to " + m_amount);
				}
				else
				{
					System.out.println("Call the police! Unsecure access!!");
				}
			}
		}
	}