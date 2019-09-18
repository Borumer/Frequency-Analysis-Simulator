package alphastats;

public final class AlphabeticalStatistics {
	public static char[] DOUBLE_LETTERS = {'l', 's', 'e', 'o', 't'};
	private AlphabeticalStatistics() {
		
	}
	
	/**
	 * Checks if a word has double letters
	 * @param text the string of text that the operation is performed upon
	 * @param letter the letter that is checked for two-in-a-row repetition
	 * @return a boolean that indicates if the word has the specified double letter
	 * @throws UndoubleableLetterException custom exception if the letter passed in is not possible to be in double letters in the English language
	 * 
	 */
	public static boolean hasDoubleLetters(String text, char letter) {
		try
		{
		     if(new String(DOUBLE_LETTERS).contains(String.valueOf(letter)))
		     {
		    	 return text.indexOf("" + letter + letter) != -1;
		     }
		     
		     throw new UndoubleableLetterException();
		}
		catch(UndoubleableLetterException ex)
		{
		    // Process message and return default value
			System.out.println(ex.getMessage());
			return false;
		}
		
	}
}