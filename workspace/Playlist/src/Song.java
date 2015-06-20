
public class Song 
{
	private String m_songName;
	private int m_songRanking;
	private String m_artistName;
	

	public Song(String songName, int songRanking, String artistName)
	{
		SetSongName(songName);
		SetSongRanking(songRanking);
		SetArtistName(artistName);
	}
	
	
	private void SetSongName(String songName)
	{
		m_songName = songName;
	}
	
	public String GetSongName()
	{
		return m_songName;
	}
	
	
	private void SetSongRanking(int songRanking)
	{
		m_songRanking = songRanking;
	}
	
	public int GetSongRanking()
	{
		return m_songRanking;
	}
	
	
	private void SetArtistName(String artistName)
	{
		m_artistName = artistName;
	}
	
	public String GetArtistName()
	{
		return m_artistName;
	}
	
}
