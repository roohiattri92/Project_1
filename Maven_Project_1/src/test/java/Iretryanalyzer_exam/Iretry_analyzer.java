package Iretryanalyzer_exam;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretry_analyzer implements IRetryAnalyzer
{
	int count=0;
	int retry= 2;
	
	

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
