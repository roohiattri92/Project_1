package Programs;

public class Duplicate_word_remove {

	public static void main(String[] args)
	{
		String name="ramanpreet kaur";
		String result="";
		for(int i=0;i<name.length();i++)
		{
			String t=""+name.charAt(i);
		
			if( result.contains(t))
			{
				continue;
			}
			result+=t;
			System.out.println(t);

		}

	}

}
