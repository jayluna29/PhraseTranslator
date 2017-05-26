
public class Phrase 
{
	private String nativeWord;
	private String foreignWord;
	
	public Phrase(String nw, String fw)
	{
		setNativeWord(nw);
		setForeignWord(fw);
	}
	
	@Override
	public String toString()
	{
		return " Native Word: " + getNativeWord() + " Foreign Word: " + getForeignWord();
		
	}
	
	public void setNativeWord(String nw)
	{
		nativeWord = nw;
	}
	public String getNativeWord()
	{
		return nativeWord;
	}
	
	public void setForeignWord(String fw)
	{
		foreignWord = fw;
	}
	public String getForeignWord()
	{
		return foreignWord;
	}

}
