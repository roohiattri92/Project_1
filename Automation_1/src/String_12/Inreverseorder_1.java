package String_12;

public class Inreverseorder_1 {

	public static void main(String[] args) {
String q="My Name Is ramanpreet kaur";
System.out.println(q.length());
System.out.println(q.substring(7));
System.out.println(q.equals("Name"));
for(int i=q.length()-1;i>=0;i--)
{
	System.out.print(q.charAt(i));
	System.out.println(q.indexOf(i));
}
	}

}
