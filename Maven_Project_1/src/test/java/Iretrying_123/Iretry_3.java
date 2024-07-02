package Iretrying_123;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretry_3 implements IRetryAnalyzer
{
	
	int count =0;
	int retry=3;
	

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
