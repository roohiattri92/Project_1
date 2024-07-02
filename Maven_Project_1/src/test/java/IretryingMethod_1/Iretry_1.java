package IretryingMethod_1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretry_1 implements IRetryAnalyzer
{
	
	int count= 0;
	int retry= 1;
	

	@Override
	public boolean retry(ITestResult result) 
	{
		while(count<retry)
		{
			count++;
		
		return true;
		}
		
		return false;
	}



}
