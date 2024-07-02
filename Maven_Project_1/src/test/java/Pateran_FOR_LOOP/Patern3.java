package Pateran_FOR_LOOP;

public class Patern3 {

	public static void main(String[] args) 
	{
		int i, j,f;
		int n=9;
		for(i=1;i<=9;i++)
		{
			
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
				
			}
			for(f=1;f<=i*2-1;f++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
			
		}

	}

}
