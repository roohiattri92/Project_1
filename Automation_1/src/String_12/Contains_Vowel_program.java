package String_12;

public class Contains_Vowel_program {

	public static void main(String[] args) 
	{
		String name= "hello this is house of strange people";
		System.out.println(doesItcontainsVowel("hello this is house of strange people"));

	}

	private static boolean doesItcontainsVowel(String input) 
	{
		
		return input.toLowerCase().matches(".*[aioue]*.");
	}
	
	

}
