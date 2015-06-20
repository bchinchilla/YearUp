
public class Playlist 
{
	
	private Song[] m_songs = null;
	
	public static void main(String[] args) 
	{
		Playlist Dubstep = new Playlist();
		Dubstep.InitializePlayList();
		Dubstep.DisplayPlayList();
	}
	
	public void InitializePlayList()
	{
		m_songs = new Song[5];
		
		Song air = new Song("Air", 4, "Rogue");
		Song born = new Song("Born", 5, "MitiS");
		Song cataclysm = new Song("Cataclysm", 2, "Rogue");
		Song clarity = new Song("Clarity", 3, "Zedd");
		Song vain = new Song("Vain", 1, "Singularity");
		
		m_songs[0] = air;
		m_songs[1] = born;
		m_songs[2] = cataclysm;
		m_songs[3] = clarity;
		m_songs[4] = vain;
	}
	
	public void DisplayPlayList()
	{
		if (m_songs != null)
		{
			for (int i = 0; )
		}
		
	}
	

}
