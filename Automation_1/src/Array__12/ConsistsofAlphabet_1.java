package Array__12;
import java.util.Arrays;
public class ConsistsofAlphabet_1 {
public static void main(String[] args) {
String name="My 2ame Is Ramanpreet Kaur";
boolean q = false;
char[] a1= name.toCharArray();

System.out.println(a1);
System.out.println(Arrays.toString(a1));
System.out.println(name.length());
for(int i=0;i<name.length();i++) 
{
	System.out.println(Character.isAlphabetic(a1[i]));
	System.out.println(Character.isDigit(a1[i]));
	//System.out.println(name.replaceAll(name, ""));

	/*q=Character.isAlphabetic(a1[i]);
}
if(q==true)
{
	System.out.println("yes this contains alphabets");
}
else
{
	System.out.println("Not contains Alphabets" );
}*/
	}
}
}



