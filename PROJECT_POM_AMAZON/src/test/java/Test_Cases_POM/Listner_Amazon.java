package Test_Cases_POM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner_Amazon implements ITestListener 
{
  WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		
		TakesScreenshot t=(TakesScreenshot)driver;
		   File source=	t.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\roohi\\eclipse-workspace\\PROJECT_POM_AMAZON\\Screenshot_AmazonPROJECT\\"+ "TestCase.Pass.png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		
		TakesScreenshot t=(TakesScreenshot)driver;
		   File source=	t.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\roohi\\eclipse-workspace\\PROJECT_POM_AMAZON\\Screenshot_AmazonPROJECT\\Screenshot\\"+ "TestCase.Fail.png");
			try {
				FileHandler.copy(source, destination);
			} catch (IOException e) 
			{
				System.out.println("test case is fail");
			}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
		Reporter.log("test case is failed");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	

}


