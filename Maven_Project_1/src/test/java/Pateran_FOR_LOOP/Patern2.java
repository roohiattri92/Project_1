package Pateran_FOR_LOOP;

public class Patern2 {

	public static void main(String[] args) 
	{
		int i,j;
		int n=5;
		int r=0;
		for(i=n;i>=1;i--)
			
		{
			
			for(j=1;j>=i;j--)
			{
				
				System.out.print(j);
				
			}
			System.out.println(" ");
			i--;
		}

	}

}
