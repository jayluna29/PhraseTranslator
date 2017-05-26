import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class PhraseTranslator
{
	private HashMap <String,Phrase> phrases;
	
	public PhraseTranslator(String pathToFile)
	{
		phrases = new HashMap<String,Phrase>();
		
		readPhrases(pathToFile);
	}
	
	public void printTranslation(String nativeWord)
	{
		if(phrases.containsKey(nativeWord))
		{
			Phrase phrase = phrases.get(nativeWord);
			System.out.println(phrase.toString());
			System.out.println();
		}
		else
		{
			System.out.printf("The word %s is not present", nativeWord);
			System.out.println();
		}
	}
	private void readPhrases(String pathToFile)
	{
		try
		{
			FileReader fileReader;
			BufferedReader bufferedReader;
			
			fileReader = new FileReader(pathToFile);
			bufferedReader = new BufferedReader(fileReader);
			
			String line = bufferedReader.readLine();
			
			while(line != null)
			{
				String[] phraseArray = line.split(" ::: ");
				
				Phrase phrase = new Phrase(phraseArray[0], phraseArray[1]);
				
				phrases.put(phrase.getNativeWord(), phrase);

				System.out.println(line);
				
				line = bufferedReader.readLine();
			}
			bufferedReader.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.printf("Sorry file %s not found", pathToFile);
			System.exit(0);
		}
		catch(IOException e)
		{
			System.out.println("Error reading file");
			System.exit(0);
		}
		
	}

}
