package IRetrying;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretryingprogram2 implements IRetryAnalyzer

{
	int count=0;
	int retry=3;
	

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
	if(count<retry)
		{
			count++;
			return true;
		}
		return false;
	}

}
