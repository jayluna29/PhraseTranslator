
public class Driver 
{
	public static void main(String [] args)
	{
		System.out.println("Phrase Translator");
		
		//Phrase phrase1 = new Phrase("Hello", "Hola");
		//Phrase phrase2 = new Phrase("Goodbye", "Adios");
		
		//System.out.println(phrase1.toString());
		//System.out.println(phrase2.toString());

		PhraseTranslator pt = new PhraseTranslator("../1000phrases.txt");
		pt.printTranslation("cat");
		pt.printTranslation("dog");
		pt.printTranslation("dfa");
		
	}

}
