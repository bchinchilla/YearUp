
public class Person 
	{
		public String m_name;
		public int m_age;
		public String m_phoneNumber;
		public String m_address;
	
		public Person(String name, int age, String phoneNumber, String address)
		{
			SetName(name);
			SetAge(age);
			SetPhoneNumber(phoneNumber);
			SetAddress(address);
		}
			private void SetName(String name)
			{
				m_name = name;
			}
			
			public String GetName()
			{
				return m_name;
			}
			
			private void SetAge(int age)
			{
				m_age = age;	
			}
			
			public int GetAge()
			{
				return m_age;
			}
			
			private void SetPhoneNumber(String phoneNumber)
			{
				m_phoneNumber = phoneNumber;
			}
			
			public String GetPhoneNumber()
			{
				return m_phoneNumber;
			}
			
			private void SetAddress(String address)
			{
				m_address = address;
			}
			
			public String GetAddress()
			{
				return m_address;
			}
			
			public void GrowsOlder()
			{
				m_age++;
			}
			
}
