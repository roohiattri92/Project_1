package string_fx;

public class Interview_que 
{

	public static void main(String[] args) {
		String s1= "Pankaj Prasad";

		String word[] = s1.split("");

		String w1= word[0];

		String w2=word [1];

		System.out.println(w1);

		

		for (int i=w1.length()-1;i>=0;i--)

		{

			System.out.print(w1.charAt(i));

		}

		for (int j=w2.length()-1;j>=0; j--)

		{

			System.out.println(w2.charAt(j));

		}


	}

}
